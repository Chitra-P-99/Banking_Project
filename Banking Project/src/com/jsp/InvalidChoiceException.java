package com.jsp;

public class InvalidChoiceException extends RuntimeException
{
	private String msg;
	InvalidChoiceException(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String getMessage()
	{
		return msg;
	}

}
