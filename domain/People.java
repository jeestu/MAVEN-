package edu.zut.cs.software.sun.Register.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import edu.zut.cs.software.moon.base.domain.BaseEntity;

@Entity
@Table(name = "People")
public class People extends BaseEntity{
	
	private static final long serialVersionUID = 5521218170469636598L;
	private long id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="PEOPLE_NAME")
	private String PeopleName;
	public String getPeoplename() {
		return PeopleName;
	}
	public void setPeoplename(String peoplename) {
		PeopleName = peoplename;
	}
	@Column(name="PEOPLE_AGE")
	private String PeopleAge;
	public String getPeopleage() {
		return PeopleAge;
	}
	public void setPeopleage(String peopleage) {
		PeopleAge = peopleage;
	}
	@Column(name="PEOPEL_SET")
	private String PeopleSet;
	public String getPeopleset() {
		return PeopleSet;
	}
	public void setPeopleset(String peopleset) {
		PeopleSet = peopleset;
	}
	//@JoinColumn(name="SHELVES_ID")
}
	
