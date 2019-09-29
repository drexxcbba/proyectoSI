
package trabajosisinfo;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class trabajo extends javax.swing.JFrame {

   Conector con=new Conector();
   Connection cn=con.getConnection();
   
    public trabajo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtpostre = new javax.swing.JTextField();
        bRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("postre");

        txtpostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpostreActionPerformed(evt);
            }
        });

        bRegistrar.setText("REGISTRAR");
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpostre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bRegistrar)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpostreActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtpostreActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
       //int bandera=validar();
     try{
              PreparedStatement pss=(PreparedStatement) cn.prepareStatement("INSERT INTO postre(nombre)VALUES(?)");
              if(verificarSiExiste()==false){
                  pss.setString(1,txtpostre.getText());
                  JOptionPane.showMessageDialog(null,"datos guardados");
                  pss.executeUpdate();
              }else{
                  
                  JOptionPane.showMessageDialog(null,"ya existen los datos");
              }
              
          }
          catch(Exception e){

         }
    }//GEN-LAST:event_bRegistrarActionPerformed
    public boolean verificarSiExiste() throws SQLException{
        boolean band=false;
        try{
           PreparedStatement pss=(PreparedStatement) cn.prepareStatement("SELECT * FROM postre WHERE nombre=?");
             pss.setString(1,txtpostre.getText());
             ResultSet rs=pss.executeQuery();
             if(rs.next()){
                 band=true;
             }
        }catch(Exception e){
        }
        return band;
    }
    
    /*
    public int validar(){
        int validar=-1;
        try{
            Connection cn=con.getConnection();
            PreparedStatement pss= (PreparedStatement) cn.prepareStatement("SELECT EXISTS(SELECT * FORM postre WHERE nombre=?)");
            pss.setString(1,txtpostre.getText());
            ResultSet rs =pss.executeQuery();
            //String cad=rs.getString("nombre");
            validar=rs.getInt("nombre");
            
        }
        catch(Exception e){
        
        }
        return validar;
    }
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtpostre;
    // End of variables declaration//GEN-END:variables
}
