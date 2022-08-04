package com.ghfkd1235.spring.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ghfkd1235.spring.ex.database.model.Store;

@Repository
public interface StoreDAO {
	
	// store의 모든 행을 조회하는 기능
	public List<Store> selectStoreList();

}
