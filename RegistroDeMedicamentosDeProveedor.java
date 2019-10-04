/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisinfo;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StringUtils;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jheyson
 */
public class RegistroDeMedicamentosDeProveedor extends javax.swing.JFrame {

    String nombre;
    DefaultTableModel modelo=new DefaultTableModel();
    Connection con;
    public RegistroDeMedicamentosDeProveedor() {
        initComponents();
        modelo.addColumn("nombre");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio Unitario");
        modelo.addColumn("total");
        TablaP.setModel(modelo);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        proveedorTEx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaP = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        productoTex = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cantidadTex = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        precioTex = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Proveedor");

        proveedorTEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorTExActionPerformed(evt);
            }
        });

        jLabel2.setText("Farmaceutico");

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "cantidad", "precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaP);

        jLabel6.setText("Producto");

        productoTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoTexActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad");

        jLabel8.setText("Precio Unitario");

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(jButton2)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productoTex)
                            .addComponent(proveedorTEx)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cantidadTex, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(precioTex, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedorTEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productoTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantidadTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(precioTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAgregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proveedorTExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorTExActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorTExActionPerformed
    
    public void setConex(Connection aux){
    
        con = aux;
    }
    
    private Object consulta(String cad){
           Object res = null;
       
        return res;
    }
    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
           String proveedor=proveedorTEx.getText();
           String producto=productoTex.getText();
           String cantidad=cantidadTex.getText();
           String precio=precioTex.getText();
           double v1=Double.parseDouble(cantidadTex.getText());
           double v2=Double.parseDouble(precioTex.getText());
           double res =v1*v2;
           String aux=res+"";
           String[] obj={producto,cantidad,precio,aux};
           modelo.addRow(obj);
           
           productoTex.setText("");
           cantidadTex.setText("");
           precioTex.setText("");
           
           
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String proveedor=proveedorTEx.getText();
        String producto=productoTex.getText();
        String cantidad=cantidadTex.getText();
        String precio=precioTex.getText();
        String farma = jTextField1.getText();
         int id=0;
            try {
           PreparedStatement ps=null;
           ResultSet rs=null;
           String sql="SELECT idProvedor FROM provedor"+" where nomProv ='"+proveedor+"'";  
           ps=(PreparedStatement) con.prepareStatement(sql);
           rs=ps.executeQuery();
                while (rs.next()) {
                    id = rs.getInt(1);
                }
             
            JOptionPane.showMessageDialog(null, id);
            if(id > 0){
            
                String search = "SELECT idMedicamento FROM medicamento WHERE nombreMed = '"+producto+"'";
                PreparedStatement ps1 = null;
                ps1 = (PreparedStatement) con.prepareStatement(search);
                ResultSet rs1 = null;
                rs1 = ps1.executeQuery();
                int m = 0;
                while(rs1.next()){
                
                    m = rs1.getInt(1);
                }
                JOptionPane.showMessageDialog(null, m);
                if(m > 0){
                    
                    
                    String far = "select idFarmaceutico from farmaceutico where nomFarma = '"+farma+"'";
                    PreparedStatement ps3 = null;
                    ps3 = (PreparedStatement) con.prepareStatement(far);
                    ResultSet rs3 = null;
                    rs3 = ps3.executeQuery();
                    int fa = 0;
                    while(rs3.next()){
                    
                        fa = rs3.getInt(1);
                    }
                    JOptionPane.showMessageDialog(null, m);
                    int cant = Integer.parseInt(cantidad);
                    int pre = Integer.parseInt(precio);
                    String ins = "Insert into compra (Provedor_idProvedor,Medicamento_idMedicamento,Farmaceutico_idFarmaceutico,cant,precio) VALUES(?,?,?,?,?)";
                    PreparedStatement ps2;
                    ps2=(PreparedStatement) con.prepareStatement(ins);
                    ps2.setInt(1,id);
                    ps2.setInt(2,m);
                    ps2.setInt(3, fa);
                    ps2.setInt(4, cant);
                    ps2.setInt(5, pre);
                    ps2.executeUpdate();
                }else{
                
                    JOptionPane.showMessageDialog(null, "El producto no esta registrado aun");
                }
            }else{
            
                JOptionPane.showMessageDialog(null,"Actualmente no existe el provedor ,agrege primero el provedor antes de hacer esta accion");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "s");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productoTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoTexActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeMedicamentosDeProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMedicamentosDeProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMedicamentosDeProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeMedicamentosDeProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeMedicamentosDeProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JTable TablaP;
    private javax.swing.JTextField cantidadTex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField precioTex;
    private javax.swing.JTextField productoTex;
    private javax.swing.JTextField proveedorTEx;
    // End of variables declaration//GEN-END:variables
}
