package com.gy.service;

import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.gy.dao.WineQualityDAO;
import com.gy.vo.WineQualityVO;

@Service
public class WineQualityServiceImpl implements WineQualityService{

	@Inject
	private WineQualityDAO dao;
	
	@Override
	public List<WineQualityVO> selectWineQuality() throws Exception {
		return dao.selectWineQuality();
	}
	
	@Override
	public List<WineQualityVO> selectWineQuality(HashMap<String, String> params) throws Exception {
		return dao.selectWineQuality(params);
	}
	
}
