package com.ghfkd1235.spring.ex.real_estate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ghfkd1235.spring.ex.real_estate.model.Real_Estate;

@Repository 
public interface Real_EstateDAO {

	//특정 id의 Real_estate 테이블 조회 결과 리턴
	public Real_Estate selectReal_Estate(@Param("id") int id);
	
	public List<Real_Estate> selectRentPrice(@Param("rentPrice") int rentPrice);
	
	public List<Real_Estate> selectAreaPrice(
			@Param("area") int area
			, @Param("price") int price);
}
