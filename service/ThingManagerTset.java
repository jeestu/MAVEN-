package edu.zut.cs.software.moon.register.service;


import javax.transaction.Transactional;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;


import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.register.service.ThingManager;
import edu.zut.cs.software.sun.Register.domain.Thing;
@Transactional
@Rollback(value = false)
public class ThingManagerTset extends GenericManagerTestCase<Long, Thing,ThingManager>{

	private static final Logger logger = LogManager.getLogger(ThingManagerTset.class.getName());
	ThingManager thingManager;
	
      public ThingManagerTset() {
	   super(Thing.class);
	// TODO Auto-generated constructor stub
}
	
	@Autowired
    public void setManger(ThingManager manger) {
        this.thingManager = manger;
    }
	@Autowired
	PeopleManager peopleManager;
	
	  @Test
	    public void save() {
		    Thing thing = new Thing();
		    thing.setCount("0");
		    thing.setThingName("手机");
		    thing.setPeople(peopleManager.findById(1219L));
		    thingManager.save(thing);
		    
	    }
	  @Test
	  public void testThingupdateById()
	  {
		  Thing  thingInDB = thingManager.findById(1220L);
		  //thingInDB.setId(1222L);
		  thingInDB.setCount("5");
		  thingInDB.setThingName("iPad");
		  
	  }
	  @Test
	   public void Delete() {
		  thingManager.deleteById(1231L);
	  }
	  @Test
	    public void findAll() {
	        Assert.assertNotNull(thingManager.findAll());
	        logger.info(thingManager.findAll());
	    }
	  
	  /*@Test
	  public void testGetPeopleIdByThing() {
		  Thing thingInDB =  thingManager.findById(1201L);
		  String peopleName= thingInDB.getPeople().getPeoplename();
		  String peopleAge = thingInDB.getPeople().getPeopleage();
		  String peopleSet = thingInDB.getPeople().getPeopleset();
		  System.out.println(peopleName+" "+peopleAge+" "+peopleSet);
		  System.out.println("数量："+thingInDB.getCount()+"物品:"+thingInDB.getThingName());
		  //Long  peopeleId  = thingInDB.getPeople().getId();
		
		  
		  //logger.info(peopleName+" "+peopleAge+" "+peopleSet);
	  }*/
	 
	
}
