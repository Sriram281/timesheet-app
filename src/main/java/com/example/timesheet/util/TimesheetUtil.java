package com.example.timesheet.util;
import java.security.SecureRandom;

	public class TimesheetUtil {
	    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    private static final SecureRandom RANDOM = new SecureRandom();

	    public static String generateId(int length) {
	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
	        }
	        return sb.toString();
	    }
	}

