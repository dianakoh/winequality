package com.gy.dao;

import java.util.HashMap;
import java.util.List;

import com.gy.vo.WineQualityVO;

public interface WineQualityDAO {

	public List<WineQualityVO> selectWineQuality() throws Exception;
	
	public List<WineQualityVO> selectWineQuality(HashMap<String, String> params) throws Exception;
}
