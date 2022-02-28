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

	@Override
	public String oddOrEven(int num) {
		if(num%2 == 0) {
		return "Given num is Even::"+num;
		}else {
		return	"Given num is Odd::"+num ;
		}
	}

	@Override
	public String first_N_Num(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		
		return "First "+num+"  natural numbers::"+sum;
	}

	@Override
	public String first_N_range(int num, int num1) {
		int sum=0;
		for(int i=num;i<=num1;i++) {
			sum=sum+i;
		}
		
		return "First "+num+" to "+num1+"  natural numbers::"+sum;

		
		
	}
	

}
