/*========================================================================*
 *                                                                        *
 * This software is governed by the GPL version 2.                        *
 *                                                                        *
 * Copyright: Joerg Friedrich, University of Applied Sciences Esslingen   *
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


/**
 * The persistent class for the TUSER database table.
 * 
 */
@Entity
@Table(name = "Customers")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @SequenceGenerator(name = "tuserSeq", sequenceName = "ZSEQ_TUSER_ID", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator = "tuserSeq")
    
    @Column(name = "custID")
    private Long custID;

    @Basic(optional=false)
    @Column(name = "name", length=64, unique = true)
    private String name;
    
    @Basic(optional=true)
    @Column(name = "department", length=64)
    private String department;

	@Basic(optional=true)
    @Column(name = "address", length=64)
    private String address;

	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}

	
	public Long getCustID() {
		return this.custID;
	}

	public void setCustID(Long id) {
		this.custID = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	public String getAddress() {
		return this.department;
	}

	public void setAddress(String department) {
		this.department = department;
	}

	
}