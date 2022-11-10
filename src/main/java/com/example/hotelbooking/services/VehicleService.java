package com.example.hotelbooking.services;

import com.example.hotelbooking.Repository.VehicleRepo;
import com.example.hotelbooking.dto.VehicleDTO;
import com.example.hotelbooking.entity.Vehicle;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;
    @Autowired
    private ModelMapper modelMapper;

    public VehicleDTO saveUser(VehicleDTO vehicleDTO){
        vehicleRepo.save(modelMapper.map(vehicleDTO, Vehicle.class));
        return vehicleDTO;
    }
    public List<VehicleDTO> getAllUsers(){
        List<Vehicle> vehicleList = vehicleRepo.findAll();
        return modelMapper.map(vehicleList,new TypeToken<List<VehicleDTO>>(){}.getType());
    }
    public VehicleDTO updateUser(VehicleDTO vehicleDTO){
        vehicleRepo.save(modelMapper.map(vehicleDTO, Vehicle.class));
        return vehicleDTO;
    }
    public boolean deleteUser(VehicleDTO vehicleDTO){
        vehicleRepo.delete(modelMapper.map(vehicleDTO, Vehicle.class));
        return true;
    }
}
