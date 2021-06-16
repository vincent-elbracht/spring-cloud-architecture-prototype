package com.example.blog.databaseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.databaseservice.entity.Blog;
import com.example.blog.databaseservice.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository repository;

	public List<Blog> getBlogs() {
		return repository.findAll();
	}
}
