<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Final Approval</name>
   <tag></tag>
   <elementGuidId>5ada923d-4d7f-4edb-ba18-b608a9d813a4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;loan_id\&quot;: \&quot;${loanID}\&quot;,\n    \&quot;loan_assessment_id\&quot;: \&quot;\&quot;,\n    \&quot;final_credit_approval_resolution\&quot;: {\n        \&quot;ca_decision_date\&quot;: 1666064582,\n        \&quot;ca_decision\&quot;: \&quot;PASS\&quot;,\n        \&quot;reject_reason_1\&quot;: \&quot;\&quot;,\n        \&quot;reject_reason_2\&quot;: \&quot;\&quot;,\n        \&quot;reject_reason_3\&quot;: \&quot;\&quot;,\n        \&quot;ca_note\&quot;: \&quot;Qwerty\&quot;\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Encoding</name>
      <type>Main</type>
      <value>gzip, deflate</value>
      <webElementGuid>79532fb5-b616-4f87-9976-4031ac791674</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>98ce238d-443b-469f-b4ff-ad1c73ad740e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authority</name>
      <type>Main</type>
      <value>${requestURL}</value>
      <webElementGuid>b2077341-2b21-47e2-9ae9-22295b67fa04</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json, text/plain, */*</value>
      <webElementGuid>201f8cbb-fbec-4c44-b733-c57924d23244</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en-US,en;q=0.9</value>
      <webElementGuid>ca3067b2-28a1-4dbd-9211-36d11e3e00b1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${caBearer}</value>
      <webElementGuid>8123f0a4-3fb6-4cc7-8fe6-9f964e0f9c26</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>cbd58363-8b0c-432e-b751-05b7c6b3fe84</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Origin</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>499ed90a-987a-4c13-884e-1a86f377c328</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>platform</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>2c2bd07d-90f8-47bc-ab47-9ae82fee4f9e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Referer</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>aaa47456-e859-4748-bc6c-605c7b123f7a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>45dee86a-58c3-43bf-9bd6-c2624c6d4b2e</value>
      <webElementGuid>42d23a5d-8f5b-4e6b-8c97-67879b3d3299</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${endpoint}</restUrl>
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
      <id>76b72ac3-f660-4cff-85d8-c84005ee67e0</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/loanservice/api/backoffice/v1/assessment/final_approval/upsert'</defaultValue>
      <description></description>
      <id>fe1207d4-f1af-49c6-83da-67631498cefa</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.loanID</defaultValue>
      <description></description>
      <id>a83ce772-b8f1-4552-ab0e-171c49c35e2d</id>
      <masked>false</masked>
      <name>loanID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.caBearer</defaultValue>
      <description></description>
      <id>eb362c22-6303-44a6-b9ab-d397d9537f8a</id>
      <masked>false</masked>
      <name>caBearer</name>
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
