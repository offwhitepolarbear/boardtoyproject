package com.example.demo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserContorller {
	@RequestMapping("/addUserView")
	public String addUserView() {
		return "addUserView";
	}
}
