package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receipt_action_ReturnElement", propOrder = {"actionTypeId", "actionTypeLabel", "actionTypeDesc", "actionRecIdLabel", "actionRecIdVal", "actionDate", "actionUser", "actionQualifier1Label", "actionQualifier1Val", "actionQualifier2Label", "actionQualifier2Val", "actionQualifier3Label", "actionQualifier3Val", "actionQualifier4Label", "actionQualifier4Val"})
public class ReceiptActionReturnElement {

    @XmlElement(name = "action_type_id")
    protected Long actionTypeId;
    @XmlElement(name = "action_type_label")
    protected String actionTypeLabel;
    @XmlElement(name = "action_type_desc")
    protected String actionTypeDesc;
    @XmlElement(name = "action_rec_id_label")
    protected String actionRecIdLabel;
    @XmlElement(name = "action_rec_id_val")
    protected String actionRecIdVal;
    @XmlElement(name = "action_date")
    protected String actionDate;
    @XmlElement(name = "action_user")
    protected String actionUser;
    @XmlElement(name = "action_qualifier_1_label")
    protected String actionQualifier1Label;
    @XmlElement(name = "action_qualifier_1_val")
    protected String actionQualifier1Val;
    @XmlElement(name = "action_qualifier_2_label")
    protected String actionQualifier2Label;
    @XmlElement(name = "action_qualifier_2_val")
    protected String actionQualifier2Val;
    @XmlElement(name = "action_qualifier_3_label")
    protected String actionQualifier3Label;
    @XmlElement(name = "action_qualifier_3_val")
    protected String actionQualifier3Val;
    @XmlElement(name = "action_qualifier_4_label")
    protected String actionQualifier4Label;
    @XmlElement(name = "action_qualifier_4_val")
    protected String actionQualifier4Val;
    
    public Long getActionTypeId() {
        return actionTypeId;
    }

    public void setActionTypeId(Long value) {
        this.actionTypeId = value;
    }

    public String getActionTypeLabel() {
        return actionTypeLabel;
    }

    public void setActionTypeLabel(String value) {
        this.actionTypeLabel = value;
    }

    public String getActionTypeDesc() {
        return actionTypeDesc;
    }

    public void setActionTypeDesc(String value) {
        this.actionTypeDesc = value;
    }

    public String getActionRecIdLabel() {
        return actionRecIdLabel;
    }

    public void setActionRecIdLabel(String value) {
        this.actionRecIdLabel = value;
    }

    public String getActionRecIdVal() {
        return actionRecIdVal;
    }

    public void setActionRecIdVal(String value) {
        this.actionRecIdVal = value;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String value) {
        this.actionDate = value;
    }

    public String getActionUser() {
        return actionUser;
    }

    public void setActionUser(String value) {
        this.actionUser = value;
    }

    public String getActionQualifier1Label() {
        return actionQualifier1Label;
    }

    public void setActionQualifier1Label(String value) {
        this.actionQualifier1Label = value;
    }

    public String getActionQualifier1Val() {
        return actionQualifier1Val;
    }

    public void setActionQualifier1Val(String value) {
        this.actionQualifier1Val = value;
    }

    public String getActionQualifier2Label() {
        return actionQualifier2Label;
    }

    public void setActionQualifier2Label(String value) {
        this.actionQualifier2Label = value;
    }

    public String getActionQualifier2Val() {
        return actionQualifier2Val;
    }

    public void setActionQualifier2Val(String value) {
        this.actionQualifier2Val = value;
    }

    public String getActionQualifier3Label() {
        return actionQualifier3Label;
    }

    public void setActionQualifier3Label(String value) {
        this.actionQualifier3Label = value;
    }

    public String getActionQualifier3Val() {
        return actionQualifier3Val;
    }

    public void setActionQualifier3Val(String value) {
        this.actionQualifier3Val = value;
    }

    public String getActionQualifier4Label() {
        return actionQualifier4Label;
    }

    public void setActionQualifier4Label(String value) {
        this.actionQualifier4Label = value;
    }

    public String getActionQualifier4Val() {
        return actionQualifier4Val;
    }

    public void setActionQualifier4Val(String value) {
        this.actionQualifier4Val = value;
    }

    
}
