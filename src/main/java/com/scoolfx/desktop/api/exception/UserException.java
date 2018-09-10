package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class UserException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public UserException() {
		super();
	}

	public UserException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public UserException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public UserException(final String message) {
		super(message);
	}

	public UserException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public UserException(final Throwable cause) {
		super(cause);
	}

	public UserException(Errors errors) {
		super(errors.getMessage());
	}
}
