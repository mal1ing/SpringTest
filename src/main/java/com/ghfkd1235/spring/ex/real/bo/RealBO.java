package com.ghfkd1235.spring.ex.real.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghfkd1235.spring.ex.real.dao.RealDAO;
import com.ghfkd1235.spring.ex.real.model.Real;

@Service
public class RealBO {

	@Autowired
	private RealDAO realDAO;
	
	//특정 id의 real을 얻어와서 return
	public Real getReal(int id) {
		Real real = realDAO.selectReal(id);
		return real;
	}
	public List<Real> getrentPrice(int rentPrice) {
		List<Real> rent = realDAO.selectRentPrice(rentPrice);
		return rent;
	}
	
	public List<Real> getAreaPrice(int area, int price) {
		return realDAO.selectAreaPrice(area, price);
		
	}
	
}
