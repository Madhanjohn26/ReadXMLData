package org.sample;

import java.io.File;
import java.util.List;

import org.pojo.Emp;
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
		
		List<Emp> empTableValue = e.getEmp();
		
		for (Emp empEachDetails : empTableValue) {
			
			//emp table values
			System.out.println(empEachDetails.getEmpId());
			System.out.println(empEachDetails.getName());
			System.out.println(empEachDetails.getEmailId());
			System.out.println(empEachDetails.getPhoneNo());
			
			//Permanent Address values
			System.out.println(empEachDetails.getAddress().getPermanentAddress().getStreetName());
			System.out.println(empEachDetails.getAddress().getPermanentAddress().getCityName());
			System.out.println(empEachDetails.getAddress().getPermanentAddress().getDistrict());
			System.out.println(empEachDetails.getAddress().getPermanentAddress().getState());
			
			//Temporary Address
			System.out.println(empEachDetails.getAddress().getTemporaryAddress().getStreetName());
			System.out.println(empEachDetails.getAddress().getTemporaryAddress().getCityName());
			System.out.println(empEachDetails.getAddress().getTemporaryAddress().getDistrict());
			System.out.println(empEachDetails.getAddress().getTemporaryAddress().getState());
			
			
		}
		
		
	}
	
	public static void main(String[] args) throws JAXBException
	{
		readXmlValue();
	}
}
