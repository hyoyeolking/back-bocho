package com.sparta.bochodrive.domain.comment.repository;

import com.sparta.bochodrive.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByCommunitiesId(Long communitiesId);
}
