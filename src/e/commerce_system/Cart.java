/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author LOL
 */
public class Cart {
    private int customerId  ;
    private int nProducts ;
    Product [] products ;
    
public Cart(){
}

public Cart(int customerId, int nProducts){
    this.customerId = Math.abs(customerId);
    this.nProducts =  Math.abs(nProducts) ;
    this.products = new Product[nProducts] ; }

public void setnProducts(int n){
    if(n >0)
        nProducts = n ;
    else
        nProducts = Math.abs(n); }

public int getnproducts(){
    return nProducts ; }

public double calculatePrice(){
    double totalPrice = 0 ;
    for(int i=0;i<products.length;i++){
        totalPrice += products[i].price ;  }  
    return totalPrice ;}    
    
public void addProduct(Product product){
  for(int i=0;i<products.length;i++){
      if(products[i]==null){
          products[i] = product ;
          break ;}}}
  
public void removeProdut(int index){
    products[index] = null ;  }
        
public void placeOrder(Order order, int n){
       if(n==1){
          order.printOrderInfo(); }
       else 
           for(int i=0;i<products.length;i++){
               products[i] = null ;
           }
}
   
}


