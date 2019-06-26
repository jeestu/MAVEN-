package edu.zut.cs.software.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.zut.cs.software.moon.base.web.spring.controller.GenericController;
import edu.zut.cs.software.moon.register.service.ThingManager;
import edu.zut.cs.software.sun.Register.domain.Thing;

@Controller
@RequestMapping("/thing")
public class ThingController extends GenericController<Thing, Long, ThingManager>{

	ThingManager thingManager;
	@Autowired
	public void setSiteManager(ThingManager thingManager) {
		this.thingManager = thingManager;
		this.manager=this.thingManager;
	}
	/**
	 *  test
	 * @return
	 */
	@RequestMapping("/index")
	public String mainIndex(){
		return "main/index";
	}
	/**
	 * 
	 */
	//find addsite


	@RequestMapping("/findallthing")    //  /allwaregoods
	public String findAllSite(Model model) {
		List<Thing> waregoodsList= this.thingManager.findAll();
		for(Thing site:waregoodsList) {
			System.out.println(site);
		}
		model.addAttribute("waregoodsList", waregoodsList);
		return "thing/findallthing";
	}
	//
	@RequestMapping("/josn")    
	public @ResponseBody List<Thing> josn(Model model) {
		List<Thing> siteList= this.thingManager.findAll();
		return siteList;
	}
	
	
	
	@RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
	public @ResponseBody Thing deleteThing(@PathVariable(value = "id") Long id) {
		Thing thing=thingManager.findById(id);
		return thing;
	}
	
	
	
	@RequestMapping(path = "save",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
	public @ResponseBody  Thing saveSite(Thing thing){
		this.thingManager.save(thing);
		return thing;
		
	}
}

