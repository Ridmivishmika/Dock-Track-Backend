package com.DockTrack.Dock.Track.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModel {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT in MySQL
    private Long id; // Or Integer, depending on your database configuration

    private String EPFNumber;
    private String EmployeeName;
    private String Role;
    private String ContactNumber;
    private int SeatNumber;
    private String Department;
    private boolean IsApproved;

}
