/**
 * 
 */
package com.boot.first.model;

/**
 * @author gaurav
 *
 */
public class Customer {
	
	private int id;
	private String voornaam;
	private String achternaam;
	private String roepnaam;
	private String voorletter;
	private int age;
	//private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getRoepnaam() {
		return roepnaam;
	}
	public void setRoepnaam(String roepnaam) {
		this.roepnaam = roepnaam;
	}
	public String getVoorletter() {
		return voorletter;
	}
	public void setVoorletter(String voorletter) {
		this.voorletter = voorletter;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", voornaam=" + voornaam + ", achternaam=" + achternaam + ", roepnaam=" + roepnaam
				+ ", voorletter=" + voorletter + ", age=" + age + "]";
	}
	
	

}
