package com.ratepay.app.bugtracker.exception;

public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 9025275316102501735L;

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(final String message) {
		super(message);
	}
}
