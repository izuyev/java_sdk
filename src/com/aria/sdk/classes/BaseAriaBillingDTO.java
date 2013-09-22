package com.aria.sdk.classes;

public class BaseAriaBillingDTO {
	/******************* CLASS ATTRIBUTES ********************/
	private String url;
	private String logFile;
	private Boolean debug;
	private CallType callType;
	private OutPutFormat outPutFormat;
	/******************* END - CLASS ATTRIBUTES ********************/
	
	
	/**
	 * Constructor for the BaseAriaBillingDTO class.
	 * @param url
	 * @param logFile
	 * @param debug
	 * @param calltype
	 * @param outPutFormat
	 */
	public BaseAriaBillingDTO(String url, String logFile, Boolean debug,
			CallType calltype, OutPutFormat outPutFormat) {
		super();
		this.url = url;
		this.logFile = logFile;
		this.debug = debug;
		this.callType = calltype;
		this.outPutFormat = outPutFormat;
	}

	public BaseAriaBillingDTO() {
	}
	/******************* GETTERS ********************/
	public String getUrl() {
		return url;
	}

	public String getLogFile() {
		return logFile;
	}

	public Boolean getDebug() {
		return debug;
	}

	public CallType getCallType() {
		return callType;
	}

	public OutPutFormat getOutPutFormat() {
		return outPutFormat;
	}
	/******************* END - GETTERS ********************/

	/******************* SETTERS ********************/
	public void setUrl(String url) {
		this.url = url;
	}

	public void setLogFile(String logFile) {
		this.logFile = logFile;
	}

	public void setDebug(Boolean debug) {
		this.debug = debug;
	}

	public void setCallType(CallType callType) {
		this.callType = callType;
	}

	public void setOutPutFormat(OutPutFormat outPutFormat) {
		this.outPutFormat = outPutFormat;
	}
	/******************* END - SETTERS ********************/
}
