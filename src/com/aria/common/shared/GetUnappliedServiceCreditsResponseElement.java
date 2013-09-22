package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "unappliedServiceCredits"})
@XmlRootElement(name = "get_unapplied_service_creditsResponseElement")
public class GetUnappliedServiceCreditsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "unapplied_service_credits")
    protected List<UnappliedServiceCreditsReturnElement> unappliedServiceCredits;
    
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

    public List<UnappliedServiceCreditsReturnElement> getUnappliedServiceCredits() {
        if (this.unappliedServiceCredits == null) {
            this.unappliedServiceCredits = new ArrayList<UnappliedServiceCreditsReturnElement>();
        }
        return this.unappliedServiceCredits;
    }
}
