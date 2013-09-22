package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_new_acct_custom_rates_array", propOrder = {
    "a4NewAcctCustomRatesRow"
})
public class A4NewAcctCustomRatesArray {

    @XmlElement(name = "a4_new_acct_custom_rates_row")
    protected List<A4NewAcctCustomRatesRow> a4NewAcctCustomRatesRow;

    public List<A4NewAcctCustomRatesRow> getA4NewAcctCustomRatesRow() {
        if (this.a4NewAcctCustomRatesRow == null) {
            this.a4NewAcctCustomRatesRow = new ArrayList<A4NewAcctCustomRatesRow>();
        }
        return this.a4NewAcctCustomRatesRow;
    }

}
