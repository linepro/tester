/*
 * 
 */
package com.linepro.marvel.impl;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Extension of DefaultUriBuilderFactory that creates
 * authenticated Uris for accessing the Marvel database.
 */
@Component
public class MarvelUriBuilderFactory extends DefaultUriBuilderFactory {

    /** The Constant for the time stamp element. */
    private static final String TS = "ts";
    
    /** The Constant for the API key element. */
    private static final String API_KEY = "apikey";
    
    /** The Constant for the hash element. */
    private static final String HASH = "hash";

    /** The api key. */
    @Value("${com.linepro.marvel.apiKey:9c0d0fbefa788421b599ea5823618c4b}")
    private String apiKey;

    /** The private key. */
    @Value("${com.linepro.marvel.privateKey:}")
    private String privateKey;

    /**
     * Instantiates a new marvel uri builder factory.
     * @param apiRoot the root uri for the Marvel database
     */
    public MarvelUriBuilderFactory(@Value("${com.linepro.marvel.apiRoot:https://gateway.marvel.com/v1/public/}") String apiRoot) {
        super(apiRoot);
    }

    /**
     * Appends authorization parameters to the request uri.
     * @param uri the request uri
     * @return the request uri with authorization parameters
     */
    private URI appendAuthorization(URI uri) {
        String callId = Long.toString(System.currentTimeMillis());

        return UriComponentsBuilder.fromUri(uri)
            .replaceQueryParam(TS, callId)
            .replaceQueryParam(API_KEY, apiKey)
            .replaceQueryParam(HASH, DigestUtils.md5DigestAsHex(String.join("", callId, privateKey, apiKey).getBytes()))
            .build(Collections.emptyMap());
    }

    @Override
    public URI expand(String uriTemplate, Map<String, ?> uriVars) {
        return appendAuthorization(super.expand(uriTemplate, uriVars));
    }

    @Override
    public URI expand(String uriTemplate, Object... uriVars) {
        return appendAuthorization(super.expand(uriTemplate, uriVars));
    }
}
