Aria System's Java SDK
=====================
Guidelines:
-------------------------------
Make sure the java version is 1.7.
* C:\Users >java -version
* java version "1.7.0_09"
* Java(TM) SE Runtime Environment (build 1.7.0_09-b05)
* Java HotSpot(TM) Client VM (build 23.5-b02, mixed mode, sharing)

Download the Java SDK library AriaSDK.jar from https://github.com/AriaSystems/java_sdk/download/.
The dependent third-party libraries are available in https://github.com/AriaSystems/java_sdk/download/third-party/.

Import the above libraries to the java project from where the Aria APIs are to be called.

To call the API in REST mode, form the baseAriaBillingDTO as below by passing the "CallType.REST" and use it to get the ariaBillingComplete handle.
The ariaBillingComplete has the methods to all the core Aria APIs. Call the required API method as seen in the example below.

The following example uses "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php" as the dispatcher, client_no as 100 and auth_key as A1234B6789.

            /*REST CALL*/
            BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(
                        "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php", "logger",
                        false/* Debug */, CallType.REST, OutPutFormat.OUTPUT_JSON);
            AriaBillingComplete ariaBillingComplete = AriaBillingBuilder.getAriaSDK(baseAriaBillingDTO);
            // Form the api inputs
            com.aria.common.shared.EventListRow eventListRow1 = new com.aria.common.shared.EventListRow();
            eventListRow1.setEventList(120L);
            com.aria.common.shared.EventListRow eventListRow2 = new com.aria.common.shared.EventListRow();
            eventListRow2.setEventList(130L);
            com.aria.common.shared.EventListArray eventListArray = new com.aria.common.shared.EventListArray();
            eventListArray.getEventListRow().add(eventListRow1);
            eventListArray.getEventListRow().add(eventListRow2);
            // Call the API
            Map<String,Object> hashMapReturnValues = ariaBillingComplete.subscribeEvents(100L,"A1234B6789", eventListArray);
            // Read the output from the map as below.
            System.out.println("error_code: " + hashMapReturnValues.get("error_code"));
            System.out.println("error_msg: " + hashMapReturnValues.get("error_msg"));
 
To call the API in SOAP mode, it is exactly same as the above code, except for the "CallType.SOAP" as below.

            /*SOAP CALL*/
            BaseAriaBillingDTO baseAriaBillingDTO = new BaseAriaBillingDTO(
                        "https://secure.future.stage.ariasystems.net/api/ws/api_ws_class_dispatcher.php", "logger",
                        false/* Debug */, CallType.SOAP, OutPutFormat.OUTPUT_JSON);
