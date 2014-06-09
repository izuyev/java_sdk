package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_rule_array", propOrder = {
    "existingDiscountRuleRow"
})
public class ExistingDiscountRuleArray {

    @XmlElement(name = "existing_discount_rule_row")
    protected List<ExistingDiscountRuleRow> existingDiscountRuleRow;

    public List<ExistingDiscountRuleRow> getExistingDiscountRuleRow() {
        if (this.existingDiscountRuleRow == null) {
            this.existingDiscountRuleRow = new ArrayList<ExistingDiscountRuleRow>();
        }
        return this.existingDiscountRuleRow;
    }

}
