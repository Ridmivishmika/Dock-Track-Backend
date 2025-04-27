package com.DockTrack.Dock.Track.service;

import com.DockTrack.Dock.Track.dto.UserDto;
import com.DockTrack.Dock.Track.model.UserModel;
import com.DockTrack.Dock.Track.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

   @Autowired
    private ModelMapper modelMapper;


   public List<UserDto> getUsers(){
       List<UserModel>userList = userRepo.findAll();
       return modelMapper.map(userList,new TypeToken<List<UserDto>>(){}.getType());
   }

   public UserDto createUser(UserDto userDto){

       userRepo.save(modelMapper.map(userDto,UserModel.class));//map frontend data to database
       return userDto;
   }
//public UserDto createUser(UserDto userDto) {
//    // Print userDto to ensure it contains values
//    System.out.println("UserDto: " + userDto);
//
//    // Map to UserModel
//    UserModel userModel = modelMapper.map(userDto, UserModel.class);
//
//    // Print userModel to see if the values are mapped correctly
//    System.out.println("UserModel: " + userModel);
//
//    // Save the userModel to the database
//    UserModel savedUser = userRepo.save(userModel);
//
//    // Return the saved UserDto (optional)
//    return modelMapper.map(savedUser, UserDto.class);
//}



//    public String createUser(UserDto userDto){
//        userRepo.save(modelMapper.map(userDto,UserModel.class));//map frontend data to database
//        return "Create user";
//    }


    public UserDto updateUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto,UserModel.class));//map frontend data to database
        return userDto;
    }

    public String deleteUser(UserDto userDto){
       userRepo.delete(modelMapper.map(userDto,UserModel.class));
       return "User deleted";
    }
}
