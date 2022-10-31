package com.example.hotelbooking.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingDTO {
    private Integer id;
    private String destination;
    private Integer noPassengers;
    private String vehicleType;
}
