package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule_ids_row", propOrder = {
    "ruleId"
    })
public class RuleIdsRow {

    @XmlElement(name = "rule_id")
    protected Long ruleId;
    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long value) {
        this.ruleId = value;
    }

    
}
