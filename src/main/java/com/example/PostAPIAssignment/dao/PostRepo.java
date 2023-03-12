package com.example.PostAPIAssignment.dao;

import com.example.PostAPIAssignment.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {
}
