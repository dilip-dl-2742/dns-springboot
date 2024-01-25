package com.example.demo.Testing;

import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.example.demo.Dil;
@Service
public class DilService 
{
		@RequestMapping("/cont")
		public int display() {
			return 10;
		}
		@GetMapping("/div")
		public int add(@RequestParam int i, @RequestParam int j)
		{
			return i+j;
		}
		/*@RequestMapping("/web")
		public int show(Dil d)
		{
			int x=d.getA();
			int y=d.getB();
			return x+y;
		}*/
		
}



