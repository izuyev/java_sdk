package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre_calc_sku_array", propOrder = {
    "preCalcSkuRow"
})
public class PreCalcSkuArray {

    @XmlElement(name = "pre_calc_sku_row")
    protected List<PreCalcSkuRow> preCalcSkuRow;

    public List<PreCalcSkuRow> getPreCalcSkuRow() {
        if (this.preCalcSkuRow == null) {
            this.preCalcSkuRow = new ArrayList<PreCalcSkuRow>();
        }
        return this.preCalcSkuRow;
    }

}
