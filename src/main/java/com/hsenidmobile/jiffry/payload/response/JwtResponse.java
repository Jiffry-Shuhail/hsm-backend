package com.hsenidmobile.jiffry.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class JwtResponse {
	private String token;
	private String type = "JiffryShuhail";
	private String id;
	private String username;
	private String email;
	private String status;

	public JwtResponse(String accessToken, String id, String username, String email,String status) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		this.status = status;
	}
}
