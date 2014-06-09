package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existing_discount_rule_id_array", propOrder = {
    "existingDiscountRuleIdRow"
})
public class ExistingDiscountRuleIdArray {

    @XmlElement(name = "existing_discount_rule_id_row")
    protected List<ExistingDiscountRuleIdRow> existingDiscountRuleIdRow;

    public List<ExistingDiscountRuleIdRow> getExistingDiscountRuleIdRow() {
        if (this.existingDiscountRuleIdRow == null) {
            this.existingDiscountRuleIdRow = new ArrayList<ExistingDiscountRuleIdRow>();
        }
        return this.existingDiscountRuleIdRow;
    }

}
