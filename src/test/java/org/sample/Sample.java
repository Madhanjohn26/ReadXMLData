package org.sample;

import java.io.File;

import org.pojo.Employee;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class Sample {
	
	public static void readXmlValue() throws JAXBException {
		
		//create the JAXBContext
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		//create Unmarsheller
		Unmarshaller un = context.createUnmarshaller();
		//xml file ashik.xml file path
		File xmlPath = new File("C:\\Users\\MADHAN\\eclipse-workspace\\ReadXMLData\\ashik.xml");
		Object object = un.unmarshal(xmlPath);
		//type case higher to lower object to class
		Employee e = (Employee)object;
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getEmailId());
		System.out.println(e.getPhoneNo());
		
		//permanent address class value
		
		System.out.println("Permanent Address");
		System.out.println(e.getAddress().getPermanentAddress().getStreetName());
		System.out.println(e.getAddress().getPermanentAddress().getCityName());
		System.out.println(e.getAddress().getPermanentAddress().getDistrict());
		System.out.println(e.getAddress().getPermanentAddress().getState());
		
		System.out.println("Temporary Address");
		System.out.println(e.getAddress().getTemporaryAddress().getStreetName());
		System.out.println(e.getAddress().getTemporaryAddress().getCityName());
		System.out.println(e.getAddress().getTemporaryAddress().getDistrict());
		System.out.println(e.getAddress().getTemporaryAddress().getState());
	}
	
	public static void main(String[] args) throws JAXBException
	{
		readXmlValue();
	}
}
