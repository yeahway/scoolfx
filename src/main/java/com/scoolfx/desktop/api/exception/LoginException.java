package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class LoginException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public LoginException() {
		super();
	}

	public LoginException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public LoginException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public LoginException(final String message) {
		super(message);
	}

	public LoginException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public LoginException(final Throwable cause) {
		super(cause);
	}

	public LoginException(Errors errors) {
		super(errors.getMessage());
	}
}