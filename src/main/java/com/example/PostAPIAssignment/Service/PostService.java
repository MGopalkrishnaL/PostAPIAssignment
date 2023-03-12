package com.example.PostAPIAssignment.Service;

import com.example.PostAPIAssignment.dao.PostRepo;
import com.example.PostAPIAssignment.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;
    public List<Post> getpost(){
        return postRepo.findAll();
    }
    public ResponseEntity saverepo(Post postdata){
        postRepo.save(postdata);
        return new ResponseEntity<>("Data Saved successfull", HttpStatus.CREATED);
    }
}
