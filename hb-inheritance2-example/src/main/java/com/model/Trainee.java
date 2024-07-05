package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Trainee200")
@PrimaryKeyJoinColumn(name="ID")
public class Trainee extends Employee{
	private int payperhour;
	private String contractPeriod;
	public Trainee(int id, String name, int payperhour, String contractPeriod) {
		super(id, name);
		this.payperhour = payperhour;
		this.contractPeriod = contractPeriod;
	}
	public Trainee(String name, int payperhour, String contractPeriod) {
		// TODO Auto-generated constructor stub
		super(name);
		this.payperhour=payperhour;
		this.contractPeriod=contractPeriod;
	}
	public int getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(int payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractPeriod() {
		return contractPeriod;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	

}
