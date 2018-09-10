package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class StaffException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public StaffException() {
		super();
	}

	public StaffException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public StaffException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public StaffException(final String message) {
		super(message);
	}

	public StaffException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public StaffException(final Throwable cause) {
		super(cause);
	}

	public StaffException(Errors errors) {
		super(errors.getMessage());
	}
}
