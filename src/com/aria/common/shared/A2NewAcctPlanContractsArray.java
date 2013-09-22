package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_new_acct_plan_contracts_array", propOrder = {
    "a2NewAcctPlanContractsRow"
})
public class A2NewAcctPlanContractsArray {

    @XmlElement(name = "a2_new_acct_plan_contracts_row")
    protected List<A2NewAcctPlanContractsRow> a2NewAcctPlanContractsRow;

    public List<A2NewAcctPlanContractsRow> getA2NewAcctPlanContractsRow() {
        if (this.a2NewAcctPlanContractsRow == null) {
            this.a2NewAcctPlanContractsRow = new ArrayList<A2NewAcctPlanContractsRow>();
        }
        return this.a2NewAcctPlanContractsRow;
    }

}
