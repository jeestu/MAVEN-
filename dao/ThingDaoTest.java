package edu.zut.cs.software.sun.Register.dao;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Register.domain.Thing;


@Rollback(value = false)
public class ThingDaoTest extends GenericDaoTestCase<Long, Thing, ThingDao>{

	 @Autowired
	    ThingDao thingDao;
	 @Autowired
	    PeopleDao peopledao;

	    @Test
	    public void testadd(){
	    	Thing thing=new Thing();
	    	thing.setThingName("ipad");
	    	thing.setCount("0");
	    	thing.setPeople(peopledao.getOne(1200L));
	    	this.thingDao.save(thing);
	    }
	    @Test 
		  public void testFind()
		  { 
			List<Thing> thing = thingDao.findAll();
		    assertNotNull(thing); 
		    System.out.println(thing);
		  }
}
