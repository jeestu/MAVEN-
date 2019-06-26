package edu.zut.cs.software.moon.register.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.software.moon.base.service.GenericManagerTestCase;
import edu.zut.cs.software.moon.register.service.PeopleManager;

import edu.zut.cs.software.sun.Register.domain.People;

import edu.zut.cs.software.sun.sale.service.CouponManagerTest;

@Rollback(value = false)
public class PeopleManagerTest extends GenericManagerTestCase<Long, People, PeopleManager>{

	private static final Logger logger = LogManager.getLogger(PeopleManagerTest.class.getName());

	PeopleManager peopleManager;
	public PeopleManagerTest() {
		super(People.class);
	}
	@Autowired
	public void setPeopleManager(PeopleManager peopleManager) {
		this.peopleManager = peopleManager;
	}
	
	@Test
	public void Save() {
		People people=new People();
		people.setPeoplename("张国豪");
		people.setPeopleage("10");
		people.setPeopleset("男");
		peopleManager.save(people);
	}
	@Test
	public void Delete() {
		peopleManager.deleteById(1219L);
	}
	@Test
	public void updata() {
		People peopleInDB = peopleManager.findById(1223L);
		peopleInDB.setPeoplename("张展鹏");
		peopleInDB.setPeopleset("男");
		peopleInDB.setPeopleage("20");
	}
	@Test
    public void findAll() {
        Assert.assertNotNull(peopleManager.findAll());
        logger.info(peopleManager.findAll());
    }
}
