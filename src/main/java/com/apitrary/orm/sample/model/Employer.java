package com.apitrary.orm.sample.model;

import java.util.List;

import com.apitrary.orm.annotations.Entity;
import com.apitrary.orm.annotations.Field;
import com.apitrary.orm.annotations.Id;
import com.apitrary.orm.annotations.References;

/**
 * <p>
 * Employer class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Entity
public class Employer {

	@Id
	private String id;

	@Field
	private String name;

	@References(Person.class)
	private List<Person> employees;

	/**
	 * <p>
	 * Constructor for Employer.
	 * </p>
	 */
	public Employer() {
	}

	/**
	 * <p>
	 * Getter for the field <code>id</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return id;
	}

	/**
	 * <p>
	 * Setter for the field <code>id</code>.
	 * </p>
	 * 
	 * @param id
	 *            a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>
	 * Getter for the field <code>name</code>.
	 * </p>
	 * 
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>
	 * Setter for the field <code>name</code>.
	 * </p>
	 * 
	 * @param name
	 *            a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * Getter for the field <code>employees</code>.
	 * </p>
	 * 
	 * @return a {@link java.util.List} object.
	 */
	public List<Person> getEmployees() {
		return employees;
	}

	/**
	 * <p>
	 * Setter for the field <code>employees</code>.
	 * </p>
	 * 
	 * @param employees
	 *            a {@link java.util.List} object.
	 */
	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}
}
