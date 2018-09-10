package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class ActionException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public ActionException() {
		super();
	}

	public ActionException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ActionException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public ActionException(final String message) {
		super(message);
	}

	public ActionException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public ActionException(final Throwable cause) {
		super(cause);
	}

	public ActionException(Errors errors) {
		super(errors.getMessage());
	}
}
