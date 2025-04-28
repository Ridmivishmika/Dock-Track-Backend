package com.DockTrack.Dock.Track.service;

import com.DockTrack.Dock.Track.dto.FileDto;
import com.DockTrack.Dock.Track.dto.UserDto;
import com.DockTrack.Dock.Track.model.FileModel;
import com.DockTrack.Dock.Track.model.UserModel;
import com.DockTrack.Dock.Track.repo.FileRepo;
import com.DockTrack.Dock.Track.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class FileService {

    @Autowired
    private FileRepo fileRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepo userRepo;

    public FileDto createFile(FileDto fileDto) {
        fileRepo.save(modelMapper.map(fileDto, FileModel.class));//MAP FRONTEND DATA object (dto )to model class
        return fileDto;
    }

    public List<FileDto> getAllFiles() {
        List<FileModel>fileList = fileRepo.findAll();
        return modelMapper.map(fileList,new TypeToken<List<FileDto>>(){}.getType());

    }


    public FileDto updateFile(FileDto fileDto) {
        fileRepo.save(modelMapper.map(fileDto, FileModel.class));
        return fileDto;
    }

    public FileDto deleteFile(String rcode){
        FileModel file = fileRepo.findById(rcode).orElse(null);
        // Map the file entity to FileDto
        FileDto fileDto = modelMapper.map(file, FileDto.class);

        // Delete the file after mapping the data to FileDto
        fileRepo.deleteById(rcode);

        // Return the mapped FileDto with the details of the deleted user
        return fileDto;}

}
