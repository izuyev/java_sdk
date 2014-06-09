package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "password",    "secretQuestionAnswer",    "secretQuestion",    "pin"})
@XmlRootElement(name = "update_acct_credentials")
public class UpdateAcctCredentials {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "password")
    protected String password;
        @XmlElement(name = "secret_question_answer")
    protected String secretQuestionAnswer;
        @XmlElement(name = "secret_question")
    protected String secretQuestion;
        @XmlElement(name = "pin")
    protected String pin;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
            public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }
            public String getSecretQuestionAnswer() {
        return secretQuestionAnswer;
    }

    public void setSecretQuestionAnswer(String value) {
        this.secretQuestionAnswer = value;
    }
            public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String value) {
        this.secretQuestion = value;
    }
            public String getPin() {
        return pin;
    }

    public void setPin(String value) {
        this.pin = value;
    }
            
}
