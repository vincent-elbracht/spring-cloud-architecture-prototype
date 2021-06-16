package com.example.blog.databaseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.databaseservice.entity.Blog;
import com.example.blog.databaseservice.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogController {
	@Autowired
	private BlogService service;

	@GetMapping("/blogs")
	public List<Blog> getBlogs() {
		return service.getBlogs();
	}
}
