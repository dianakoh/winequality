package com.gy.dao;

import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gy.vo.WineQualityVO;

@Repository
public class WineQualityDAOImpl implements WineQualityDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace="com.gy.mybatis.sql.test";
	
	@Override
	public List<WineQualityVO> selectWineQuality() throws Exception {
		return sqlSession.selectList(Namespace+".selectWineQuality");
	}
	
	@Override
	public List<WineQualityVO> selectWineQuality(HashMap<String, String> params) throws Exception{
		return sqlSession.selectList(Namespace+".selectWineQualityByType2", params);
	}
}
