package com.Homeworkd.Review.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Homeworkd.Review.Entity.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Long> {

}
