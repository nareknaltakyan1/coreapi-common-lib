package com.nnaltakyan.api.core.common.communication;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class EmailAddress
{

	private final String email;

	public EmailAddress(String email) throws IllegalArgumentException
	{
		if (isValidEmail(email))
		{
			this.email = email;
		}
		else
		{
			throw new IllegalArgumentException("Invalid email address format.");
		}
	}

	private boolean isValidEmail(String email)
	{
		// Basic email validation using regex
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		return email != null && email.matches(emailRegex);
	}
}
