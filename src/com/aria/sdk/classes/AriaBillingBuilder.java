package com.aria.sdk.classes;

public class AriaBillingBuilder {

	private static AriaBillingCompleteRest ariaBillingCompleteRest = null;

	private static AriaBillingCompleteSoap ariaBillingCompleteSoap = null;

	private AriaBillingBuilder(){}

	public static AriaBillingComplete getAriaSDK(BaseAriaBillingDTO baseAriaBillingDTO) throws Exception{
		if(baseAriaBillingDTO.getCallType().equals(CallType.REST)) {
			if(ariaBillingCompleteRest == null) {
				ariaBillingCompleteRest = new AriaBillingCompleteRest(baseAriaBillingDTO);
			}
			return ariaBillingCompleteRest;
		} else {
			if(ariaBillingCompleteSoap == null) {
				ariaBillingCompleteSoap = new AriaBillingCompleteSoap(baseAriaBillingDTO);
			}
			return ariaBillingCompleteSoap;
		}
	}
}
