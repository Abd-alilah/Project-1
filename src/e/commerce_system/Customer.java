/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author LOL
 */
public class Customer {
   private int customerId ;
   private String name ;
   private String address ;
    
public Customer() {}

public Customer(int customerId, String name, String address){
this.customerId = Math.abs(customerId) ;
this.name = name ;
this.address = address ; }
   
public void setcustomerId(int id){
  if(id >0)
    customerId = id ;
  else 
      customerId = Math.abs(id); }

public void setname(String n){
    name = n ; }

public void setaddress(String a){
    address = a ; }

public int getcustomerId(){
    return customerId ; }

public String getname(){
    return name ; }

public String getaddress(){
    return address ;}

    

    
}
