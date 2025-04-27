package com.DockTrack.Dock.Track.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private Long id; // Or Integer, depending on your database configuration

    private String EPFNumber;
    private String EmployeeName;
    private String Role;
    private String ContactNumber;
    private int SeatNumber;
    private String Department;
    private boolean IsApproved;



}


