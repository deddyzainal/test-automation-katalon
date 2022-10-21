<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Post CUE Credit Criteria</name>
   <tag></tag>
   <elementGuidId>e3973d58-feab-47b5-91c3-a1c1729e2e5f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;loan_id\&quot;: \&quot;${loanID}\&quot;,\n    \&quot;loan_assessment_id\&quot;: \&quot;\&quot;,\n    \&quot;kriteria_verifikasi\&quot;: {\n        \&quot;level_risiko\&quot;: \&quot;Low risk\&quot;,\n        \&quot;industri\&quot;: \&quot;Perdagangan (Warung Klontong dan Kebutuhan Primer)\&quot;,\n        \&quot;additional_note\&quot;: \&quot;Qwerty\&quot;\n    },\n    \&quot;qa\&quot;: [\n        {\n            \&quot;question\&quot;: 11,\n            \&quot;answers\&quot;: [\n                43\n            ]\n        },\n        {\n            \&quot;question\&quot;: 12,\n            \&quot;answers\&quot;: [\n                45\n            ]\n        },\n        {\n            \&quot;question\&quot;: 13,\n            \&quot;answers\&quot;: [\n                47\n            ]\n        },\n        {\n            \&quot;question\&quot;: 14,\n            \&quot;answers\&quot;: [\n                49\n            ]\n        },\n        {\n            \&quot;question\&quot;: 15,\n            \&quot;answers\&quot;: [\n                51\n            ]\n        },\n        {\n            \&quot;question\&quot;: 16,\n            \&quot;answers\&quot;: [\n                53\n            ]\n        },\n        {\n            \&quot;question\&quot;: 17,\n            \&quot;answers\&quot;: [\n                55\n            ]\n        },\n        {\n            \&quot;question\&quot;: 18,\n            \&quot;answers\&quot;: [\n                57\n            ]\n        },\n        {\n            \&quot;question\&quot;: 19,\n            \&quot;answers\&quot;: [\n                59\n            ]\n        },\n        {\n            \&quot;question\&quot;: 20,\n            \&quot;answers\&quot;: [\n                61\n            ]\n        }\n    ]\n}&quot;,
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
      <webElementGuid>ceae564d-4dad-469b-93e0-8a334d373f67</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>3f480a41-ab79-4cc0-9f63-aaf134d56b58</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authority</name>
      <type>Main</type>
      <value>${requestURL}</value>
      <webElementGuid>c414942c-5763-4f68-afca-493da575a169</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json, text/plain, */*</value>
      <webElementGuid>b435b475-8ba8-4ad6-a0b6-6e3f5c9ea976</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en-US,en;q=0.9</value>
      <webElementGuid>580476a1-056a-4066-9bbe-da70eb0e5579</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${caBearer}</value>
      <webElementGuid>8134a0fc-b264-4189-9a1d-71e863d9e71c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>834de5eb-f3ec-4d1b-aab8-b45395addefb</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Origin</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>407a1197-4efd-4093-927c-d3e70e074352</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>platform</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>d6208dc3-197b-4b87-8d3d-78adf124b811</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Referer</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>f0bbea6f-4c54-454e-8af1-b50d58855288</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>535998da-25ae-4878-9cec-c7292b027ee0</value>
      <webElementGuid>589c7042-0bae-4a33-a0d9-96140026bedd</webElementGuid>
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
      <id>d3e2ae86-9851-49fc-a0df-d46bdece2445</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/loanservice/api/backoffice/v1/assessment/post_cue_credit_criteria/upsert'</defaultValue>
      <description></description>
      <id>a7b77ad6-86bd-43eb-ab17-71147c1293f7</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.loanID</defaultValue>
      <description></description>
      <id>dcaf7971-e221-4efa-b98a-567834ff0f15</id>
      <masked>false</masked>
      <name>loanID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.caBearer</defaultValue>
      <description></description>
      <id>e623f7d8-5254-4f7a-a251-a9f9b16179c8</id>
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
