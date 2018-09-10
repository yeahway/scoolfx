package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class FeeStructureException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public FeeStructureException() {
		super();
	}

	public FeeStructureException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public FeeStructureException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public FeeStructureException(final String message) {
		super(message);
	}

	public FeeStructureException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public FeeStructureException(final Throwable cause) {
		super(cause);
	}

	public FeeStructureException(Errors errors) {
		super(errors.getMessage());
	}
}
