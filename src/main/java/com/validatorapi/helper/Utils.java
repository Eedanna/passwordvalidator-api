package com.validatorapi.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class Utils.
 */
public class Utils {

	/**
	 * Validate password.
	 *
	 * @param password the password
	 * @return true, if successful
	 */
	public static boolean validatePassword(final String password) {

		final Pattern pattern = Pattern.compile("((.*[A-Za-z]{4})(.*[0-9]{2}))");

		final Matcher matcher = pattern.matcher(password);

		return matcher.matches();

	}

}
