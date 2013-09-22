package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_comments_ReturnElement", propOrder = {"commentAuthor", "commentDateTime", "comment"})
public class AcctCommentsReturnElement {

    @XmlElement(name = "comment_author")
    protected String commentAuthor;
    @XmlElement(name = "comment_date_time")
    protected String commentDateTime;
    @XmlElement(name = "comment")
    protected String comment;
    
    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String value) {
        this.commentAuthor = value;
    }

    public String getCommentDateTime() {
        return commentDateTime;
    }

    public void setCommentDateTime(String value) {
        this.commentDateTime = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String value) {
        this.comment = value;
    }

    
}
