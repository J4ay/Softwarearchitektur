/*========================================================================*
 *                                                                        *
 * This software is governed by the GPL version 2.                        *
 *                                                                        *
 * Copyright: Jay Imort, Kyle Mezger University of Applied Sciences Esslingen *
 *                                                                        *
 * $Id:$
 *                                                                        *
 *========================================================================*/
package de.hse.swa.jodel.orm.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "User")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "ZSEQ_USER_ID", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator = "userSeq")

	@Column(name = "USER_ID")
	private Long id;

	@Basic(optional = false)
	@Column(name = "userFirstName",length = 50)
	private String userFirstName;

	@Basic(optional = false)
	@Column(name = "userLastName",length = 50)
	private String userLastName;

	@Basic(optional = false)
	@Column(name = "userLoginName",length = 50)
	private String userLoginName;

	@Basic(optional = false)
	@Column(name = "userPassword",length = 50)
	private String userPassword;

	@Basic(optional = false)
	@Column(name = "userMail",length = 50)
	private String userMail;

	@Basic(optional = false)
	@Column(name = "userPhoneNumber1",length = 50)
	private String userPhoneNumber1;

	@Basic(optional = true)
	@Column(name = "userPhoneNumber2",length = 50)
	private String userPhoneNumber2;
	
	@Basic(optional = false)
	@Column(name = "isAdmin")
	private boolean isAdmin;

	public User() {
	}

	public User(String name, String lastName, String loginName, String password, String mail, String phoneNumber1, boolean isAdmin) {
		this.userFirstName = name;
		this.userLastName = lastName;
		this.userLoginName = loginName;
		this.userPassword = password;
		this.userMail = mail;
		this.userPhoneNumber1 = phoneNumber1;
		this.isAdmin = isAdmin;
	}

	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.userFirstName;
	}
	public void setFirstname(String name) {
		this.userFirstName = name;
	}
	
	public String getLastName() {
		return this.userLastName;
	}
	public void setLastName(String lastName) {
		this.userLastName = lastName;
	}

	public String getLoginName() {
		return this.userLoginName;
	}
	public void setLoginName(String loginName) {
		this.userLoginName = loginName;
	}

	public String getPassword() {
		return this.userPassword;
	}
	public void setPassword(String password) {
		this.userPassword = password;
	}

	public String getMail() {
		return this.userMail;
	}
	public void setMail(String mail) {
		this.userMail = mail;
	}

	public String getPhoneNumber1() {
		return this.userPhoneNumber1;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		this.userPhoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return this.userPhoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.userPhoneNumber2 = phoneNumber2;
	}

	public boolean isAdmin() {
		return this.isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + userFirstName + ", lastName=" + userLastName + ", loginName=" + userLoginName
				+ ", mail=" + userMail + ", phoneNumber1=" + userPhoneNumber1 + ", phoneNumber2=" + userPhoneNumber2 + ", isAdmin="
				+ isAdmin + "]";
	}
	
}