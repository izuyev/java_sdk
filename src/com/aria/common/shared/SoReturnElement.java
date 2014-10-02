package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "so_ReturnElement", propOrder = {"standingOrderNo", "createDate", "updateDate", "comments", "numOrdersReq", "numOrdersComp", "numOrdersRemain", "intervalDays", "lastOrderDate", "nextOrderDate", "statusCd", "statusLabel", "statusDesc", "firstOrderDate", "cancelDate", "cancelComments", "clientOrderId", "clientReceiptId", "statementMessage"})
public class SoReturnElement {

    @XmlElement(name = "standing_order_no")
    protected Long standingOrderNo;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "update_date")
    protected String updateDate;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "num_orders_req")
    protected Long numOrdersReq;
    @XmlElement(name = "num_orders_comp")
    protected Long numOrdersComp;
    @XmlElement(name = "num_orders_remain")
    protected Long numOrdersRemain;
    @XmlElement(name = "interval_days")
    protected Long intervalDays;
    @XmlElement(name = "last_order_date")
    protected String lastOrderDate;
    @XmlElement(name = "next_order_date")
    protected String nextOrderDate;
    @XmlElement(name = "status_cd")
    protected Long statusCd;
    @XmlElement(name = "status_label")
    protected String statusLabel;
    @XmlElement(name = "status_desc")
    protected String statusDesc;
    @XmlElement(name = "first_order_date")
    protected String firstOrderDate;
    @XmlElement(name = "cancel_date")
    protected String cancelDate;
    @XmlElement(name = "cancel_comments")
    protected String cancelComments;
    @XmlElement(name = "client_order_id")
    protected String clientOrderId;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "statement_message")
    protected String statementMessage;
    
    public Long getStandingOrderNo() {
        return standingOrderNo;
    }

    public void setStandingOrderNo(Long value) {
        this.standingOrderNo = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public Long getNumOrdersReq() {
        return numOrdersReq;
    }

    public void setNumOrdersReq(Long value) {
        this.numOrdersReq = value;
    }

    public Long getNumOrdersComp() {
        return numOrdersComp;
    }

    public void setNumOrdersComp(Long value) {
        this.numOrdersComp = value;
    }

    public Long getNumOrdersRemain() {
        return numOrdersRemain;
    }

    public void setNumOrdersRemain(Long value) {
        this.numOrdersRemain = value;
    }

    public Long getIntervalDays() {
        return intervalDays;
    }

    public void setIntervalDays(Long value) {
        this.intervalDays = value;
    }

    public String getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(String value) {
        this.lastOrderDate = value;
    }

    public String getNextOrderDate() {
        return nextOrderDate;
    }

    public void setNextOrderDate(String value) {
        this.nextOrderDate = value;
    }

    public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }

    public String getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(String value) {
        this.statusLabel = value;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    public String getFirstOrderDate() {
        return firstOrderDate;
    }

    public void setFirstOrderDate(String value) {
        this.firstOrderDate = value;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    public String getCancelComments() {
        return cancelComments;
    }

    public void setCancelComments(String value) {
        this.cancelComments = value;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public String getStatementMessage() {
        return statementMessage;
    }

    public void setStatementMessage(String value) {
        this.statementMessage = value;
    }

    
}
