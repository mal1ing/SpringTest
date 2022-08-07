package com.ghfkd1235.spring.ex.real;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ghfkd1235.spring.ex.real.bo.RealBO;
import com.ghfkd1235.spring.ex.real.model.Real;

@Controller
public class RealController {

	
	@Autowired
	private RealBO realBO;
	
	//특정 id의 Real 데이터 가져오기
	@RequestMapping("/real/test01/1")
	@ResponseBody
	public Real real(
			@RequestParam(value="id", required=true) Integer id)
	{
		Real real = realBO.getReal(id);
		return real;
	}
	
	@RequestMapping("/real/test01/2")
	@ResponseBody
	public  List<Real> rent(
			@RequestParam(value="rentPrice", required=true) Integer rentPrice)
	{
		List<Real> rent = realBO.getrentPrice(rentPrice);
		return rent;
	}

	@RequestMapping("/real/test01/3")
	@ResponseBody
	public List<Real> getAreaPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price
			) {
		
		List<Real> areaprice = realBO.getAreaPrice(area, price);
		return areaprice;
		
	}
	

}
