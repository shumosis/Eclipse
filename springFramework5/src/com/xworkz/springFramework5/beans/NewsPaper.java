package com.xworkz.springFramework5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NewsPaper {
	
@Autowired
@Qualifier("NPid")
private String	id ;
private String name;
private String owner;
@Autowired
@Qualifier("NPlang")
private String lang;
private int price;


@Autowired
public NewsPaper(@Qualifier("NPname")String name,@Qualifier("NPowner") String owner) {
	this.name = name;
	this.owner = owner;
}
public int getPrice() {
	return price;
}
@Autowired
@Qualifier("NPprice")
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "NewsPaper [id=" + id + ", name=" + name + ", owner=" + owner + ", lang=" + lang + ", price=" + price + "]";
}




}
