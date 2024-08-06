package com.example.springbootmysql.controller;
//to handle response
public class Response {
	Integer code;
	String message;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Response(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public Response() {
		super();
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + "]";
	}


}
