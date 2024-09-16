package com.kodebook.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kodebook.entities.Post;
import com.kodebook.services.PostService;


@Controller
public class PostController {
	@Autowired
	PostService service;
	@PostMapping("/createPost")
	public  String createPost
	(@RequestParam("caption") String caption,
            
            @RequestParam("photo") MultipartFile photo){
Post post=new Post();
post.setCaption(caption);
try {
 {
post.setPhoto(photo.getBytes());  // Save photo bytes
}
} catch (IOException e) {
e.printStackTrace();}
		service.createPost(post);
		
		return "home";
		
	}

}
