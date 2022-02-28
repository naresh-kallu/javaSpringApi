package com.tectoro.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {

	@Override
	public String positiveOrNagitive(int num) {
		if(num > 0) {
		return	"Positive Number::"+num;
		}else {
		return	"Nagitive num::"+num;
		}
		
	}

}
