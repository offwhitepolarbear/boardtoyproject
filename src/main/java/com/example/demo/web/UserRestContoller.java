package com.example.demo.web;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.User;
import com.example.demo.user.UserRepository;
import com.example.demo.user.UserSaveRequestDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserRestContoller {
	
	private UserRepository userRepository;
	
	@RequestMapping("/addUser")
	public void saveUser(@RequestBody UserSaveRequestDto userRequest) {
		userRepository.save(userRequest.toUser());
	}
	
	@RequestMapping("/login")
	public String login(@RequestBody UserSaveRequestDto userRequest) {
		User user = userRepository.findByUserIdAndPassword(userRequest.getUserId(), userRequest.getPassword());
		if(user !=null) {
			return user.getName();
		}
		else {
			return "로그인 실패임";
		}
		
	}
}
