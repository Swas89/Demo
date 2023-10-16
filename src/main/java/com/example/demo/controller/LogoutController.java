package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LogoutController {
	
	
	@GetMapping("/logout")
	//@ResponseBody
	public RedirectView logout()
	{
		String hostNameOrg=org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentContextPath().toUriString();
		System.out.println("hostName"+hostNameOrg);
		String hostName=hostNameOrg+"="+"https://google.co.in";
		System.out.println("hostName"+hostName);
		return new RedirectView(hostName);
	}

}
