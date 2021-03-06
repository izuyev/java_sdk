package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "so_items_ReturnElement", propOrder = {"lineNo", "clientSku", "label", "altLabel", "longDesc", "units", "unitAmount", "lineAmount", "lineComments"})
public class SoItemsReturnElement {

    @XmlElement(name = "line_no")
    protected Long lineNo;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "label")
    protected String label;
    @XmlElement(name = "alt_label")
    protected String altLabel;
    @XmlElement(name = "long_desc")
    protected String longDesc;
    @XmlElement(name = "units")
    protected Long units;
    @XmlElement(name = "unit_amount")
    protected Double unitAmount;
    @XmlElement(name = "line_amount")
    protected Double lineAmount;
    @XmlElement(name = "line_comments")
    protected String lineComments;
    
    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long value) {
        this.lineNo = value;
    }

    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public String getAltLabel() {
        return altLabel;
    }

    public void setAltLabel(String value) {
        this.altLabel = value;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String value) {
        this.longDesc = value;
    }

    public Long getUnits() {
        return units;
    }

    public void setUnits(Long value) {
        this.units = value;
    }

    public Double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Double value) {
        this.unitAmount = value;
    }

    public Double getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(Double value) {
        this.lineAmount = value;
    }

    public String getLineComments() {
        return lineComments;
    }

    public void setLineComments(String value) {
        this.lineComments = value;
    }

    
}
