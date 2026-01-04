package com.practice.prod_ready_feature.demo.services;

import com.practice.prod_ready_feature.demo.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

}
