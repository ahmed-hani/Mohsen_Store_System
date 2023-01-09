/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assets;

import DB_Connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author ahmed
 */
public class Order {

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
  int id;
String product_name;
int quantity;
int cost;
String date;
int product_id;

    public Order(int id, int product_id, int quantity, int cost, String date) {
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.cost = cost;
        this.date = date;
    }

    public Order() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

   
   
   


   public boolean Add() throws Exception {
        Connection conn= DBConnection.getInstance().getconnection();

            PreparedStatement add=conn.prepareStatement("insert into orders values (?,?,?,?,?)");
        add.setInt(1, id);
        add.setInt(2, product_id);
        add.setInt(3, quantity);
        add.setInt(4, cost);
        add.setString(5,  date);
        add.execute();
        return true;
    }

    public boolean Edite() throws Exception {
        Connection conn= DBConnection.getInstance().getconnection();
                PreparedStatement edite=conn.prepareStatement("UPDATE `orders` SET `PRODUCT_NAME`=? ,`QUANTITY`=? ,`COST`=? ,`DATE`=? WHERE `ID`=?");
        edite.setInt(1, product_id);
        edite.setInt(2, quantity);
        edite.setInt(3, cost);
        edite.setString(4,  date);
        edite.setInt(5, id);
        edite.execute();
        return true;
    }

    public boolean Delete() throws Exception {
        Connection conn= DBConnection.getInstance().getconnection();
        PreparedStatement delete = conn.prepareStatement("DELETE FROM orders WHERE id=?");
        delete.setInt(1, id);
        delete.execute();
        return true;
    }
     public boolean AutoNum() throws Exception {
       Connection conn= DBConnection.getInstance().getconnection();
        PreparedStatement get = conn.prepareStatement("SELECT MAX(`ID`) FROM `orders`");
        get.setInt(1, id);
        get.execute();
        return true;
    }

    
}
