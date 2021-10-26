package com.irctc.resource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.irctc.entity.Train;
import com.irctc.service.TrainService;

@RestController
@RequestMapping("/train")
public class TrainResource {
	
	@Autowired
	private TrainService trainservice;
	
	//OptionalRequestParam
	@GetMapping("/search")
	public String SearchTrain(@RequestParam(value = "trainNo",required=false) String trainNo, 
			@RequestParam(value = "trainName",required=false) String trainName, 
			@RequestParam(value = "source",required = false) String source, 
			@RequestParam(value = "destination",required = false) String destination)
	{
		return trainNo +  "  :  " + trainName + "  :  " + source + "  :  " + destination;
	}
	
	@GetMapping("/get")
	public List<Train> getAllTrains()
	{
		return trainservice.getAllTrains();
	}
	
	@PostMapping("/save")
	public Train saveTrain(@RequestBody Train train)
	{
		return trainservice.saveTrain(train);
	}
	
	@GetMapping("/{id}")
	public Train getTrainByID(@PathVariable("id") Long id)
	{
		return trainservice.getTrainByID(id);
	}
	
	@GetMapping("/delete/{id}")
	public boolean deleteTrainByID(@PathVariable("id") Long id)
	{
		return trainservice.deleteTrainByID(id);
	}
	@GetMapping("/searchByNumber")
	public String SearchByNumber(@RequestParam(value = "trainNo",required=false) String trainNo)
	{
		return trainNo;
	}
	
	@GetMapping("/searchByName")
	public String SearchByName(@RequestParam(value = "trainName",required=false) String trainName)
	{
		return trainName;
	}
	

}
