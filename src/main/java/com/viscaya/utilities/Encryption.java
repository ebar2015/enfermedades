/**
 * 
 */
package com.viscaya.utilities;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

/**
 * @author joseviscaya
 *
 */
@Component 
public class Encryption {
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public String encriptyonSha256(String value) {
		String sha256hex = DigestUtils.sha256Hex(value);
		return sha256hex;
	}
	
	public String encriptyonSha512(String value) {
		String sha256hex = DigestUtils.sha512Hex(value);
		return sha256hex;
	}

}
