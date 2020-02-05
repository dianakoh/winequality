package com.gy.winequality;


import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gy.vo.WineQualityVO;
import com.gy.service.WineQualityService;

@RestController
public class restController {
    
    private static final Logger logger = LoggerFactory.getLogger(restController.class);
    
    @Inject
    private WineQualityService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/restexall")
    public List<WineQualityVO> WineQualityList() throws Exception{
 
        logger.info("home");
        
        List<WineQualityVO> wineQualityList = service.selectWineQuality();
 
        return wineQualityList;
    }
    
    @RequestMapping(value = "/restex")
    public List<WineQualityVO> WineQualityList(@RequestParam HashMap<String, String> params) throws Exception{
    	
    	List<WineQualityVO> wineQualityList = service.selectWineQuality(params);
    	
    	return wineQualityList;
    }
}
