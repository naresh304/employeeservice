/**
 * 
 */
package com.cccis.employeeservice.models;

/**
 * @author sasi
 *
 */
public class Employee {

	public int id;
	private String name;
	private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
