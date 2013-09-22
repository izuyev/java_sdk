package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_func_group_row", propOrder = {
    "functionalAcctGroups",
    "functionalGroupDirectives",
    "clientFuncAcctGroupIds"
    })
public class UpdateAcctFuncGroupRow {

    @XmlElement(name = "functional_acct_groups")
    protected Long functionalAcctGroups;
    @XmlElement(name = "functional_group_directives")
    protected Long functionalGroupDirectives;
    @XmlElement(name = "client_func_acct_group_ids")
    protected String clientFuncAcctGroupIds;
    public Long getFunctionalAcctGroups() {
        return functionalAcctGroups;
    }

    public void setFunctionalAcctGroups(Long value) {
        this.functionalAcctGroups = value;
    }

    public Long getFunctionalGroupDirectives() {
        return functionalGroupDirectives;
    }

    public void setFunctionalGroupDirectives(Long value) {
        this.functionalGroupDirectives = value;
    }

    public String getClientFuncAcctGroupIds() {
        return clientFuncAcctGroupIds;
    }

    public void setClientFuncAcctGroupIds(String value) {
        this.clientFuncAcctGroupIds = value;
    }

    
}
