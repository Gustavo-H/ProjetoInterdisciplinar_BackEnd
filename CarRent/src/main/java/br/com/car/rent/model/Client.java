package br.com.car.rent.model;

import java.io.Serializable;

public class Client extends DeleteManagement implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer id;
	String name;
	String cpf;
	String rg;
	String birthday;
	Address address;
	String contact;
	String email;

	public Client() {
	}

	public Client(Integer id, String name, String cpf, String rg, String birthday, Address address, String contact,
			String email) {
		this.setAddress(address);
		this.setBirthday(birthday);
		this.setContact(contact);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setName(name);
		this.setRg(rg);
		this.setId(id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setAddressId(Integer addressId) {
		this.address.id = addressId;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
