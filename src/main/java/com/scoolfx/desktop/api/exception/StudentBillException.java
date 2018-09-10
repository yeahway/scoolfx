package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class StudentBillException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public StudentBillException() {
		super();
	}

	public StudentBillException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public StudentBillException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public StudentBillException(final String message) {
		super(message);
	}

	public StudentBillException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public StudentBillException(final Throwable cause) {
		super(cause);
	}

	public StudentBillException(Errors errors) {
		super(errors.getMessage());
	}
}
