package com.DockTrack.Dock.Track.controller;

import com.DockTrack.Dock.Track.dto.FileDto;
import com.DockTrack.Dock.Track.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/")
public class FileController {
    @Autowired
    private FileService fileService;

    @PostMapping("createFile")
    public FileDto createFile(@RequestBody FileDto fileDto) {
        return fileService.createFile(fileDto);
    }

    @GetMapping("getFiles")
    public List<FileDto> getFiles() {
        return fileService.getAllFiles();
    }

    @PutMapping("updateFile")
    public FileDto updateFiles(@RequestBody FileDto fileDto) {
        return fileService.updateFile(fileDto);
    }

    @DeleteMapping("deleteFile/{rcode}")
    public String deleteFile(@PathVariable String rcode) {
        fileService.deleteFile(rcode);
        return rcode + " File deleted" ;
    }

}

