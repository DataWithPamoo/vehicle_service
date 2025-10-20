
package com.example.vehicle_service.service;

import com.example.vehicle_service.model.Vehicle;
import java.util.List;

public interface VehicleService {
    List<Vehicle> getVehiclesByYear(int year);
    String getVehicleTypeByServiceId(Long id);
    void deleteVehiclesByYear(int year);
    Vehicle saveVehicle(Vehicle vehicle); // important
}