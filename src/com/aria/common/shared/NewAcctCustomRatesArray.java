package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_acct_custom_rates_array", propOrder = {
    "newAcctCustomRatesRow"
})
public class NewAcctCustomRatesArray {

    @XmlElement(name = "new_acct_custom_rates_row")
    protected List<NewAcctCustomRatesRow> newAcctCustomRatesRow;

    public List<NewAcctCustomRatesRow> getNewAcctCustomRatesRow() {
        if (this.newAcctCustomRatesRow == null) {
            this.newAcctCustomRatesRow = new ArrayList<NewAcctCustomRatesRow>();
        }
        return this.newAcctCustomRatesRow;
    }

}
