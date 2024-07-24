package com.app.Error;

import java.io.Serializable;

public class MainCourseNotFoundException extends RuntimeException implements Serializable{

		//private String message;

		public MainCourseNotFoundException(String message) {
			super(message);
		
		}

		public MainCourseNotFoundException() {
			super();
		}
}
