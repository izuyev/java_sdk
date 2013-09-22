package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_ratings_reviews_ReturnElement", propOrder = {"ratings", "reviews"})
public class ItemRatingsReviewsReturnElement {

    @XmlElement(name = "ratings")
    protected Long ratings;
    @XmlElement(name = "reviews")
    protected String reviews;
    
    public Long getRatings() {
        return ratings;
    }

    public void setRatings(Long value) {
        this.ratings = value;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String value) {
        this.reviews = value;
    }

    
}
