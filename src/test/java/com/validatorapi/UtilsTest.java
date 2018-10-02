package com.validatorapi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.validatorapi.helper.Utils;

/**
 * The Class UtilsTest.
 */
public class UtilsTest {

	/**
	 * Test valid password.
	 */
	@Test
	public void testValidPassword() {
		boolean response = Utils.validatePassword("Test10");
		assertTrue(response);
	}

	/**
	 * Test password with invalid data.
	 */
	@Test
	public void testPasswordWithInvalidData() {
		boolean response = Utils.validatePassword("Tes1");
		assertFalse(response);
	}

	/**
	 * Test password with valid data.
	 */
	@Test
	public void testPasswordWithValidData() {
		boolean response = Utils.validatePassword("TestTest1010");
		assertTrue(response);
	}

	/**
	 * Test password with empty data.
	 */
	@Test
	public void testPasswordWithEmptyData() {
		boolean response = Utils.validatePassword("");
		assertFalse(response);
	}

}
