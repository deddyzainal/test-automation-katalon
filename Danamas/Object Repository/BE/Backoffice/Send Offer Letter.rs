<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Send Offer Letter</name>
   <tag></tag>
   <elementGuidId>4fb14c33-5d0b-493d-9198-ac9acb2f5beb</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;collateral_information\&quot;: {\n        \&quot;collateral_type\&quot;: \&quot;Rumah\&quot;,\n        \&quot;address\&quot;: \&quot;Jl. Katalon no. 101\&quot;,\n        \&quot;certificate_number\&quot;: \&quot;12341234\&quot;,\n        \&quot;land_size\&quot;: 75,\n        \&quot;building_size\&quot;: 85\n    },\n    \&quot;loan_information\&quot;: {\n        \&quot;admin_fee_rate\&quot;: 0.02,\n        \&quot;admin_fee_amount\&quot;: 8100000,\n        \&quot;advance_penalty_rate\&quot;: 0.025,\n        \&quot;borrower_fullname\&quot;: \&quot;Debby Anggraini\&quot;,\n        \&quot;borrower_id\&quot;: \&quot;${borrowerID}\&quot;,\n        \&quot;fire_insurance_fee\&quot;: 1750000,\n        \&quot;installment_amount\&quot;: 8957814,\n        \&quot;interest_rate\&quot;: 15.25,\n        \&quot;life_insurance_fee\&quot;: 1500000,\n        \&quot;loan_amount\&quot;: 405000000,\n        \&quot;loan_fee\&quot;: 8100000,\n        \&quot;loan_status\&quot;: \&quot;OFFER_SENT\&quot;,\n        \&quot;notary_fee_amount\&quot;: 1000000,\n        \&quot;penalty_rate\&quot;: 0.03,\n        \&quot;provision_fee_amount\&quot;: 5000000,\n        \&quot;provision_fee_rate\&quot;: 0.05,\n        \&quot;tenure\&quot;: 10,\n        \&quot;loan_number\&quot;: \&quot;${loanNumber}\&quot;,\n        \&quot;annual_interest_rate\&quot;: \&quot;0.1525\&quot;\n    },\n    \&quot;loan_id\&quot;: \&quot;${loanID}\&quot;\n}&quot;,
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
      <webElementGuid>712b00ac-4802-4c0b-9a21-7d8c9a280617</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>1661ff23-9bf9-4361-aed7-28e27af6c731</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authority</name>
      <type>Main</type>
      <value>${requestURL}</value>
      <webElementGuid>f30d445b-81dd-45e4-8d17-e1f339c4903c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json, text/plain, */*</value>
      <webElementGuid>d16a05b3-b3e8-45d2-8088-c247d7e3ed64</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en-US,en;q=0.9</value>
      <webElementGuid>0674e3f2-fe9f-475f-bc6a-2838a90b0a52</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${adminBearer}</value>
      <webElementGuid>d1dc0377-8aae-4ff9-a808-26eece5e2cae</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Origin</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>bc0de177-6c3d-4b43-9109-ce314f1008cf</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>platform</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>02da7f78-b2e5-4f76-8268-4988d1673178</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Referer</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>3632696e-afba-4d6f-aeff-d86b425e4699</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>ba22e3af-8d30-4cb0-aa40-4c16026092d2</value>
      <webElementGuid>221eb6c8-51ee-4305-9204-1fe267f96eb4</webElementGuid>
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
      <id>eba82203-1113-4f40-8e0d-58804c5017f8</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/loanservice/api/backoffice/v1/update_offer'</defaultValue>
      <description></description>
      <id>7202fd5f-4c03-4392-80f1-d244ec84b968</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.borrowerID</defaultValue>
      <description></description>
      <id>ca43b0a2-0d84-4658-bc64-270f6b9c3d0d</id>
      <masked>false</masked>
      <name>borrowerID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.loanNumber</defaultValue>
      <description></description>
      <id>283fd125-fc53-4b4c-8ee9-9bac145c4a98</id>
      <masked>false</masked>
      <name>loanNumber</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.loanID</defaultValue>
      <description></description>
      <id>ce0c45be-849d-4492-8223-59655ab3ea22</id>
      <masked>false</masked>
      <name>loanID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.adminBearer</defaultValue>
      <description></description>
      <id>b4a6326d-e923-49b3-8e0c-988801a5376f</id>
      <masked>false</masked>
      <name>adminBearer</name>
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
