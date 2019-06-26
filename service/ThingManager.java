package edu.zut.cs.software.moon.register.service;



import java.util.List;


import edu.zut.cs.software.moon.base.service.GenericManager;
import edu.zut.cs.software.sun.Register.domain.Thing;


public interface ThingManager extends GenericManager<Thing, Long>{
	Thing save(Thing thing);
	Thing findById(Long id);
	List<Thing> findAll();
	  
	void deleteById(Long id);
	void updateById(Long id, String name,String count);

}
