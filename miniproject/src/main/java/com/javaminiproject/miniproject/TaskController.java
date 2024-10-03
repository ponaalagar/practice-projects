package com.javaminiproject.miniproject;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaminiproject.miniproject.modal.tasj;
import com.javaminiproject.miniproject.repository.TaskRepository;


@RestController
public class TaskController{
	
	@Autowired
	private TaskRepository taskRepository;
	
	@GetMapping("/hello-world")
	public String helloworld()
	{
		return "vanakam da mapla";
	}
	
	@PostMapping("/api/tasj")
	public tasj createTask(@RequestBody tasj tasj)
	{
		taskRepository.save(tasj);
		return tasj;
	}
}