package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web_vals_in_array", propOrder = {
    "webValsInRow"
})
public class WebValsInArray {

    @XmlElement(name = "web_vals_in_row")
    protected List<WebValsInRow> webValsInRow;

    public List<WebValsInRow> getWebValsInRow() {
        if (this.webValsInRow == null) {
            this.webValsInRow = new ArrayList<WebValsInRow>();
        }
        return this.webValsInRow;
    }

}
