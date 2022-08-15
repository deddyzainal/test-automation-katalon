import java.security.InvalidKeyException

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords



class generateHmac {

	@Keyword
	def hmac_sha256(String secretKey, String data) {
		try {
			SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA256")
			Mac mac = Mac.getInstance("HmacSHA256")
			mac.init(secretKeySpec)
			byte[] digest = mac.doFinal(data.getBytes("UTF-8"))
			return byteArrayToString(digest)
		} catch (InvalidKeyException e) {
			throw new RuntimeException("Invalid key exception while converting to HMac SHA256")
		}
	}

	private def byteArrayToString(byte[] data) {
		BigInteger bigInteger = new BigInteger(1, data)
		String hash = bigInteger.toString(16)
		//Zero pad it
		while (hash.length() < 64) {
			hash = "0" + hash
		}
		return hash
	}



}