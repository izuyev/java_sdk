package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "paymentApplications"})
@XmlRootElement(name = "get_payment_applicationsResponseElement")
public class GetPaymentApplicationsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "payment_applications")
    protected List<PaymentApplicationsReturnElement> paymentApplications;
    
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

    public List<PaymentApplicationsReturnElement> getPaymentApplications() {
        if (this.paymentApplications == null) {
            this.paymentApplications = new ArrayList<PaymentApplicationsReturnElement>();
        }
        return this.paymentApplications;
    }
}
