package com.ghfkd1235.spring.ex.real.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ghfkd1235.spring.ex.real.model.Real;

@Repository
public interface RealDAO {

	
	//특정 id의  real 테이블 조회 결과 리턴
	public Real selectReal(@Param("id") int id);
	public List<Real> selectRentPrice(@Param("rentPrice") int rentPrice);
	
	public List<Real> selectAreaPrice(
			@Param("area") int area
			, @Param("price") int price);
	
}
