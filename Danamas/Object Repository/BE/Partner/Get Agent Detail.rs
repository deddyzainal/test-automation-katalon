<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Agent Detail</name>
   <tag></tag>
   <elementGuidId>c2adbef4-0e99-40a7-b21d-ce99b90a39fc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
      <webElementGuid>e0170010-1006-42ef-bd1e-0917dadf55a6</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>17751cdb-f64a-49ea-9b10-0037d477bc4f</value>
      <webElementGuid>0d25bccb-a8bc-49bc-b825-3b5a9c7a01ee</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${endpoint}?secure_id=${secure_id}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.requestURL</defaultValue>
      <description></description>
      <id>1af96c58-b0c2-42d0-a169-f679ba5d7aad</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/agentservice/api/backoffice/v1/get_agent_detail'</defaultValue>
      <description></description>
      <id>640509c7-0ade-4c77-93c0-4dbc89ea51c8</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.secure_id</defaultValue>
      <description></description>
      <id>478d056b-8f21-407d-a071-280e2d04b34e</id>
      <masked>false</masked>
      <name>secure_id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>3146e256-afd1-4233-bac1-597c1f83a985</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
