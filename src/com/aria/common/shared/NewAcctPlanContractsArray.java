package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_acct_plan_contracts_array", propOrder = {
    "newAcctPlanContractsRow"
})
public class NewAcctPlanContractsArray {

    @XmlElement(name = "new_acct_plan_contracts_row")
    protected List<NewAcctPlanContractsRow> newAcctPlanContractsRow;

    public List<NewAcctPlanContractsRow> getNewAcctPlanContractsRow() {
        if (this.newAcctPlanContractsRow == null) {
            this.newAcctPlanContractsRow = new ArrayList<NewAcctPlanContractsRow>();
        }
        return this.newAcctPlanContractsRow;
    }

}
