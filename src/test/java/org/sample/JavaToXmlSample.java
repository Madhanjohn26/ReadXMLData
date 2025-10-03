package org.sample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.pojo.Product;
import org.pojo.ProductDetails;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class JavaToXmlSample {
	
	public static void JavaToXmlSample() throws JAXBException
	{
		JAXBContext context = JAXBContext.newInstance(ProductDetails.class);
		
		Marshaller mn = context.createMarshaller();
		
		File xmlFile = new File("C:\\Users\\MADHAN\\eclipse-workspace\\ReadXMLData\\productDetails.xml");
			
		ProductDetails productdetails = new ProductDetails();
		List<Product> product = new ArrayList<Product>();
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Samsung");
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("OPPO");
		
		product.add(p1);
		product.add(p2);
		
		productdetails.setProduct(product);
			
		mn.marshal(productdetails, xmlFile);
		
		System.out.println("Read data from Java to XML successfully");
		
	}
	
	public static void main(String[] args) throws JAXBException
	{
		JavaToXmlSample();
	}
	
 
	

}
