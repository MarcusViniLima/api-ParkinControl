package br.com.marcus.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.marcus.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
    boolean existByLicensePlateCar(String licensePlateCar);
    boolean existByParkingSpotNumber(String parkingSpotNumber);
    boolean existByApartamentAndBlock(String apartament, String block);

}
