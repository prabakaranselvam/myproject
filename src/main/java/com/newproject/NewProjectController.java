package com.newproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewProjectController {

@GetMapping("/get/{name}")
public String getName(@PathVariable String name) {
	return name;
}

}
