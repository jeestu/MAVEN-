package edu.zut.cs.software.sun.Register.dao;

import org.springframework.stereotype.Repository;

import edu.zut.cs.software.moon.base.dao.GenericDao;
import edu.zut.cs.software.sun.Register.domain.People;

@Repository

public interface PeopleDao extends GenericDao<People,Long>{
}
