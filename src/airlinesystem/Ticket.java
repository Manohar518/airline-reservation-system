/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package airlinesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author manoh
 */
public class Ticket extends javax.swing.JInternalFrame {

    private Object fiddate;

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        initComponents();
    }

    Connection con;
    PreparedStatement pt;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tsource1 = new javax.swing.JComboBox<>();
        tdestination1 = new javax.swing.JComboBox<>();
        tsource = new javax.swing.JLabel();
        tdestination = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fdate = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        custid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fid2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fsource = new javax.swing.JTextField();
        fdest = new javax.swing.JTextField();
        fdept = new javax.swing.JTextField();
        farrival = new javax.swing.JTextField();
        fprice = new javax.swing.JTextField();
        fdate1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        tsource1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Bangalore", "Hyderebad", "Tiruapati" }));
        tsource1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsource1ActionPerformed(evt);
            }
        });

        tdestination1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Bangalore", "Hyderebad", "Tiruapati" }));

        tsource.setText("Source");

        tdestination.setText("Destination");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tsource1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tsource))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tdestination)
                            .addComponent(tdestination1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton1)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsource)
                    .addComponent(tdestination))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsource1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdestination1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1))
        );

        fdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FlightID", "Date", "Departure time", "Arrivial", "Price"
            }
        ));
        fdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fdateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fdate);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel4.setText("Customer ID");

        custid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custidActionPerformed(evt);
            }
        });

        jLabel6.setText("Flight ID");

        jLabel7.setText("Source");

        jLabel8.setText("Destination");

        date.setText("Date");

        jLabel10.setText("Departure");

        jLabel11.setText("Arrival");

        jLabel12.setText("Price");

        fdest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(date)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(farrival, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fdept, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fdate1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(fdest, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fsource, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fid2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fprice))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fsource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fdest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date)
                    .addComponent(fdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(farrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");

        jLabel1.setText("Select City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(194, 194, 194)
                .addComponent(jButton3)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //book
    private static boolean validCustomer(String custID)
    {
        boolean flag=false;
        try {
            Connection con;
            PreparedStatement pt;
          
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Manu@123R");
            pt = con.prepareStatement("select * from customer where custid=?");
            pt.setString(1, custID);
            ResultSet rs=pt.executeQuery();
            if(rs.next())
            {
                flag=true;
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    private void tsource1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsource1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsource1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String source = tsource1.getSelectedItem().toString();
            String destination = tdestination1.getSelectedItem().toString();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "Manu@123");
            pt = con.prepareStatement("select * from flight where src = ? and destination = ?");
            
            pt.setString(1, source );
            pt.setString(2, destination );
            
            ResultSet rs = pt.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();
            
            int c;
            c = rm.getColumnCount();
            
            DefaultTableModel table = (DefaultTableModel) fdate.getModel();
            table.setRowCount(0);
            
            while(rs.next()){
                
                Vector vect = new Vector();
                
                for(int i=1;i<=5;i++){
                    //v2.add(rs.getString("idFlight"));
                    vect.add(rs.getString("flightid"));
                   // vect.add(rs.getString("src"));
                    //vect.add(rs.getString("destination"));
                    vect.add(rs.getString("deptdate"));
                    vect.add(rs.getString("departure"));
                    vect.add(rs.getString("arrival"));
                    vect.add(rs.getString("price"));
                    
                   
                    
                    /*vect.add("flightid");
                    
                    vect.add("deptdate");
                    vect.add("departure");
                    vect.add("arrival");
                    vect.add("price");
                    */
                }
                
                table.addRow(vect);
                
            }
                    
           } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void custidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custidActionPerformed

    private void fdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fdateMouseClicked
        // TODO add your handling code here:
     DefaultTableModel tab=(DefaultTableModel) fdate.getModel();
        int selected=fdate.getSelectedRow();
        String id=tab.getValueAt(selected, 0).toString();
        fid2.setText(tab.getValueAt(selected, 0).toString());
//               // fdest.setText(dest);
//                fdate.setText(tab.getValueAt(selected, 1).toString());
//                fdept.setText(tab.getValueAt(selected, 2).toString());
//                farrival.setText(tab.getValueAt(selected, 3).toString());
//                 fprice.setText(tab.getValueAt(selected, 4).toString());
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Manu@123");
            pt=con.prepareStatement("select * from flight where flightid=?");
            pt.setString(1,id);
            ResultSet rs=pt.executeQuery();
            //rs.absolute(selected);
            if(rs.next())
            {
                 String dest=rs.getString(3);
             String source=rs.getString(2);
              String date=rs.getString(4);
               String departure=rs.getString(5);
                String arrival=rs.getString(6);
                String price=rs.getString(7);
                fsource.setText(source);
                fdest.setText(dest);
                 //String date1 = rs.getString("date");
                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                
                fdate1.setDate(date1);
                //fdate.setDate(date1);
                fdept.setText(departure);
                farrival.setText(arrival);
                 fprice.setText(price);
            }else{
                 JOptionPane.showMessageDialog(null, "sorry,flight is not available at this moment!");
            }
           
                
                
        } catch (SQLException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }                                     
      
    }//GEN-LAST:event_fdateMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            // this.setVisible(false);
            String custId=custid.getText();
            String flightId=fid2.getText();
            String source=fsource.getText();
            String dest=fdest.getText();
            Date date=fdate1.getDate();
            String dept=fdept.getText();
            String arrival=farrival.getText();
            String price=fprice.getText();
           // boolean check=validCustomer(custId);
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Manu@123");
           pt=con.prepareStatement("select * from customer where custid=?");
           pt.setString(1, custId);
           ResultSet rs= pt.executeQuery();
            if(rs.next())
            {
                //Connection con;
            //PreparedStatement pt;
          
            
            pt = con.prepareStatement("insert into ticket values (?, ?, ?, ?, ?, ?, ?, ?)");
            pt.setString(1, custId);
            pt.setString(2, flightId);
            pt.setString(3, source);
            pt.setString(4, dest);
            //String date = pt.getString("date");
              //  Date da = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            
            DateFormat date1=new SimpleDateFormat("yyyy-MM-dd");
            String date2=date1.format(fdate1.getDate());
            pt.setString(5, date2);
            pt.setString(6, dept);
            pt.setString(7, arrival);
            pt.setString(8, price);
            int i=pt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Booked Successfully!");
            }else{
                 JOptionPane.showMessageDialog(null, "customer id dosen't exist!");
            }
            
            
      
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Limit Exceeded!");
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fdestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custid;
    private javax.swing.JLabel date;
    private javax.swing.JTextField farrival;
    private javax.swing.JTable fdate;
    private com.toedter.calendar.JDateChooser fdate1;
    private javax.swing.JTextField fdept;
    private javax.swing.JTextField fdest;
    private javax.swing.JTextField fid2;
    private javax.swing.JTextField fprice;
    private javax.swing.JTextField fsource;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tdestination;
    private javax.swing.JComboBox<String> tdestination1;
    private javax.swing.JLabel tsource;
    private javax.swing.JComboBox<String> tsource1;
    // End of variables declaration//GEN-END:variables

   
  

}
