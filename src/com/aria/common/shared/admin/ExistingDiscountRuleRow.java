package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_rule_row", propOrder = {
    "existingRules"
    })
public class ExistingDiscountRuleRow {

    @XmlElement(name = "existing_rules")
    protected Long existingRules;
    public Long getExistingRules() {
        return existingRules;
    }

    public void setExistingRules(Long value) {
        this.existingRules = value;
    }

    
}
