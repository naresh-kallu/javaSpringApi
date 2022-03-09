package com.tectoro.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.entity.JavaEntity;
import com.tectoro.service.ServiceInterface;

@RestController
public class JavaController {
	
	@Autowired
	ServiceInterface serviceInterface;
	//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
	@PostMapping("/positive")
	public String posOrNeg(JavaEntity entity) {
		int num=entity.getNum();
	 return 	serviceInterface.positiveOrNagitive(num,entity);
	}
	@PostMapping("/even")
	public String evenOrOdd(JavaEntity entity) {
		int num=entity.getNum();
		return serviceInterface.oddOrEven(num);
		
	}
	@PostMapping("/n_natural")
	public String n_Num(JavaEntity entity) {
		int num=entity.getNum();
		int num1=entity.getNum1();
		return serviceInterface.first_N_Num(num);
	}
	@PostMapping("/n_range")
	public String n_range(@RequestBody JavaEntity entity) {
		int num=entity.getNum();
		int num1=entity.getNum1();
	return serviceInterface.first_N_range(num, num1);
	
	}
	@PostMapping("/greatnum")
	public String greatNum(@RequestBody JavaEntity entity) {
		int num=entity.getNum();
		int num1=entity.getNum1();
		return serviceInterface.greatNumber(num, num1);
		
	}
	@PostMapping("/great")
	public String bigNum(@RequestBody JavaEntity entity) {
		int num=entity.getNum();
		int num1=entity.getNum1();
		int num2=entity.getNum2();
		return serviceInterface.bigNumLis(num, num1, num2);
		
	}
	@PostMapping("/leapyear")
	public String leapYear(@RequestBody JavaEntity entity) {
		int year=entity.getYear();
		return serviceInterface.lYear(year);
	}

}
