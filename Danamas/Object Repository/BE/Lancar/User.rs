<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>User</name>
   <tag></tag>
   <elementGuidId>8761c735-92ec-42a2-94d4-167f381f42fc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;fullName\&quot;: \&quot;${fullName}\&quot;,\n  \&quot;nik\&quot;: \&quot;3114050501850036\&quot;,\n  \&quot;motherName\&quot;: \&quot;Ratna\&quot;,\n  \&quot;gender\&quot;: \&quot;Laki-laki\&quot;,\n  \&quot;dateOfBirth\&quot;: 549651600,\n  \&quot;birthPlace\&quot;: \&quot;Jakarta\&quot;,\n  \&quot;maritalStatus\&quot;: \&quot;Belum kawin\&quot;,\n  \&quot;education\&quot;: \&quot;SMA\&quot;,\n  \&quot;address\&quot;: \&quot;Jl Anggrek Garuda no 10\&quot;,\n  \&quot;rt\&quot;: \&quot;45\&quot;,\n  \&quot;rw\&quot;: \&quot;34\&quot;,\n  \&quot;area\&quot;: \&quot;PALMERAH\&quot;,\n  \&quot;postalcode\&quot;: 11480,\n  \&quot;provinceId\&quot;: 6,\n  \&quot;provinceName\&quot;: \&quot;DKI Jakarta\&quot;,\n  \&quot;cityId\&quot;: 40,\n  \&quot;cityName\&quot;: \&quot;Jakarta Barat\&quot;,\n  \&quot;subDistrictId\&quot;: 469,\n  \&quot;subDistrictName\&quot;: \&quot;Palmerah\&quot;,\n  \&quot;isDifferentResidentialAddress\&quot;: false\n}&quot;,
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
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
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
      <defaultValue>'${requestURL}/userservicev1/api/lancar/v2/user'</defaultValue>
      <description></description>
      <id>cc365338-c7d0-43eb-9f20-3642d4a2909e</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c799da36-80db-4805-a3b5-71dda6217db5</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6d6a7685-d6a4-4823-8ada-6cc47dd9ab47</id>
      <masked>false</masked>
      <name>datetime</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>85e3ce6b-2c6d-4c56-8524-6c464e4875b0</id>
      <masked>false</masked>
      <name>fullName</name>
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
