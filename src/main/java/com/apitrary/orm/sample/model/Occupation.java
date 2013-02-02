package com.apitrary.orm.sample.model;

import com.apitrary.orm.annotations.Column;
import com.apitrary.orm.annotations.Entity;
import com.apitrary.orm.annotations.Id;

/**
 * <p>
 * Occupation class.
 * </p>
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
 * 
 */
@Entity
public class Occupation {

	@Id
	private String id;

	@Column
	private String name;

	/**
	 * <p>
	 * Constructor for Occupation.
	 * </p>
	 */
	public Occupation() {
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
}
