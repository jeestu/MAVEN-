package edu.zut.cs.software.moon.register.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.register.service.ThingManager;
import edu.zut.cs.software.sun.Register.dao.ThingDao;
import edu.zut.cs.software.sun.Register.domain.Thing;

@Service
@Transactional
public class ThingManagerImpl extends GenericManagerImpl<Thing, Long> implements ThingManager{
 
	ThingDao dao;

	@Autowired
    public void setDao(ThingDao dao){
	 this.dao=dao;
	 }


    @Override
    public Thing save(Thing thing)
    {
    	return dao.save(thing);
    	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}
	
	
	public Thing findById(Long id){
	    return dao.getOne(id);
	}
	
	
	 @Override
	    public List<Thing> findAll()
	 {
		 return dao.findAll();
		 }
	 
	 @Override
		public void updateById(Long id, String name, String count) {
			// TODO Auto-generated method stub
			Thing thing=dao.getOne(id);
			thing.setCount(count);
			thing.setThingName(name);
	 }

}
