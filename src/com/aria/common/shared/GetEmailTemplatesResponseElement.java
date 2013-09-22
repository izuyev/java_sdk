package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"templatesByClient", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_email_templatesResponseElement")
public class GetEmailTemplatesResponseElement {

    @XmlElement(name = "templates_by_client")
    protected List<TemplatesByClientReturnElement> templatesByClient;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<TemplatesByClientReturnElement> getTemplatesByClient() {
        if (this.templatesByClient == null) {
            this.templatesByClient = new ArrayList<TemplatesByClientReturnElement>();
        }
        return this.templatesByClient;
    }public Long getErrorCode() {
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

    
}
