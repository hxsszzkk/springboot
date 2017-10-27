package com.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Controller
public class WebsiteApplication {
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping("/test")
	@ResponseBody
	String index1() {
		return "Hello World2";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String toIndex() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

}