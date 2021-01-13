package org.mddarr.userrequestservice.user.web;


import org.mddarr.userrequestservice.security.ApplicationUserDetails;
import org.mddarr.userrequestservice.user.User;
import org.mddarr.userrequestservice.user.UserNotFoundException;
import org.mddarr.userrequestservice.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService service;

    @Autowired
    public UserRestController(UserService service) {
        this.service = service;
    }

    //tag::post[]
    @PostMapping //<1>
    @ResponseStatus(HttpStatus.CREATED) //<2>
    public UserDto createOfficer(@RequestBody CreateOfficerParameters parameters) { //<3>
        User officer = service.createOfficer(parameters.getEmail(), //<4>
                                             parameters.getPassword());
        return UserDto.fromUser(officer); //<5>
    }
    //end::post[]
}
