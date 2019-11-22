package vistas;

import com.jtattoo.plaf.fast.FastLookAndFeel;
import java.awt.Dimension;
import static java.awt.EventQueue.invokeLater;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
//import static java.awt.EventQueue.invokeLater;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
//import static javax.swing.UIManager.getInstalledLookAndFeels;
//import static javax.swing.UIManager.setLookAndFeel;

public class PrincipalDirectivo extends javax.swing.JFrame {

    public PrincipalDirectivo() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenu9 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VentanaPrincipal = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nature Baby");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE INVENTARIO ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 440, 20));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setForeground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Harlow Solid Italic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nature Baby");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 360, -1));

        jLabel5.setFont(new java.awt.Font("Harlow Solid Italic", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lo Mejor Para Tu Bebe");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 550, -1));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nature2.jpg.jpeg"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 450, -1));

        VentanaPrincipal.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));

        jMenu1.setBackground(new java.awt.Color(31, 37, 53));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/129manstudent1_100298.png"))); // NOI18N
        jMenu1.setText("Empleados");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jMenuItem1.setText("CONTROL DE EMPLEADO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(31, 37, 53));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Family_icon-icons.com_54182.png"))); // NOI18N
        jMenu2.setText("Proveedores");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/padres.png"))); // NOI18N
        jMenuItem2.setText("CONTROL DE PROVEEDOR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(31, 37, 53));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        jMenu3.setText("Pedidos");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reunion.png"))); // NOI18N
        jMenuItem3.setText("CONTROL DE PEDIDO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(31, 37, 53));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User_Group-80_icon-icons.com_57247.png"))); // NOI18N
        jMenu4.setText("Productos");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        jMenuItem4.setText("LISTA PRODUCTOS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(31, 37, 53));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/school_114359.png"))); // NOI18N
        jMenu5.setText("Envios");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero-dos-en-un-circulo.png"))); // NOI18N
        jMenuItem9.setText("CONTROL DE ENVIOS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu7.setBackground(new java.awt.Color(31, 37, 53));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GMail_icon-icons.com_76886.png"))); // NOI18N
        jMenu7.setText("Correo");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajuste_carga.png"))); // NOI18N
        jMenuItem6.setText("COMUNICADO");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(31, 37, 53));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Exit-Page_icon-icons.com_53732.png"))); // NOI18N
        jMenu8.setText("SALIR");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VentanaPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        UsuariosForm usuario = new UsuariosForm();
        centrarVista(usuario);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ProveedorForm Proovedor = new ProveedorForm();
        centrarVista(Proovedor);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PedidosForm Pedido = new PedidosForm();
        centrarVista(Pedido);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ProductosForm Usuario = new ProductosForm();
        centrarVista(Usuario);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        dispose();
        InicioSistema ini = new InicioSistema();
        ini.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ControlEnvio cpf = new ControlEnvio();
        centrarVista(cpf);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Correo lg = new Correo();
        lg.setVisible(true); 
        //        CorreoFrom correo = new CorreoFrom();
         //     centrarVista(lg);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

     private void cerrar(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea salir?, su sesión será cerrada.",
                "Cerrar Sesión", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    this.dispose();
                    InicioSistema closeCurrentWindow = new InicioSistema();
                    closeCurrentWindow.setVisible(true);//Open the new window
        }else{
          //cambios
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    public void centrarVista(JInternalFrame fr){
        try {
            reiniciarVista();
            VentanaPrincipal.add(fr);
            Dimension dim = VentanaPrincipal.getSize();
            Dimension dimForm = fr.getSize();
            fr.setLocation((dim.width-dimForm.width)/2, (dim.height-dimForm.height)/2);
            fr.setMaximum(true);
            
            fr.setClosable(true);
            fr.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PrincipalDirectivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reiniciarVista(){
        VentanaPrincipal.removeAll();
        VentanaPrincipal.updateUI();
    }
    
    public static void main(String args[]) {
        // Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html */
//         
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            getLogger(PrincipalDirectivo.class.getName()).log(SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        invokeLater(() -> {
        try{
            
            Properties props = new Properties();
            //props.put("logoString", "GRAN VALLE");
            FastLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalDirectivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalDirectivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PrincipalDirectivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PrincipalDirectivo.class.getName()).log(Level.SEVERE, null, ex);
            invokeLater(() -> {
                new InicioSistema().setVisible(true);
            });
        }
        new PrincipalDirectivo().setVisible(true);
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
