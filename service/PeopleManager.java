package edu.zut.cs.software.moon.register.service;

import java.util.List;

import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.Register.domain.People;

public interface PeopleManager extends GenericManager<People, Long>{

	People save(People people);
	People findById(Long id);
	List<People> findAll();
	public void deleteById(Long id);
	void updateById(Long id, String name,String age, String set);

}
