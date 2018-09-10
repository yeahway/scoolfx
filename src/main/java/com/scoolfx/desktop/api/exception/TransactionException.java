package com.scoolfx.desktop.api.exception;

import com.scoolfx.desktop.api.exception.error.Errors;

public class TransactionException extends RuntimeException {

	private static final long serialVersionUID = -5951259359183795004L;

	public TransactionException() {
		super();
	}

	public TransactionException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public TransactionException(final Errors errors, final Throwable cause) {
		super(errors.getMessage(), cause);
	}

	public TransactionException(final String message) {
		super(message);
	}

	public TransactionException(final Errors errors, String message) {
		super(errors.getMessage() + " " + message);
	}

	public TransactionException(final Throwable cause) {
		super(cause);
	}

	public TransactionException(Errors errors) {
		super(errors.getMessage());
	}
}
