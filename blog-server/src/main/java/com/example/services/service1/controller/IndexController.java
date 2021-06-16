package com.example.services.service1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.entity.Blog;
import com.example.services.service1.proxy.DatabaseServiceProxy;

@RestController
public class IndexController {

	@Autowired
	private DatabaseServiceProxy proxy;
	
	@GetMapping("/getData")
	public List<Blog> getBlogs() {
		return proxy.getBlogs();
	}
}
