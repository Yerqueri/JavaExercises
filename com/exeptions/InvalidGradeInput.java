package com.exeptions;

public class InvalidGradeInput extends Exception{
	
	private static final long serialVersionUID = 2L;

	public InvalidGradeInput(String message) {
		super(message);
    }
}