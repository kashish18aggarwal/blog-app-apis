package com.learning.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
