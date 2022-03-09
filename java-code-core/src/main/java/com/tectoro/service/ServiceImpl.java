package com.tectoro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.entity.JavaEntity;
import com.tectoro.repository.RepositoryInt;

@Service
public class ServiceImpl implements ServiceInterface {
	@Autowired
	private RepositoryInt int1;

	@Override
	public String positiveOrNagitive(int num,JavaEntity entity) {
		if(num >= 0) {
			entity.setResult("positive");
		return	"Positive Number::"+num+" "+int1.save(entity);
		}else {
			entity.setResult("Negative");
		return	"Nagitive num::"+num+" "+int1.save(entity);
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

	@Override
	public String greatNumber(int num, int num1) {
		if(num>num1) {
			return "Big number::"+num;
		}else {
			return "Big number::"+num1;
		}
		
	}

	@Override
	public String bigNumLis(int num, int num1, int num2) {
		if(num>=num1 && num>=num2) {
			return "Big number::"+num;
		}else if (num1>=num && num1>=num2) {
			return "Big number::"+num1;
		}else if (num2>=num && num2>=num1) {
			return "Big number::"+num2;
		}else {
			return "Not a valid num";
		}
		
	}

	@Override
	public String lYear(int year) {
		if((year % 400 == 0) ||(year % 400 ==0 && year %100 !=0)) {
			return "leap year::"+year;
		} /*
			 * else if (year % 400 ==0 && year %100 !=0) { return "Leap year ::"+year; }
			 */
		else {
			return "Not a leap year::"+year;
		}
		
	}

	@Override
	public String prime(int num) {
		int count=0;
		if(num<2) {
			return "Not a prime num::"+num;
		}
			
		return null;
	}

	
	
	

}
