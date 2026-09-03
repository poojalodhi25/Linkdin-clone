package com.linkdinproject.post_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/like")
public class PostLikeController {

    @PostMapping
    public ResponseEntity<PostDto>createPost(RequestMapping PostCreateReuqestDto postDto)
}
