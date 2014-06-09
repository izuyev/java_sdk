package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_rule_array", propOrder = {
    "discountRuleRow"
})
public class DiscountRuleArray {

    @XmlElement(name = "discount_rule_row")
    protected List<DiscountRuleRow> discountRuleRow;

    public List<DiscountRuleRow> getDiscountRuleRow() {
        if (this.discountRuleRow == null) {
            this.discountRuleRow = new ArrayList<DiscountRuleRow>();
        }
        return this.discountRuleRow;
    }

}
