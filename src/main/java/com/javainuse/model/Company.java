package com.javainuse.model;

public class Company {
	private String comId;
	private String name;
	private String goal;
	private String CEO;

	public Company() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getCEO() {
		return CEO;
	}

	public void setCEO(String CEO) {
		this.CEO = CEO;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

}