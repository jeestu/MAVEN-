package edu.zut.cs.software.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.register.service.PeopleManager;
import edu.zut.cs.software.sun.Register.domain.People;
import edu.zut.cs.software.sun.Register.domain.Thing;

@Controller
@RequestMapping(path="people")
public class UserController extends GenericController<People, Long, PeopleManager>{

		@Autowired
	    private PeopleManager peopleManager;
		
		@RequestMapping(path = "index")
	    public String index(){
	        System.out.println("hello");
	        return "index";
	    }



	    @RequestMapping(path = "/info/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
	    public @ResponseBody People getOne(@PathVariable(value = "id") Long id) {
	    	People peopleManager = this.peopleManager.findById(id);
	        return peopleManager;

	    }


	    @RequestMapping(path = "info", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	   public @ResponseBody
	    List<People> getAll(){
	        List<People> all = this.peopleManager.findAll();
	        return all;
	    }

	    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
		public @ResponseBody People deleteThing(@PathVariable(value = "id") Long id) {
	    	People thing=peopleManager.findById(id);
			return thing;
		}
		
		
		
		@RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
		public @ResponseBody  People saveSite(People thing){
			this.peopleManager.save(thing);
			return thing;
			
		}
	}

