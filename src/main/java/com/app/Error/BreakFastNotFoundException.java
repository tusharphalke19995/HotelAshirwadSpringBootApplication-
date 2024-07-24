package com.app.Error;

import java.io.Serializable;

public class BreakFastNotFoundException extends RuntimeException implements Serializable{

	//private String message;

	public BreakFastNotFoundException(String message) {
		super(message);
	
	}

	public BreakFastNotFoundException() {
		super();
	}


}
