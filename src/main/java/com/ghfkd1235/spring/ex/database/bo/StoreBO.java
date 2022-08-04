package com.ghfkd1235.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghfkd1235.spring.ex.database.dao.StoreDAO;
import com.ghfkd1235.spring.ex.database.model.Store;

@Service
public class StoreBO {

	
	@Autowired
	//객체를 spring에서 자동생성
	private StoreDAO storeDAO;
	
	// store 테이블의 모든 행 정보를 가져오는 메소드
	public List<Store> getStoreList(){
		List<Store> storeList = storeDAO.selectStoreList();
		return storeList;
	}
}
