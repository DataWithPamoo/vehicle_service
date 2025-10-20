
package com.example.vehicle_service.service;

import com.example.vehicle_service.model.Vehicle;
import com.example.vehicle_service.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getVehiclesByYear(int year) {
        return vehicleRepository.findByServiceYear(year);
    }

    @Override
    public String getVehicleTypeByServiceId(Long id) {
        return vehicleRepository.findVehicleTypeByServiceId(id);
    }

    @Override
    public void deleteVehiclesByYear(int year) {
        vehicleRepository.deleteByServiceYear(year);
    }
}