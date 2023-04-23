package org.mql.platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentSpaceController {
	
	@GetMapping("student-space")
	public String studentSapce() {
		return "/views/student-space.html";
	}
}