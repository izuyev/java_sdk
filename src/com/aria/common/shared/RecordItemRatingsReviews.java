package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientSku",    "itemNo",    "ratings",    "reviews"})
@XmlRootElement(name = "record_item_ratings_reviews")
public class RecordItemRatingsReviews {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_sku")
    protected String clientSku;
        @XmlElement(name = "item_no")
    protected Long itemNo;
        @XmlElement(name = "ratings")
    protected Long ratings;
        @XmlElement(name = "reviews")
    protected String reviews;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }
            public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }
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
