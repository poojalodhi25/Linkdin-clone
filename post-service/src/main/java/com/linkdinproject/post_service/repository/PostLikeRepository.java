package com.linkdinproject.post_service.repository;

import com.linkdinproject.post_service.entity.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostLikeRepository extends JpaRepository<PostLike,Long> {
    boolean existsByUserIdAndPostId(Long userId, Long PostId);
    void deleteByUserIdAndPostId(Long userId, Long postId);
}
