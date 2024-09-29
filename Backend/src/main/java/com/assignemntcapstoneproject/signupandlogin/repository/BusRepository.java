package com.assignemntcapstoneproject.signupandlogin.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.assignemntcapstoneproject.signupandlogin.model.BusData;


public interface BusRepository extends JpaRepository<BusData,Long > {

//	List<BusData> findByBus_Id(Long id);
}
