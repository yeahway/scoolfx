package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class ParentException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public ParentException() {
		super();
	}

	public ParentException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ParentException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public ParentException(final String message) {
		super(message);
	}

	public ParentException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public ParentException(final Throwable cause) {
		super(cause);
	}

	public ParentException(Errors errors) {
		super(errors.getMessage());
	}
}
