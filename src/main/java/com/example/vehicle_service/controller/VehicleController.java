
package com.example.vehicle_service.controller;

import com.example.vehicle_service.model.Vehicle;
import com.example.vehicle_service.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // 1️⃣ Retrieve all vehicles serviced in a specific year
    @GetMapping("/year/{year}")
    public List<Vehicle> getVehiclesByYear(@PathVariable int year) {
        return vehicleService.getVehiclesByYear(year);
    }

    // 2️⃣ Retrieve only the vehicle type given the service ID
    @GetMapping("/type/{serviceId}")
    public String getVehicleType(@PathVariable Long serviceId) {
        return vehicleService.getVehicleTypeByServiceId(serviceId);
    }

    // 3️⃣ Delete all vehicle service records for a given year
    @DeleteMapping("/year/{year}")
    public String deleteVehiclesByYear(@PathVariable int year) {
        vehicleService.deleteVehiclesByYear(year);
        return "All vehicle records for year " + year + " deleted successfully.";
    }
}