package com.utilities;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EctryptDecryptUtil {

	private static SecretKeySpec secretKey;
	private static byte[] key;
	private static String ucd_key = "F365RRRBD027BA93";
	
	public static void main(String[] args) {
		
		String encrypted = encrypt("UcD_Cu37");
		System.out.println(decrypt("EKgi8CSMLyvUkdKED7Rp+g=="));
		
		decrypt(encrypted);
	}

	public static void setKey(String myKey) {
		try {
			key = myKey.getBytes("UTF-8");
			secretKey = new SecretKeySpec(key, "AES");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	private static String encrypt(String strToEncrypt) {
		
		String password = "";
		try {
			setKey(ucd_key);
			
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			password = Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
			//System.out.println("Encrypted password: "+password);
		}catch (Exception e) {
			System.out.println("Encryption Exception: "+ e);
		}
		return password;
	}
	
	private static String decrypt(String strToDecrypt) {
		String password = "";
		try {
			setKey(ucd_key);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			password = new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
			//System.out.println("Decrypted password: "+password);
		}catch (Exception e) {
			System.out.println("Encryption Exception: "+ e);
		}
		return password;
	}



}
