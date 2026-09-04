package com.linkdinproject.post_service.service;

import com.linkdinproject.post_service.entity.PostLike;
import jakarta.transaction.Transactional;
import org.apache.coyote.BadRequestException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

public class PostLikeService {
    private final PostLikeRepository postLikeRepository;
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public void likePost(Long postId) {
        Long userID = 1L;
        log.info("User with Id:{} liking the post with ID:{}", userID, postId);
        postRepository.findById(postId).orElseThrow(() -> new ConfigDataResourceNotFoundException("post not found with ID: " + postId));
        boolean hasAlreadyLiked = postLikeRepository.existsByUserIdAndPostId(userID, postId);
        if (hasAlreadyLiked) throw new BadRequestException("Yoe cannot like the post again");
        PostLike postLike = new PostLike();
        postLike.setPostId(postId);
        postLike.getUserId(userID);
        PostLikeRepository.save(postLike);
    }
    @Transactional
    public void unlikePost(Long postId){
        long userId = 1L;
        log.info("User with ID: {} unliking the post with ID: {}", userId, postId);
        postRepository.findById(postId).orElseThrow(()-> new ConfigDataResourceNotFoundException("Post not found with ID: "+postId));

        boolean hasAlredLike = postLikeRepository.existsByUserIdAndPostId(userId, postId);
        if(!hasAlredLike) throw  new BadRequestException("you cannot unlike the post that you have not liked yet");
        postLikeRepository.deleteByUSerIdAndPostId(userId,postId);

    }
}
