package com.example.demo.user;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
	
	private String userId;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private int phoneNumber;
	private String role;
	
	public User toUser() {
		return User.builder()
				.userId(userId)
				.password(password)
				.email(email)
				.name(name)
				.nickname(nickname)
				.phoneNumber(phoneNumber)
				.createdDate(LocalDateTime.now())
				.role("u")
				.build();
	}
}
