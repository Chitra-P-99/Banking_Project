package com.jsp;

public class InsufficientBalanceException extends RuntimeException
{
	private String message;
	InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
/**
 Rules of Customoized Exception
 
 1. create a class with Exception name
 2. extends RuntimeException -->Unchecked Exception
    extend Exception         --> Checked Exception
 3. Override getMessage()    -->incl. (variable,constructor,method)
 4. invoke the exception object using throw keyword
 handle it using try and catch block with suitable message
 */

