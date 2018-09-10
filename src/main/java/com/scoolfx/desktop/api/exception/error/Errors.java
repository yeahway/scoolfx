
/*
 * Copyright (c) 2018, YesWay and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.scoolfx.desktop.api.exception.error;

import java.io.Serializable;

public enum Errors implements Serializable {

	// Common
	DATA_NOT_FOUND("Data not found"),

	// Login errors
	LOGIN_DATA_NOT_FOUND("Login data not found"),

	// Authorization
	ACCESS_DENIED("Access denied"),

	LOGIN_FAILED("Either username or password is incorrect."),

	// User errors

	USER_NOT_FOUND("User not found"),

	USER_CREATE_FAILURE("User cannot be created"),

	NULL_USER_DATA("User detail is null"),

	USER_DELETE_FAILURE("User cannot be deleted"),

	USER_UPDATE_FAILURE("User cannot be created"),

	USER_NAME_IS_NOT_AVAILABLE("User name is not available"),

	EMAIL_ALREADY_IN_USE("The provided email is already in use");
	
	//

	private String message;

	private Errors(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
