package org.mddarr.userrequestservice.models.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostUserRequest {

    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;

}
