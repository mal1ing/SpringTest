package com.ghfkd1235.spring.ex.real_estate.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghfkd1235.spring.ex.real_estate.dao.Real_EstateDAO;
import com.ghfkd1235.spring.ex.real_estate.model.Real_Estate;

@Service
public class Real_EstateBO {

	@Autowired
	private Real_EstateDAO real_estateDAO;
	
	//특정 id의 real을 얻어와서 return
	public Real_Estate getReal_Estate(int id) {
		Real_Estate real_estate = real_estateDAO.selectReal_Estate(id);
		return real_estate;
	}
	
	
	public List<Real_Estate> getRentPrice(int rentPrice){
		List<Real_Estate> rent_price = real_estateDAO.selectRentPrice(rentPrice);
		return rent_price;
	}
	
	public List<Real_Estate> getAreaPrice(int area, int price){
		return real_estateDAO.selectAreaPrice(area, price);
	}

}
