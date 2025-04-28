package com.DockTrack.Dock.Track.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FileModel {
    @Id
    private String rcode;
    private String contact_number;
    private String department;
    private String epfnumber;
    private String employee_name;
    private String get_date;
}
