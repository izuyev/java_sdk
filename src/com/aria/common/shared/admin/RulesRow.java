package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rules_row", propOrder = {
    "rule"
    })
public class RulesRow {

    @XmlElement(name = "rule")
    protected Long rule;
    public Long getRule() {
        return rule;
    }

    public void setRule(Long value) {
        this.rule = value;
    }

    
}
