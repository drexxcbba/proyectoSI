package trabajosisinfo;



import com.mysql.jdbc.PreparedStatement;
import com.sun.media.sound.ModelOscillator;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ventana extends javax.swing.JFrame {
       String codigo="";
       String nombre="";
        DefaultTableModel modelo=new DefaultTableModel();
    public ventana() {
        initComponents();
        try {
          
           jproductor.setModel(modelo);
           PreparedStatement ps=null;
           ResultSet rs=null;
           conexcion cnn= new conexcion();
           Connection con =cnn.getConex();
           
           String sql="SELECT id  ,nombre,telefono FROM proveedor";  
           ps=(PreparedStatement) con.prepareStatement(sql);
           rs=ps.executeQuery();
           
           ResultSetMetaData rsMd=rs.getMetaData();
           int cantidadColumnas=rsMd.getColumnCount();
           
           modelo.addColumn("codigo");
           modelo.addColumn("nombre");
           modelo.addColumn("telefono");
           while(rs.next()){
               Object[] filas =new Object[cantidadColumnas];
               for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs.getObject(i+1);
               }
              modelo.addRow(filas);  
           }  
        } catch (Exception e) {
                System.out.println("error");
        }       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        codigoTex = new javax.swing.JTextField();
        nombreTex = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jproductor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("salir");

        codigoTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTexActionPerformed(evt);
            }
        });

        nombreTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTexActionPerformed(evt);
            }
        });

        jButton4.setText("buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jproductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "codigo", "nombre", "telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jproductor);

        jLabel1.setText("codigo");

        jLabel2.setText("nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigoTex)
                                    .addComponent(nombreTex, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)
                        .addGap(76, 76, 76)
                        .addComponent(jButton2)
                        .addGap(84, 84, 84)
                        .addComponent(jButton3)))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codigoTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTexActionPerformed
            codigo=codigoTex.getText();
    }//GEN-LAST:event_codigoTexActionPerformed

    private void nombreTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTexActionPerformed
            nombre=nombreTex.getText();
    }//GEN-LAST:event_nombreTexActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String codigo=codigoTex.getText();
        String nombre=nombreTex.getText();
        
        String where ="";
        if(!"".equals(codigo)){
            if(!"".equals(nombre)){
                where=" WHERE nombre = '"+ nombre+"'";
            }
        }
        
         try {
           DefaultTableModel modelo=new DefaultTableModel();
           jproductor.setModel(modelo);
           PreparedStatement ps=null;
           ResultSet rs=null;
           conexcion cnn= new conexcion();
           Connection con =cnn.getConex();
           
           String sql="SELECT id,nombre,telefono FROM proveedor"+where;  
             System.out.println(sql);
           ps=(PreparedStatement) con.prepareStatement(sql);
           rs=ps.executeQuery();
           
           ResultSetMetaData rsMd=rs.getMetaData();
           int cantidadColumnas=rsMd.getColumnCount();
           
           modelo.addColumn("codigo");
           modelo.addColumn("nombre");
           modelo.addColumn("telefono");
           while(rs.next()){
               Object[] filas =new Object[cantidadColumnas];
               for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i]=rs.getObject(i+1);
               }
              modelo.addRow(filas);  
           }  
        } catch (Exception e) {
                System.out.println("error");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement ps=null;
        try {
            conexcion cn=new conexcion();
            Connection con=cn.getConex();
            
            int fila=jproductor.getSelectedRow();
            String codigo=jproductor.getValueAt(fila, 0).toString();
            
            ps=(PreparedStatement) con.prepareStatement("DELETE FROM proveedor WHERE id=?");
            ps.setString(1,codigo);
            ps.execute();
            modelo.removeRow(fila);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoTex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jproductor;
    private javax.swing.JTextField nombreTex;
    // End of variables declaration//GEN-END:variables
}

