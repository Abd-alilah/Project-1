/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author LOL
 */
public class ElectronicProduct extends Product {
    private String brand ;
    private int WarrantyPeriod ;
  
public ElectronicProduct(){}

public ElectronicProduct(int productId, String name, double price, String brand, int WarrantyPeriod){
super(productId, name, price) ;
this.brand = brand ;
this.WarrantyPeriod = WarrantyPeriod ; }

public void setbrand(String b){
    brand = b ;}
    
public void setWarrantyPeriod(int w){
      if(w >0)
         WarrantyPeriod = w ;
      else
          WarrantyPeriod = Math.abs(w);}
    
public String getbrand(){
    return brand ; }
   
public int getWarrantyPeriod(){
   return WarrantyPeriod;}

}