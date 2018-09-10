package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class FeeDueException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public FeeDueException() {
		super();
	}

	public FeeDueException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public FeeDueException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public FeeDueException(final String message) {
		super(message);
	}

	public FeeDueException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public FeeDueException(final Throwable cause) {
		super(cause);
	}

	public FeeDueException(Errors errors) {
		super(errors.getMessage());
	}
}
