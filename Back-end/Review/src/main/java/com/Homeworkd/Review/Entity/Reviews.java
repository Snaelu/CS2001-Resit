package com.Homeworkd.Review.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReviewID")
    private long reviewID;

    @Column(name = "Stars")
    private int stars;

    @Column(name = "TaskName")
    private String taskName;

    @Column(name = "byLine")
    private String byLine;

    @Column(name = "Review")
    private String review;

    //Getters and Setters
    public long getReviewID() {
        return reviewID;
    }

    public void setReviewID(long reviewID) {
        this.reviewID = reviewID;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (stars < 0 || stars > 5) {
            System.out.println("You have inputted a value that is outside the bounds of 0 and 5, please try again");
        } else {
            this.stars = stars;
        }
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getByLine() {
        return byLine;
    }

    public void setByLine(String byLine) {
        this.byLine = byLine;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

}
