package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"itemRatingsReviews", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_item_ratings_reviewsResponseElement")
public class GetItemRatingsReviewsResponseElement {

    @XmlElement(name = "item_ratings_reviews")
    protected List<ItemRatingsReviewsReturnElement> itemRatingsReviews;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ItemRatingsReviewsReturnElement> getItemRatingsReviews() {
        if (this.itemRatingsReviews == null) {
            this.itemRatingsReviews = new ArrayList<ItemRatingsReviewsReturnElement>();
        }
        return this.itemRatingsReviews;
    }public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
