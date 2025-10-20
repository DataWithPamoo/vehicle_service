package com.example.vehicle_service.repository;

import com.example.vehicle_service.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>
 {

    // 1️⃣ Get all vehicles for a given service year
    List<Vehicle> findByServiceYear(int serviceYear);

    // 2️⃣ Get vehicle type by service ID
    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(Long serviceId);

    // 3️⃣ Delete all vehicles by year
    void deleteByServiceYear(int serviceYear);
 }