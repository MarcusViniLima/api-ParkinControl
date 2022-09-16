package br.com.marcus.service;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.marcus.model.ParkingSpotModel;
import br.com.marcus.repository.ParkingSpotRepository;

@Service
public class ParkingSpotService {

@Autowired
ParkingSpotRepository parkingSpotRepository;


@Transactional
public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
return parkingSpotRepository.save(parkingSpotModel);
}

public Page<ParkingSpotModel> findAll(Pageable pageable){
return parkingSpotRepository.findAll(pageable); 
}

public boolean existByLicensePlateCar(String licensePlateCar){
return parkingSpotRepository.existByLicensePlateCar(licensePlateCar);
}

public boolean existByParkingSpotNumber(String parkingSpotNumber){
return parkingSpotRepository.existByParkingSpotNumber( parkingSpotNumber);
}

public boolean existByApartamentAndBlock(String apartament, String block){
return parkingSpotRepository.existByApartamentAndBlock( apartament,  block);
}

public Optional<ParkingSpotModel> findById(UUID id){
	return parkingSpotRepository.findById(id);
}

@Transactional
public void delete(ParkingSpotModel parkingSpotModel){
	parkingSpotRepository.delete(parkingSpotModel);
}

}
