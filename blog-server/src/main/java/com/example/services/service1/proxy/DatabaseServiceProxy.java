package com.example.services.service1.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.entity.Blog;


@FeignClient(name="database-service")
@RibbonClient(name="database-service")
public interface DatabaseServiceProxy {

	@GetMapping("/blog/blogs")
	public List<Blog> getBlogs();
}
