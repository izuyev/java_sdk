package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "price_array", propOrder = {
    "priceRow"
})
public class PriceArray {

    @XmlElement(name = "price_row")
    protected List<PriceRow> priceRow;

    public List<PriceRow> getPriceRow() {
        if (this.priceRow == null) {
            this.priceRow = new ArrayList<PriceRow>();
        }
        return this.priceRow;
    }

}
