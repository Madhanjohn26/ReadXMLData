package org.pojo;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	//the class name same as xml root element <employee>
	
	private List<Emp> emp;

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
	

}
