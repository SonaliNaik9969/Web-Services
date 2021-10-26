package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.City;
@Repository
public interface CityRepo extends JpaRepository<City, Long> {

	List<City> findCityByStateId(Long stateId);

}
