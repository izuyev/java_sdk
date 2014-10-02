package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_rule_id_row", propOrder = {
    "existingDiscountRuleIds"
    })
public class ExistingDiscountRuleIdRow {

    @XmlElement(name = "existing_discount_rule_ids")
    protected String existingDiscountRuleIds;
    public String getExistingDiscountRuleIds() {
        return existingDiscountRuleIds;
    }

    public void setExistingDiscountRuleIds(String value) {
        this.existingDiscountRuleIds = value;
    }

    
}
