package edu.zut.cs.software.sun.Register.dao;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import edu.zut.cs.software.moon.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.sun.Register.domain.People;
@Rollback(value = false)
 public class PeopleDaoTest extends GenericDaoTestCase<Long, People,PeopleDao>{
		
		  @Autowired
		  PeopleDao peopleDao;
	      
	      @Test
		    public void testSava(){
				People people = new People();
				people.setPeoplename("朱登辉");
				people.setPeopleage("21");
				people.setPeopleset("男");
				peopleDao.save(people);
				
	      }
	      @Test
	       public void testDelete() {
	    	  peopleDao.deleteById(1218L);
	      }
	    	  
	      @Test
		    public void testFind(){
		        List<People> people = peopleDao.findAll();
		        assertNotNull(people);
		        if(logger.isInfoEnabled()){
		            logger.info(people);
		        }
		          }	
}
				
