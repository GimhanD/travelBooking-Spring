package com.example.hotelbooking.controllers;

import com.example.hotelbooking.dto.VehicleDTO;
import com.example.hotelbooking.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle")
@CrossOrigin
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;
    @GetMapping("/getVehicle")
    public List<VehicleDTO> getUser(){
        return vehicleService.getAllUsers();
    }
    @PostMapping("/saveVehicle")
    public VehicleDTO saveUser(@RequestBody VehicleDTO vehicleDTO){
        return vehicleService.saveUser(vehicleDTO);
    }

    @PutMapping("/updateVehicle")
    public VehicleDTO updateUser(@RequestBody VehicleDTO vehicleDTO) {
        return vehicleService.updateUser(vehicleDTO);
    }
    @DeleteMapping("/deleteVehicle")
    public boolean deleteUser(@RequestBody VehicleDTO vehicleDTO){
        return vehicleService.deleteUser(vehicleDTO);
    }
}
