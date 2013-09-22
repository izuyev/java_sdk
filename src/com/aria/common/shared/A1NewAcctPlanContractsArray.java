package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_new_acct_plan_contracts_array", propOrder = {
    "a1NewAcctPlanContractsRow"
})
public class A1NewAcctPlanContractsArray {

    @XmlElement(name = "a1_new_acct_plan_contracts_row")
    protected List<A1NewAcctPlanContractsRow> a1NewAcctPlanContractsRow;

    public List<A1NewAcctPlanContractsRow> getA1NewAcctPlanContractsRow() {
        if (this.a1NewAcctPlanContractsRow == null) {
            this.a1NewAcctPlanContractsRow = new ArrayList<A1NewAcctPlanContractsRow>();
        }
        return this.a1NewAcctPlanContractsRow;
    }

}
