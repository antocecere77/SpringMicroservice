package com.appsdeveloperblog.photoapp.api.albums.ui.model;

import lombok.Data;

@Data
public class AlbumResponseModel {
    private String albumId;
    private String userId; 
    private String name;
    private String description;
}
