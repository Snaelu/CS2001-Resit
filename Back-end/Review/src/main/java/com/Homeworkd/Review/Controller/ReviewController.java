package com.Homeworkd.Review.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Homeworkd.Review.Entity.Reviews;
import com.Homeworkd.Review.Service.ReviewService;

@RestController
@RequestMapping("/api/rewards")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    //getting all reviews
    @GetMapping
    public List<Reviews> getAllReviews() {
        return reviewService.getAllReviews();
    }

    //getting reviews by ID
    @GetMapping("/{id}")
    public Optional<Reviews> getReviewById(@PathVariable long id) {
        return reviewService.getReviewById(id);
    }

    //Updating existing review
    @PutMapping("/{id}")
    public Reviews updateReview(@PathVariable long id, @RequestBody Reviews reviewDetails) {
        return reviewService.updateReview(id, reviewDetails);
    }

    //Deleting Review
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable long id) {
        reviewService.deleteReview(id);
    }
}
