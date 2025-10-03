package org.pojo;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;


//Java to XML productdetails - product - javetoxmlsample
@XmlRootElement
public class ProductDetails {
	
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

}
