<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Submit loan</name>
   <tag></tag>
   <elementGuidId>9559b4de-87ba-4260-9924-bf4ca7df0688</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;tenure\&quot;: 10,\n  \&quot;principal\&quot;: 668000000,\n  \&quot;loanTypeId\&quot;: \&quot;1A\&quot;,\n  \&quot;njop\&quot;: 836000000,\n  \&quot;loanNeedId\&quot;: \&quot;1\&quot;,\n  \&quot;loanNeedName\&quot;: \&quot;Pribadi\&quot;,\n  \&quot;occupationId\&quot;: \&quot;2\&quot;,\n  \&quot;occupationName\&quot;: \&quot;Saya pegawai tetap\&quot;,\n  \&quot;annualIncome\&quot;: \&quot;40000000\&quot;,\n  \&quot;occupationQuestion\&quot;: \&quot;Berapa lama Anda telah menjalankan pekerjaan Anda saat ini?\&quot;,\n  \&quot;workingExperience\&quot;: \&quot;1\&quot;,\n  \&quot;ivtData\&quot;: {\n    \&quot;buildingSize\&quot;: null,\n    \&quot;propertyType\&quot;: null,\n    \&quot;landSize\&quot;: null,\n    \&quot;region\&quot;: null,\n    \&quot;city\&quot;: null,\n    \&quot;district\&quot;: null,\n    \&quot;subdistrict\&quot;: null,\n    \&quot;postalCode\&quot;: null,\n    \&quot;latitude\&quot;: null,\n    \&quot;longitude\&quot;: null,\n    \&quot;ivt\&quot;: 836000000,\n    \&quot;collateral\&quot;: 836000000\n  },\n  \&quot;adId\&quot;: \&quot;\&quot;,\n  \&quot;sourceLoanName\&quot;: \&quot;Lancar Aplikasi\&quot;,\n  \&quot;sourceLoanId\&quot;: 1\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>1d556da4-2cc0-44f4-91c9-7e7639527d69</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>platform</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>c6ec59df-5508-4ad9-994e-40dc8cafeed4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>${datetime}</value>
      <webElementGuid>c483482f-e809-4469-99a4-c9277feb0bd2</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authorization</name>
      <type>Main</type>
      <value>Bearer ${token}</value>
      <webElementGuid>aa36e60f-2335-4e0b-96cf-ba16554f96dc</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-authenticated-userid</name>
      <type>Main</type>
      <value>${userId}</value>
      <webElementGuid>1e55efc8-ade8-44f7-b70f-f89db007a8b2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
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
      <id>49358066-c823-4d31-bf74-95f521e3f0f7</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/loanservice/api/lancar/v2/loan'</defaultValue>
      <description></description>
      <id>cc365338-c7d0-43eb-9f20-3642d4a2909e</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>c799da36-80db-4805-a3b5-71dda6217db5</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.userId</defaultValue>
      <description></description>
      <id>10343efd-43a5-4a70-9747-cafc6cd76248</id>
      <masked>false</masked>
      <name>userId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.datetime</defaultValue>
      <description></description>
      <id>6d6a7685-d6a4-4823-8ada-6cc47dd9ab47</id>
      <masked>false</masked>
      <name>datetime</name>
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
