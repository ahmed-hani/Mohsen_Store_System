/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assets;

import DB_Connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.LinkedList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author ahmed
 */
public class Product {
    
   int id;
   String product_name;
   int quantity;
   String category;
   int price;

    public Product(int id, String product_name, int quantity, String category, int price) {
        this.id = id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }
     public Product(int id,String product_name, int quantity,int price){
     this.id=id;
     this.product_name = product_name;
        this.quantity = quantity;
         this.price = price;
     }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   public boolean Add() throws Exception {
        Connection conn= DBConnection.getInstance().getconnection();

            PreparedStatement add=conn.prepareStatement("insert into product values (?,?,?,?,?)");
        add.setInt(1, id);
        add.setString(2, product_name);
        add.setInt(3, quantity);
        add.setString(4, category);
        add.setInt(5, price);
       
        
        add.execute();
        return true;
    }

    public boolean Edite() throws Exception {
        Connection conn= DBConnection.getInstance().getconnection();
                PreparedStatement edite=conn.prepareStatement("UPDATE product SET PRODUCT_NAME=?,QUANTITY=?,CATEGORY=?,PRICE=? WHERE ID=?");
        edite.setString(1, product_name);
        edite.setInt(2, quantity);
        edite.setString(3, category);
        edite.setInt(4,price);
       
        edite.setInt(5, id);
        edite.execute();
        return true;
    }

    public boolean Delete() throws Exception {
       Connection conn= DBConnection.getInstance().getconnection();
        PreparedStatement delete = conn.prepareStatement("DELETE FROM product WHERE ID=?");
        delete.setInt(1, id);
        delete.execute();
        return true;
    }
    
     public boolean updateQuantity() throws Exception {
        Connection conn= DBConnection.getInstance().getconnection();
                PreparedStatement edite=conn.prepareStatement("UPDATE `product` SET `QUANTITY`=? WHERE `PRODUCT_NAME`=?");
        
        edite.setInt(1, quantity);
        edite.setString(2, product_name);
       
        edite.execute();
        return true;
    }
      
      public  LinkedList<Product> getData() throws Exception {
        LinkedList<Product> data = new LinkedList<Product>();
        for(Product pr:data){
        data.add(pr);
        }
        return data;
    }
    
     
    
}
