package com.validatorapi.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.validatorapi.helper.Utils;

/**
 * The Class PasswordValidatorController.
 */
@RestController
public class PasswordValidatorController {

	/** The logger. */
	Logger LOGGER = Logger.getLogger(PasswordValidatorController.class);

	/**
	 * Validate password.
	 *
	 * @param password the password
	 * @return the string
	 */
	@RequestMapping(value = "/validatePassword", method = RequestMethod.GET)
	public String validatePassword(@RequestParam("password") final String password) {
		
		LOGGER.info(" : Start validatePassword : ");

		String status = "";

		final boolean response = Utils.validatePassword(password);

		if (response) {
			status = "VALID";
		} else {
			status = "INVALID";
		}

		LOGGER.info(" : end validatePassword : " + status);
		
		return status;
	}

}
