package org.mddarr.userrequestservice.user.web;


import lombok.Value;
import org.mddarr.userrequestservice.user.User;
import org.mddarr.userrequestservice.user.UserId;
import org.mddarr.userrequestservice.user.UserRole;

import java.util.Set;

@Value
public class UserDto {
    private final UserId id;
    private final String email;
    private final Set<UserRole> roles;

    public static UserDto fromUser(User user) {
        return new UserDto(user.getId(),
                           user.getEmail(),
                           user.getRoles());
    }
}
