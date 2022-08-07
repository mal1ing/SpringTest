package com.ghfkd1235.spring.ex.real_estate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ghfkd1235.spring.ex.real_estate.bo.Real_EstateBO;
import com.ghfkd1235.spring.ex.real_estate.model.Real_Estate;

@Controller
@RequestMapping("/real_estate/test01")
public class Real_estateController {

	
	@Autowired
	private Real_EstateBO real_EstateBO;
	
	@RequestMapping("/1")
	@ResponseBody
	public Real_Estate selectReal(
			@RequestParam(value="id", required=true) Integer id)
	{
		Real_Estate real_estate = real_EstateBO.getReal_Estate(id);
		return real_estate;
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public List<Real_Estate> rentReal(
			@RequestParam(value="rentPrice", required=true) Integer rentPrice)
	{
		List<Real_Estate> rent_price = real_EstateBO.getRentPrice(rentPrice);
		return rent_price;
	}
	
	@RequestMapping("/3")
	@ResponseBody
	public List<Real_Estate> getAreaPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price
			){
		List<Real_Estate> areaprice = real_EstateBO.getAreaPrice(area, price);
		return areaprice;
		
	}
	
}
