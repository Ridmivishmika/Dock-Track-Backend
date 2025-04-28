package com.DockTrack.Dock.Track.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    @Id
    private String EPFNumber;
    private String EmployeeName;
    private String Role;
    private String ContactNumber;
    private int SeatNumber;
    private String Department;
    private boolean IsApproved;



}


