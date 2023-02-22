package com.questGlobal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
//		return Arrays.asList(new Topic("1","spidy","saving the earth"),
//				new Topic("3","cap america","saving the america"));
		//instead of this, have to get data from db
		
		List<Topic> topicList = new ArrayList();
		topicRepository.findAll().forEach(topicList::add);
		System.out.println("*************");
		System.out.println(topicList);
		return topicList;
	}

	public void createTopic(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(Integer id) {
		topicRepository.deleteById(id);	
	}

	public Topic getTopic(Integer id) {
		// TODO Auto-generated method stub
		return topicRepository.findById(id).get();
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
		
	}
}
