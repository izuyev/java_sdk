package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_templates_ReturnElement", propOrder = {"recurringCreditTemplateNo", "creditTemplateName", "clientCreditTemplateId"})
public class CreditTemplatesReturnElement {

    @XmlElement(name = "recurring_credit_template_no")
    protected Long recurringCreditTemplateNo;
    @XmlElement(name = "credit_template_name")
    protected String creditTemplateName;
    @XmlElement(name = "client_credit_template_id")
    protected String clientCreditTemplateId;
    
    public Long getRecurringCreditTemplateNo() {
        return recurringCreditTemplateNo;
    }

    public void setRecurringCreditTemplateNo(Long value) {
        this.recurringCreditTemplateNo = value;
    }

    public String getCreditTemplateName() {
        return creditTemplateName;
    }

    public void setCreditTemplateName(String value) {
        this.creditTemplateName = value;
    }

    public String getClientCreditTemplateId() {
        return clientCreditTemplateId;
    }

    public void setClientCreditTemplateId(String value) {
        this.clientCreditTemplateId = value;
    }

    
}
