package com.denisneuling.apitrary.orm.sample.model;

import com.apitrary.orm.annotations.Entity;
import com.apitrary.orm.annotations.Field;
import com.apitrary.orm.annotations.Id;
import com.apitrary.orm.annotations.References;

/**
 * <p>Person class.</p>
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
@Entity
public class Person {

	@Id
	private String id;
	
	@Field
	private String preName;
	
	@Field
	private String surName;
	
	@References(Occupation.class)
	private Occupation occupation;
	
	/**
	 * <p>Constructor for Person.</p>
	 */
	public Person(){
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getId() {
		return id;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.String} object.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * <p>Getter for the field <code>preName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPreName() {
		return preName;
	}

	/**
	 * <p>Setter for the field <code>preName</code>.</p>
	 *
	 * @param preName a {@link java.lang.String} object.
	 */
	public void setPreName(String preName) {
		this.preName = preName;
	}

	/**
	 * <p>Getter for the field <code>surName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * <p>Setter for the field <code>surName</code>.</p>
	 *
	 * @param surName a {@link java.lang.String} object.
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * <p>Getter for the field <code>occupation</code>.</p>
	 *
	 * @return a {@link com.denisneuling.apitrary.orm.sample.model.Occupation} object.
	 */
	public Occupation getOccupation() {
		return occupation;
	}

	/**
	 * <p>Setter for the field <code>occupation</code>.</p>
	 *
	 * @param occupation a {@link com.denisneuling.apitrary.orm.sample.model.Occupation} object.
	 */
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
}
