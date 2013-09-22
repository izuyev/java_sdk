package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_new_acct_custom_rates_array", propOrder = {
    "a5NewAcctCustomRatesRow"
})
public class A5NewAcctCustomRatesArray {

    @XmlElement(name = "a5_new_acct_custom_rates_row")
    protected List<A5NewAcctCustomRatesRow> a5NewAcctCustomRatesRow;

    public List<A5NewAcctCustomRatesRow> getA5NewAcctCustomRatesRow() {
        if (this.a5NewAcctCustomRatesRow == null) {
            this.a5NewAcctCustomRatesRow = new ArrayList<A5NewAcctCustomRatesRow>();
        }
        return this.a5NewAcctCustomRatesRow;
    }

}
