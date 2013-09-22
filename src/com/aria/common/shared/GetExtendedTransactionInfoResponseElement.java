package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "transCreateUser", "transCreateDate", "extendedTransactionQualifiers"})
@XmlRootElement(name = "get_extended_transaction_infoResponseElement")
public class GetExtendedTransactionInfoResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "trans_create_user")
    protected String transCreateUser;
    @XmlElement(name = "trans_create_date")
    protected String transCreateDate;
    @XmlElement(name = "extended_transaction_qualifiers")
    protected List<ExtendedTransactionQualifiersReturnElement> extendedTransactionQualifiers;
    
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

    public String getTransCreateUser() {
        return transCreateUser;
    }

    public void setTransCreateUser(String value) {
        this.transCreateUser = value;
    }

    public String getTransCreateDate() {
        return transCreateDate;
    }

    public void setTransCreateDate(String value) {
        this.transCreateDate = value;
    }

    public List<ExtendedTransactionQualifiersReturnElement> getExtendedTransactionQualifiers() {
        if (this.extendedTransactionQualifiers == null) {
            this.extendedTransactionQualifiers = new ArrayList<ExtendedTransactionQualifiersReturnElement>();
        }
        return this.extendedTransactionQualifiers;
    }
}
