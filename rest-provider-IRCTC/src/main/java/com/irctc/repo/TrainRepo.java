package com.irctc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.entity.Train;

public interface TrainRepo extends JpaRepository<Train, Long> {

}
