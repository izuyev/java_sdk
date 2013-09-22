package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_new_acct_plan_contracts_array", propOrder = {
    "a5NewAcctPlanContractsRow"
})
public class A5NewAcctPlanContractsArray {

    @XmlElement(name = "a5_new_acct_plan_contracts_row")
    protected List<A5NewAcctPlanContractsRow> a5NewAcctPlanContractsRow;

    public List<A5NewAcctPlanContractsRow> getA5NewAcctPlanContractsRow() {
        if (this.a5NewAcctPlanContractsRow == null) {
            this.a5NewAcctPlanContractsRow = new ArrayList<A5NewAcctPlanContractsRow>();
        }
        return this.a5NewAcctPlanContractsRow;
    }

}
