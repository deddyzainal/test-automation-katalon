<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Modul Penghasilan</name>
   <tag></tag>
   <elementGuidId>20f7feff-5392-4994-b4ed-abc572aedfb0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;loan_income_module_id\&quot;: \&quot;\&quot;,\n    \&quot;loan_id\&quot;: \&quot;${loanID}\&quot;,\n    \&quot;bank_statement\&quot;: {\n        \&quot;bank_statement_1\&quot;: 0,\n        \&quot;bank_statement_2\&quot;: 0,\n        \&quot;bank_statement_3\&quot;: 0,\n        \&quot;average_ebit\&quot;: 0.3,\n        \&quot;spouse_average_monthly_income\&quot;: 25000000,\n        \&quot;net_credit_month_1\&quot;: 50000000,\n        \&quot;net_credit_month_2\&quot;: 50000000,\n        \&quot;net_credit_month_3\&quot;: 50000000,\n        \&quot;net_credit_average\&quot;: 50000000\n    },\n    \&quot;salary_slip\&quot;: {\n        \&quot;annual_salary\&quot;: 300000000,\n        \&quot;monthly_salary\&quot;: 25000000\n    }\n}&quot;,
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
      <webElementGuid>ec7894b5-89f8-4ffe-ab96-fa9184f26b37</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>da0104f2-b107-4a04-a96b-7c3f19434ee0</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authority</name>
      <type>Main</type>
      <value>${requestURL}</value>
      <webElementGuid>3bcd71a5-8cbb-45d8-8a99-0aa1e875549f</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json, text/plain, */*</value>
      <webElementGuid>91e51ea2-9deb-480b-856a-007dfaaf1ace</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en-US,en;q=0.9</value>
      <webElementGuid>238c1308-a891-46b3-81a7-edd5b1a61276</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${caBearer}</value>
      <webElementGuid>3fd43080-dc16-42c6-8716-7589f426221e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>bbcc84bb-79ee-47a6-ad08-f6124367530d</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Origin</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>2e2a3864-614a-47f1-be7b-b6c9e8614f12</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>platform</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>5bab9109-c44c-4252-ae42-a6f2304051a8</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Referer</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>c4930117-11e8-4413-a623-f61e858139bb</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>5431b3a4-78da-456c-bd39-187bf72b2eb2</value>
      <webElementGuid>b5d11af8-47dd-4029-bf20-ed32b937a255</webElementGuid>
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
      <id>c81f9397-517a-4082-87b1-91007acd3565</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/loanservice/api/backoffice/v1/assessment/income_module/upsert'</defaultValue>
      <description></description>
      <id>5dd7faa7-4725-4dfc-8aad-085fdac0a4fa</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.loanID</defaultValue>
      <description></description>
      <id>76b700fa-b4f5-4bdd-bace-3b18bedde14e</id>
      <masked>false</masked>
      <name>loanID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.caBearer</defaultValue>
      <description></description>
      <id>7f90578a-b136-47cd-b6e3-a0ed1dae5b69</id>
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
