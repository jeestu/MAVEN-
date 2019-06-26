package edu.zut.cs.software.moon.register.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.zut.cs.software.moon.base.service.impl.GenericManagerImpl;
import edu.zut.cs.software.moon.register.service.PeopleManager;
import edu.zut.cs.software.sun.Register.dao.PeopleDao;
import edu.zut.cs.software.sun.Register.domain.People;
import edu.zut.cs.software.sun.Register.domain.Thing;
import edu.zut.cs.software.sun.commodity.domain.Commodity;
import edu.zut.cs.software.sun.sale.domain.Coupon;


@Service
@Transactional
public class PeopleManagerImpl extends GenericManagerImpl<People, Long> implements PeopleManager{
	@Autowired
	PeopleDao dao;

	@Autowired
    public void setDao(PeopleDao dao){this.dao=dao;}


    @Override
    public People save(People people)
    {return dao.save(people);}


	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		 dao.deleteById(id);
	}

	public People findById(Long id){
        return dao.getOne(id);
    }
	 @Override
	    public List<People> findAll(){return dao.findAll();}
	@Override
	public void updateById(Long id, String name, String age,String set) {
		// TODO Auto-generated method stub
		People people=dao.getOne(id);
		people.setPeoplename(name);
		people.setPeopleage(name);
		people.setPeopleset(name);
		dao.saveAndFlush(people);
	}

}

