package com.irctc.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.entity.Train;
import com.irctc.repo.TrainRepo;

@Service
public class TrainService {

	@Autowired
	private TrainRepo trainrepo;
	
	public Train saveTrain(Train train)
	{
		return trainrepo.save(train);
	}
	public List<Train> getAllTrains()
	{
		List<Train> allTrains = trainrepo.findAll();
		return allTrains;
	}
	public Train getTrainByID(Long id)
	{
		return trainrepo.getById(id);
	}
	public boolean deleteTrainByID(Long id)
	{
		boolean existByID = trainrepo.existsById(id);
		if (existByID)
		{
			trainrepo.deleteById(id);
		}
		return existByID;
	}

}
