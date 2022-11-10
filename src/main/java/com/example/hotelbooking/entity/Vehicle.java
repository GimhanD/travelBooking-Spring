package com.example.hotelbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vehicle {
    @Id
    private int id;
    private String vehicleNo;
    private String vehicleType;
    private String fuelType;
    private int noOfSeats;
    private int pricePerKm;
}
