package com.questGlobal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService service ;
	
	@GetMapping("/topics") //to map the request 
	public List<Topic> getallTopics() {
		//		TopicService service = new TopicService(); // tight coupling
		return service.getAllTopics();
	}
	
	@PostMapping("/topics") //to map the request 
	public void createTopic(@RequestBody Topic topic) {
		service.createTopic(topic);
	}
	@DeleteMapping("/topics/{id}") //to map the request 
	public void deleteTopic(@PathVariable Integer id) {
		service.deleteTopic(id);
	}
	@PutMapping("/topics/{id}") //to map the request 
	public void updateTopic(@RequestBody Topic topic,@PathVariable Integer id) {
		topic.setId(id);
		service.updateTopic(topic);
	}
	@GetMapping("/topics/{id}") //to map the request 
	public Topic getTopic(@PathVariable Integer id) {
		return service.getTopic(id);
	}
}
