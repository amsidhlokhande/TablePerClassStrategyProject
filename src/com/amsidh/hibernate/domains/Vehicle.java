package com.amsidh.hibernate.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //this is default InheritanceType.SINGLE_TABLE
public class Vehicle {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.TABLE) //You cannot use a native, auto-generated id generator if you want to use TABLE_PER_CLASS inheritance
	private int vehicleId;
	private String vehicleName;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
}
