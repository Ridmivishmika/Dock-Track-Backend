package com.DockTrack.Dock.Track.controller;

import com.DockTrack.Dock.Track.dto.UserDto;
import com.DockTrack.Dock.Track.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getUsers")
    //METHOD
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("createUser")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

//    @PostMapping("createUser")
//        public String createUser(@RequestBody UserDto userDto) {
//        return userService.createUser(userDto);
//    }

    @PutMapping("updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestBody UserDto userDto) {
        return userService.deleteUser(userDto);
    }

}
