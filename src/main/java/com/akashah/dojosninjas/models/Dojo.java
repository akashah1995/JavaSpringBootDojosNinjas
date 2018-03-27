package com.akashah.dojosninjas.models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "dojos")
public class Dojo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String location;
	private Date updated_at;
	private Date created_at;
	@OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
	private List <Ninja> ninjas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public List<Ninja> getNinjas() {
		return ninjas;
	}
	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}
	
	
	
	
	
	
	

}
