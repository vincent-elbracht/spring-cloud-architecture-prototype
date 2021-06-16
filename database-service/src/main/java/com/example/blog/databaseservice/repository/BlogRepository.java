package com.example.blog.databaseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blog.databaseservice.entity.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
