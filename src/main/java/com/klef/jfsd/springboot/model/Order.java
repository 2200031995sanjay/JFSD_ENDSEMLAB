package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "oid")
  private int oderid;
  @Column(name = "oname",nullable = false,length = 50)
  private String productname;
 
  @Column(name = "oquantity",nullable = false)
  private int quantity;
  @Column(name = "odate",nullable = false,length = 30)
  private String date;
  @Column(name = "ocustomername",nullable = false,length = 50)
  private String cusromername;
public int getOderid() {
	return oderid;
}
public void setOderid(int oderid) {
	this.oderid = oderid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getCusromername() {
	return cusromername;
}
public void setCusromername(String cusromername) {
	this.cusromername = cusromername;
}


}
