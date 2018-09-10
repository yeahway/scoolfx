package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class StudentException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public StudentException() {
		super();
	}

	public StudentException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public StudentException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public StudentException(final String message) {
		super(message);
	}

	public StudentException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public StudentException(final Throwable cause) {
		super(cause);
	}

	public StudentException(Errors errors) {
		super(errors.getMessage());
	}
}

