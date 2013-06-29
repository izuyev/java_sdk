java_sdk
========

Aria System's Java SDK
----------------------
Steps to run the SDK generator:
-------------------------------
Make sure the java version is 1.7.
* C:\Users >java -version
* java version "1.7.0_09"
* Java(TM) SE Runtime Environment (build 1.7.0_09-b05)
* Java HotSpot(TM) Client VM (build 23.5-b02, mixed mode, sharing)

Make sure the JAVA_HOME and PATH are pointing to the proper location in the system environment variable settings.
*     JAVA_HOME = C:\Program Files\Java\jdk1.7.0
*     PATH = %JAVA_HOME%\bin

Download the SDK Generator project from and run the following command.
* E:\Aria\Source Code\aria_sdk\SDKGenerator> java -jar RunSDKGenerator.jar

In the UI that opens by the above command, feed the wsdl url with required version (example, https://secure.future.stage.ariasystems.net/api/Advanced/wsdl/6.7/complete-doc_literal_wrapped.wsdl).

Enter the Library name like AriaSDK-5.7 to represent the wsdl version for reference.

Feed both the Source Path and Library path with any suitable path where the sdk source (AriaSDK_src.zip) and library files (AriaSDK-6.x.jar) has to be copied.

Click on 'Generate Code' and find the AriaSDK- 6.x.jar and AriaSDK_src.zip in the location chosen in step 5.
