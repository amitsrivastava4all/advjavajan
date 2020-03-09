package com.brainmentors.exam.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UUIDTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "ILoveJava";
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] digest = md.digest();
		String str = new String(digest);
		System.out.println(str);
//		for(int  i = 1; i<=1000; i++) {
//			System.out.println( UUID.randomUUID());
//		}

	}

}
