package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule_nos_row", propOrder = {
    "ruleNos"
    })
public class RuleNosRow {

    @XmlElement(name = "rule_nos")
    protected Long ruleNos;
    public Long getRuleNos() {
        return ruleNos;
    }

    public void setRuleNos(Long value) {
        this.ruleNos = value;
    }

    
}
