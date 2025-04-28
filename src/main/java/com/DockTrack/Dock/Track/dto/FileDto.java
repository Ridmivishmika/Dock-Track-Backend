package com.DockTrack.Dock.Track.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FileDto {

    private String rcode;
    private String contact_number;
    private String department;
    private String epfnumber;
    private String employee_name;
    private String get_date;

}
