package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "exemptionLevel", "exemptionLevelDesc"})
@XmlRootElement(name = "get_acct_tax_exempt_statusResponseElement")
public class GetAcctTaxExemptStatusResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "exemption_level")
    protected Long exemptionLevel;
    @XmlElement(name = "exemption_level_desc")
    protected String exemptionLevelDesc;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public Long getExemptionLevel() {
        return exemptionLevel;
    }

    public void setExemptionLevel(Long value) {
        this.exemptionLevel = value;
    }

    public String getExemptionLevelDesc() {
        return exemptionLevelDesc;
    }

    public void setExemptionLevelDesc(String value) {
        this.exemptionLevelDesc = value;
    }

    
}
