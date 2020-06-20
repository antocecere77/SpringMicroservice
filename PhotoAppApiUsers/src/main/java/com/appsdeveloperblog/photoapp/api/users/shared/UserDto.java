package com.appsdeveloperblog.photoapp.api.users.shared;

import com.appsdeveloperblog.photoapp.api.users.ui.model.AlbumResponseModel;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = 6033312336030589943L;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userId;
    private String encryptedPassword;
    private List<AlbumResponseModel> albums;
}
