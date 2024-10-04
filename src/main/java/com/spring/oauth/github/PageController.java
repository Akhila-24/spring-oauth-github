package com.spring.oauth.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

		@GetMapping("/")
		public String home() {
				return "home";
		}

		@GetMapping("/user")
		public String about() {
				return "user"; // This will serve user.html
		}
}

