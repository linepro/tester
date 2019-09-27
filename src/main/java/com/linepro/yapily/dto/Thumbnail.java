/*
 * 
 */
package com.linepro.yapily.dto;

import com.linepro.marvel.model.MarvelImage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Thumbnail.
 * Provides a defined format for GET characters/{id}
 */
@ApiModel(description = "A Marvel Thumbnail")
public class Thumbnail {
    
    /** The path. */
    private String path;
    
    /** The extension. */
    private String extension;

    /**
     * Instantiates a new thumbnail.
     */
    public Thumbnail() {
    }

    /**
     * Instantiates a new thumbnail.
     * @param path the path
     * @param extension the extension
     */
    public Thumbnail(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    /**
     * Instantiates a new thumbnail.
     * @param image the image
     */
    public Thumbnail(MarvelImage image) {
        this.path = image.getPath();
        this.extension = image.getExtension();
    }

    /**
     * Gets the path.
     * @return the path
     */
    @ApiModelProperty(notes = "The thumbnail path")
    public String getPath() {
        return path;
    }
    
    /**
     * Sets the path.
     * @param path the new path
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * Gets the extension.
     * @return the extension
     */
    @ApiModelProperty(notes = "The thumbnail type")
    public String getExtension() {
        return extension;
    }
    
    /**
     * Sets the extension.
     * @param extension the new extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    @Override
    public String toString() {
        return String.format("Thumbnail [path=%s, extension=%s]", path, extension);
    }
}
