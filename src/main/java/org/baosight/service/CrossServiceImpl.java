package org.baosight.service;


import java.util.List;

import org.baosight.dao.CrossMapper;
import org.baosight.model.Cross;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("crossService")
public class CrossServiceImpl implements CrossServiceI {
	
 
	public CrossMapper crossMapper;

	public CrossMapper getCrossMapper() {
		return crossMapper;
	}

	@Autowired
	public void setCrossMapper(CrossMapper crossMapper) {
		this.crossMapper = crossMapper;
	}

	@Override
	public Cross getCrossByID(Integer crossid) {
		// TODO Auto-generated method stub
		return crossMapper.selectByPrimaryKey(crossid);
	}

	@Override
	public List<Cross> getAll() {
		// TODO Auto-generated method stub
		return crossMapper.getAll();
	}

}
