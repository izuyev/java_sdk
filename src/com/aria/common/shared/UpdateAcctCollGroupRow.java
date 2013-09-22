package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_coll_group_row", propOrder = {
    "collectionsAcctGroups",
    "collectionsGroupDirectives",
    "clientCollAcctGroupIds"
    })
public class UpdateAcctCollGroupRow {

    @XmlElement(name = "collections_acct_groups")
    protected Long collectionsAcctGroups;
    @XmlElement(name = "collections_group_directives")
    protected Long collectionsGroupDirectives;
    @XmlElement(name = "client_coll_acct_group_ids")
    protected String clientCollAcctGroupIds;
    public Long getCollectionsAcctGroups() {
        return collectionsAcctGroups;
    }

    public void setCollectionsAcctGroups(Long value) {
        this.collectionsAcctGroups = value;
    }

    public Long getCollectionsGroupDirectives() {
        return collectionsGroupDirectives;
    }

    public void setCollectionsGroupDirectives(Long value) {
        this.collectionsGroupDirectives = value;
    }

    public String getClientCollAcctGroupIds() {
        return clientCollAcctGroupIds;
    }

    public void setClientCollAcctGroupIds(String value) {
        this.clientCollAcctGroupIds = value;
    }

    
}
