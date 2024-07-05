package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="RegEmployee200")
@PrimaryKeyJoinColumn(name="ID")
public class RegEmployee extends Employee {
	private int salary;
	private int bonus;
	public RegEmployee(int id, String name, int salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public RegEmployee(String name, int salary, int bonus) {
		// TODO Auto-generated constructor stub
		super(name);
		this.salary=salary;
		this.bonus=bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	


}
