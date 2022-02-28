package com.tectoro.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.entity.JavaEntity;
import com.tectoro.service.ServiceInterface;

@RestController
public class JavaController {
	
	@Autowired
	ServiceInterface serviceInterface;
	//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
	@PostMapping("/positive")
	public String posOrNeg(JavaEntity entity,int num) {
		num=entity.getNum();
	 return 	serviceInterface.positiveOrNagitive(num);
	}

}
