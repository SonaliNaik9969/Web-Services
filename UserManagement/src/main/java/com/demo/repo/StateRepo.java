package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.State;
@Repository
public interface StateRepo extends JpaRepository<State, Long> {

	List<State> findStateByCountryId(Long countryId);

}
