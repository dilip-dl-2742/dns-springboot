package com.example.demo.Testing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
	@RequestMapping("/")
	public int add()
	{
		return 2+7;
	}
}
