package com.bridgelabs.regex.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexImpl {
	
	public static String replace(String first, String fullName, String phoneNum, String date, String message) {
		final String REGEX_NAME = "<<name>>";
		final String REGEX_FULL_NAME = "<<full name>>";
		final String REGEX_CONTACT = "x{10}";
		final String REGEX_DATE = "<<01/01/2016>>";
		
		Pattern namePattern = Pattern.compile(REGEX_NAME);
		Matcher nameMatcher = namePattern.matcher(message);
		message = nameMatcher.replaceAll(first);

		Pattern fullNamePattern = Pattern.compile(REGEX_FULL_NAME);
		Matcher fullNameMatcher = fullNamePattern.matcher(message);
		message = fullNameMatcher.replaceAll(fullName);

		Pattern contactPattern = Pattern.compile(REGEX_CONTACT);
		Matcher contactMatcher = contactPattern.matcher(message);
		message = contactMatcher.replaceAll(phoneNum);

		Pattern datePattern = Pattern.compile(REGEX_DATE);
		Matcher dateMatcher = datePattern.matcher(message);
		message = dateMatcher.replaceAll(date);
		return message;
	}

}
