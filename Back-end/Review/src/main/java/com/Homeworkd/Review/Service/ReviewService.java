package com.Homeworkd.Review.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Homeworkd.Review.Entity.Reviews;
import com.Homeworkd.Review.Repositories.ReviewRepository;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

//constructor
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

//getting all reviews
    public List<Reviews> getAllReviews() {
        return reviewRepository.findAll();
    }

    //Get reviews by ID
    public Optional<Reviews> getReviewById(long id) {
        return reviewRepository.findById(id);
    }

    //Create a new review
    public Reviews createReview(Reviews review) {
        return reviewRepository.save(review);
    }

    //Update an existing Reviews
    public Reviews updateReward(long id, Reviews reviewDetails) {
        Reviews review = reviewRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Review not found"));
        review.setStars(reviewDetails.getStars());
        review.setTaskName(reviewDetails.getTaskName());
        review.setByLine(reviewDetails.getByLine());
        review.setReview(reviewDetails.getReview());

        return reviewRepository.save(review);
    }

    //Delete a review   
    public void deleteReview(long id) {
        reviewRepository.deleteById(id);
    }
}
