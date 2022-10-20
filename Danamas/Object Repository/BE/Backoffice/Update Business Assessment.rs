<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Business Assessment</name>
   <tag></tag>
   <elementGuidId>a836f07f-a9c1-441e-aafe-c665d9062f85</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;loan_id\&quot;: \&quot;${loanID}\&quot;,\n    \&quot;loan_assessment_id\&quot;: \&quot;\&quot;,\n    \&quot;assessment\&quot;: {\n        \&quot;additional_note\&quot;: \&quot;Qwerty\&quot;,\n        \&quot;alamat_tempat_usaha\&quot;: \&quot;Jl. Qwerty no. 101\&quot;,\n        \&quot;bidang_usaha\&quot;: \&quot;Perdagangan (Warung Klontong dan Kebutuhan Primer)\&quot;,\n        \&quot;model_of_assessment\&quot;: \&quot;In-person\&quot;,\n        \&quot;tanggal_assessment\&quot;: \&quot;2022-10-16T10:10:23.335Z\&quot;,\n        \&quot;waktu_assessment\&quot;: \&quot;13:10:32\&quot;\n    },\n    \&quot;qa\&quot;: [\n        {\n            \&quot;question\&quot;: 1,\n            \&quot;answers\&quot;: [\n                1\n            ]\n        },\n        {\n            \&quot;question\&quot;: 2,\n            \&quot;answers\&quot;: [\n                9\n            ]\n        },\n        {\n            \&quot;question\&quot;: 3,\n            \&quot;answers\&quot;: [\n                11\n            ]\n        },\n        {\n            \&quot;question\&quot;: 4,\n            \&quot;answers\&quot;: [\n                16\n            ]\n        },\n        {\n            \&quot;question\&quot;: 5,\n            \&quot;answers\&quot;: [\n                19\n            ]\n        },\n        {\n            \&quot;question\&quot;: 6,\n            \&quot;answers\&quot;: [\n                24\n            ]\n        },\n        {\n            \&quot;question\&quot;: 7,\n            \&quot;answers\&quot;: [\n                28\n            ]\n        },\n        {\n            \&quot;question\&quot;: 8,\n            \&quot;answers\&quot;: [\n                34\n            ]\n        },\n        {\n            \&quot;question\&quot;: 9,\n            \&quot;answers\&quot;: [\n                36\n            ]\n        },\n        {\n            \&quot;question\&quot;: 10,\n            \&quot;answers\&quot;: [\n                39\n            ]\n        }\n    ]\n}&quot;,
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
      <webElementGuid>83f832f4-4611-400f-9d9b-5a5a369223c7</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>2305c707-7990-4fec-8d01-2e26cefcb045</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>authority</name>
      <type>Main</type>
      <value>${requestURL}</value>
      <webElementGuid>1f718647-f6e2-4fc0-8971-d3cfd2efe7e6</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json, text/plain, */*</value>
      <webElementGuid>5322a4fa-8a87-47b7-9bdb-c84e47f59d5a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>en-US,en;q=0.9</value>
      <webElementGuid>20385c35-40ab-4ed7-9c2f-4815dd45f61d</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${caBearer}</value>
      <webElementGuid>09c262f1-88df-41ba-89e6-983dffd6c547</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>268402b6-ffe9-4745-9449-85b544954388</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Origin</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>97b066a6-413d-46fa-9a54-1597c7c75507</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>platform</name>
      <type>Main</type>
      <value>web</value>
      <webElementGuid>25d3434c-8219-4a69-9378-3d089adc2df8</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Referer</name>
      <type>Main</type>
      <value>https://stage-backoffice.lancar.id</value>
      <webElementGuid>b1c05f62-322c-4c9a-83a9-f7e306d1d711</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>x-request-id</name>
      <type>Main</type>
      <value>5668b88e-1504-4b7e-9c4d-cbd006afecae</value>
      <webElementGuid>1b489c8c-dde8-48ab-ae5a-59449d327549</webElementGuid>
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
      <id>6afab043-368e-45b8-9002-773bf01a7433</id>
      <masked>false</masked>
      <name>requestURL</name>
   </variables>
   <variables>
      <defaultValue>'${requestURL}/loanservice/api/backoffice/v1/assessment/business_assessment/upsert'</defaultValue>
      <description></description>
      <id>f45d5494-0e14-4ab2-8bf9-8da5b64bc015</id>
      <masked>false</masked>
      <name>endpoint</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.loanID</defaultValue>
      <description></description>
      <id>8d14ffd1-1b4e-4b75-9b8c-6082cd9721fe</id>
      <masked>false</masked>
      <name>loanID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.caBearer</defaultValue>
      <description></description>
      <id>dc0471b7-9e13-480d-aaf6-fefb9a1c48e3</id>
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
