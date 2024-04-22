/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;
/**
 *
 * @author LOL
 */
public class Product {
protected int productId ;
protected String name ;
protected double price ;

public Product(){}

public Product(int productId, String name, double price){
    if(productId >0)
      this.productId = productId ;
    else
        this.productId = Math.abs(productId) ;
    this.name = name ;
    if(price >0)
      this.price = price ;
    else 
        this.price = Math.abs(price) ;}
   
public void setproductId(int id){
 if(id >0)  
 productId = id ;   
 else 
 productId = Math.abs(id);}

public void setname(String n){
    name = n ;}

public void setprice(double p){
 if(p >0)
   price = p ;
 else
     price = Math.abs(p);}

public int getproductId(){
  return productId ;}  

public String getname(){
    return name ;}
public double getprice(){
    return price ;}


        
             

}
