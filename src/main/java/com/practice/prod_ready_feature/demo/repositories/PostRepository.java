package com.practice.prod_ready_feature.demo.repositories;

import com.practice.prod_ready_feature.demo.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
