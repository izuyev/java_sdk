package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctNotificationDetails"})
@XmlRootElement(name = "get_acct_notification_detailsResponseElement")
public class GetAcctNotificationDetailsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_notification_details")
    protected List<AcctNotificationDetailsReturnElement> acctNotificationDetails;
    
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

    public List<AcctNotificationDetailsReturnElement> getAcctNotificationDetails() {
        if (this.acctNotificationDetails == null) {
            this.acctNotificationDetails = new ArrayList<AcctNotificationDetailsReturnElement>();
        }
        return this.acctNotificationDetails;
    }
}
