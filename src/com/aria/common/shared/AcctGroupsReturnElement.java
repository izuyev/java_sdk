package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_groups_ReturnElement", propOrder = {"groupNo", "groupName", "groupDesc", "groupType", "groupMask", "groupSeqNo", "clientAcctGroupId"})
public class AcctGroupsReturnElement {

    @XmlElement(name = "group_no")
    protected Long groupNo;
    @XmlElement(name = "group_name")
    protected String groupName;
    @XmlElement(name = "group_desc")
    protected String groupDesc;
    @XmlElement(name = "group_type")
    protected String groupType;
    @XmlElement(name = "group_mask")
    protected String groupMask;
    @XmlElement(name = "group_seq_no")
    protected Long groupSeqNo;
    @XmlElement(name = "client_acct_group_id")
    protected String clientAcctGroupId;
    
    public Long getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Long value) {
        this.groupNo = value;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String value) {
        this.groupName = value;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String value) {
        this.groupDesc = value;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String value) {
        this.groupType = value;
    }

    public String getGroupMask() {
        return groupMask;
    }

    public void setGroupMask(String value) {
        this.groupMask = value;
    }

    public Long getGroupSeqNo() {
        return groupSeqNo;
    }

    public void setGroupSeqNo(Long value) {
        this.groupSeqNo = value;
    }

    public String getClientAcctGroupId() {
        return clientAcctGroupId;
    }

    public void setClientAcctGroupId(String value) {
        this.clientAcctGroupId = value;
    }

    
}
