
package com.example.vehicle_service.repository;

import com.example.vehicle_service.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByServiceYear(int serviceYear);

    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(Long serviceId);

    void deleteByServiceYear(int serviceYear);
}