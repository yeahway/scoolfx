package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class GradeException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public GradeException() {
		super();
	}

	public GradeException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public GradeException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public GradeException(final String message) {
		super(message);
	}

	public GradeException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public GradeException(final Throwable cause) {
		super(cause);
	}

	public GradeException(Errors errors) {
		super(errors.getMessage());
	}
}
