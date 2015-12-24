package org.baosight.service;

import java.util.List;

import org.baosight.model.Cross;

public interface CrossServiceI {
	
	
	public Cross getCrossByID(Integer crossid);
	
	public List<Cross> getAll();
	
}
