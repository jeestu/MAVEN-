package edu.zut.cs.software.sun.Register.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonBackReference;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "Thing")
public class Thing extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="THING_NAME")
	private String ThingName;
	public String getThingName() {
		return ThingName;
	}
	public void setThingName(String thingName) {
		ThingName = thingName;
	}
	@Column(name="THING_COUNT")
	private String Count;
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
		Count = count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@JoinColumn(name="PEOPLE_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	private People people;
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "Thing [id=" + id + ", ThingName=" 
	             + ThingName + ", "
	             		+ "Count=" + Count + "]";
	}
	
	
}
