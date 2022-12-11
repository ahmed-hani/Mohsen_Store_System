/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import DB_Connection.DBConnection;
import assets.Product;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author ahmed
 */
public class product_screen extends javax.swing.JFrame {

    /**
     * Creates new form product_screen
     */
    public product_screen() {
        initComponents();
        selectedDev();
        clear();
    }
    Connection conn=null;
Statement st=null;
ResultSet rs=null;
PreparedStatement prst=null;
public void clear(){
txtid.setText("");
txtname.setText("");
txtquantity.setText("");
txtcate.setText("");
txtprice.setText("");
}
Product pr=new Product();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtcate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnedite = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproducts = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcate.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jPanel1.add(txtcate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 150, -1));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setText("الاسم");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 60, 20));

        txtid.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 150, -1));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setText("السعر");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 60, 20));

        txtprice.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 150, -1));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel4.setText("الصنف");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 60, 20));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setText("الكمية");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 60, 20));

        btndelete.setBackground(java.awt.Color.red);
        btndelete.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btndelete.setText("حذف");
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        btnadd.setBackground(new java.awt.Color(0, 255, 255));
        btnadd.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btnadd.setText("اضافة ");
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaddMouseClicked(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        btnedite.setBackground(new java.awt.Color(51, 51, 255));
        btnedite.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btnedite.setText("تعديل");
        btnedite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnediteMouseClicked(evt);
            }
        });
        jPanel1.add(btnedite, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        tbproducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 810, 240));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel7.setText("  الرقم   ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 60, 20));

        txtquantity.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jPanel1.add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, -1));

        txtname.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 150, -1));

        btncancel.setBackground(new java.awt.Color(51, 255, 51));
        btncancel.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        btncancel.setText("رجوع");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void selectedDev(){
        try{
     conn=new DBConnection().getconnection();
      st=conn.createStatement();
      rs=st.executeQuery("select* from product");
     tbproducts.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
       e.printStackTrace();
       }
    }
    
    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        if(txtid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "please enter the  id product want deleted");
        }
        else{
            try{
//                 Connection conn=new DBConnection().getconnection();
//
//                PreparedStatement delete=conn.prepareStatement("DELETE FROM product WHERE ID=?");
//                delete.setInt(1,Integer.valueOf(txtid.getText()));
//                delete.execute();
//                
                     pr.setId(Integer.valueOf(txtid.getText()));
                     pr.Delete();
                JOptionPane.showMessageDialog(this, "product successfully Deleted" );
                selectedDev();
                clear();
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btndeleteMouseClicked

    private void btnaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMouseClicked
        try{
//            Connection conn=new DBConnection().getconnection();
//
//            PreparedStatement add=conn.prepareStatement("insert into product values (?,?,?,?,?)");
//            add.setInt(1,Integer.valueOf(txtid.getText()));
//            add.setString(2,txtname.getText());
//            add.setInt(3,Integer.valueOf(txtquantity.getText()));
//            add.setString(4,txtcate.getText());
//            add.setInt(5,Integer.valueOf(txtprice.getText()));
//            int row= add.executeUpdate();
             
             pr.setId(Integer.valueOf(txtid.getText()));
             pr.setProduct_name(txtname.getText());
             pr.setQuantity(Integer.valueOf(txtquantity.getText()));
             pr.setCategory(txtcate.getText());
             pr.setPrice(Integer.valueOf(txtprice.getText()));
             pr.Add();
             
            JOptionPane.showMessageDialog(this, "product successfully addsd" );
           // conn.close();
             selectedDev();
             clear();
        }

        //if(add()==true){
            //JOptionPane.showMessageDialog(this, "product successfully addsd" );
           // }}
    catch(Exception e){
        e.printStackTrace();
        }
    }//GEN-LAST:event_btnaddMouseClicked

    private void btnediteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnediteMouseClicked
        if(txtid.getText().isEmpty() ||txtname.getText().isEmpty() ||txtprice.getText().isEmpty() || txtquantity.getText().isEmpty() || txtcate.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information ");
        }else
        {
            try{
//               Connection conn=new DBConnection().getconnection();
//                PreparedStatement edite=conn.prepareStatement("UPDATE product SET PRODUCT_NAME=?,QUANTITY=?,CATEGORY=?,PRICE=? WHERE ID=?");
//                edite.setString(1,txtname.getText());
//                edite.setInt(2,Integer.valueOf(txtquantity.getText()));
//                edite.setString(3,txtcate.getText());
//                edite.setInt(4,Integer.valueOf(txtprice.getText()));
//                edite.setInt(5,Integer.valueOf(txtid.getText()));
//                edite.execute();
                     
             pr.setId(Integer.valueOf(txtid.getText()));
             pr.setProduct_name(txtname.getText());
             pr.setQuantity(Integer.valueOf(txtquantity.getText()));
             pr.setCategory(txtcate.getText());
             pr.setPrice(Integer.valueOf(txtprice.getText()));
             pr.Edite();
                JOptionPane.showMessageDialog(this, "product UPDATED ");
                selectedDev();
                clear();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnediteMouseClicked

    private void tbproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductsMouseClicked
        DefaultTableModel model=(DefaultTableModel)tbproducts.getModel();
        int myindex=tbproducts.getSelectedRow();
        txtid.setText(model.getValueAt(myindex, 0).toString());
        txtname.setText(model.getValueAt(myindex, 1).toString());
        txtquantity.setText(model.getValueAt(myindex, 2).toString());
        txtcate.setText(model.getValueAt(myindex, 3).toString());
        txtprice.setText(model.getValueAt(myindex,4 ).toString());
       
    }//GEN-LAST:event_tbproductsMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
   this.setVisible(false);
   new Main_screen().setVisible(true);
        
        
    }//GEN-LAST:event_btncancelMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(product_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbproducts;
    private javax.swing.JTextField txtcate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
