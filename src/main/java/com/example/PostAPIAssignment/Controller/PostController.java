package com.example.PostAPIAssignment.Controller;

import com.example.PostAPIAssignment.Service.PostService;
import com.example.PostAPIAssignment.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/post")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping(value = "/create-post")
    public ResponseEntity createpost(@RequestBody Post post){
        return postService.saverepo(post);
    }
    @GetMapping(value = "/get-all")
    public List<Post> getalla(){
        return postService.getpost();
    }
}
