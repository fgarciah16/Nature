
package vistas;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import static javax.swing.JOptionPane.CLOSED_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
//import modelos.conexion;


public class PedidosForm extends javax.swing.JInternalFrame {
//    materias materia = new materias();
//   materiasDAO dao =new materiasDAO();
//    DefaultTableModel modelo = new DefaultTableModel();
//    int id;
//    
//    Connection con;
//    conexion acceso = new conexion();
//    PreparedStatement ps;

    public PedidosForm() {
        initComponents();
        listar();
        mostrargrado();
        cmb_idgrado.setVisible(false);
    }
    void listar() {
//        List<materias> lista = dao.listar();
//        modelo = (DefaultTableModel) tabla.getModel();
//        Object[] ob = new Object[3];
//        for (int i = 0; i < lista.size(); i++) {
//            ob[0] = lista.get(i).getId_materia();
//            ob[1] = lista.get(i).getMateria();
//            ob[2] = lista.get(i).getGrado();
//            modelo.addRow(ob);
//        }
//        tabla.setModel(modelo);
    }
    
    void mostrargrado() {
//        String sql = " select * from grado";
//        try {
//            con = acceso.Conectar();
//            ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                cmbgrado.addItem(rs.getString("numero"));
//                cmb_idgrado.addItem(rs.getString("id_grado"));
//                
//            }
//        } catch (SQLException ex) {
//
//        }
    }
    void agregar() {
//        if (txtmateria.getText().equals("")||cmbgrado.getSelectedIndex()==0) {
//            showMessageDialog(this, "Se deben llenar todos los campos");
//        } else {
//            String materia = txtmateria.getText();
//            int id_grado=Integer.parseInt(cmb_idgrado.getSelectedItem().toString());
//
//            Object[] ob = new Object[2];
//            ob[0] = materia;
//            ob[1] = id_grado;
//             
//            dao.add(ob);
//            showMessageDialog(this, "Registro guardado");
//
//        }
    }
    
    void eliminar() {

//        int fila = tabla.getSelectedRow();
//        if (fila == -1) {
//            showMessageDialog(this, "Se debe seleccionar una fila");
//
//        } else {
//            int msj = showConfirmDialog(this, "  ¿Esta seguro que desea eliminar el registro?  ");
//            //JOptionPane.showMessageDialog(this, "Registro eliminado");
//            if (msj == YES_OPTION) {
//                dao.eliminar(id);
//                showMessageDialog(this, "Registro eliminado");
//            }
//            if (msj == NO_OPTION) {
//
//            }
//            if (msj == CLOSED_OPTION) {
//
//            }
//        }
    }
    
    void actualizar() {
//        int fila = tabla.getSelectedRow();
//        if (fila == -1) {
//            showMessageDialog(this, "Se debe seleccionar una fila");
//
//        } else {
//            String materia = txtmateria.getText();
//            String combogrado = cmb_idgrado.getSelectedItem().toString();
////            String idgrado = ComboGrado.getSelectedItem().toString();
////            String idpadre = ComboPadre.getSelectedItem().toString();
//
//            Object[] obj = new Object[3];
//            obj[0] = materia;
//            obj[1] = combogrado;
//            obj[2] = id;
//            dao.actualizar(obj);
//        }
    }
     void limpiarTabla() {
//        for (int i = 0; i < modelo.getRowCount(); i++) {
//            modelo.removeRow(i);
//            i = i - 1;
//        }

    }

    void limpiarcampos() {
//        txtmateria.setText("");
//        cmbgrado.setSelectedIndex(0);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmateria = new javax.swing.JTextField();
        cmbgrado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        cmb_idgrado = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);
        setTitle("CONTROL PEDIDOS");

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setText("MARCA");

        txtmateria.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N

        cmbgrado.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        cmbgrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        cmbgrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgradoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setText("CANTIDAD");

        btnguardar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.png"))); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        cmb_idgrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_grado" }));

        btnNuevo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnmodificar)
                .addGap(44, 44, 44)
                .addComponent(btneliminar)
                .addGap(45, 45, 45)
                .addComponent(btnNuevo)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cmb_idgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_idgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnNuevo))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATERIA", "GRADO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbgradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgradoActionPerformed
//        int indice_cmbgrado=cmbgrado.getSelectedIndex();
//        cmb_idgrado.setSelectedIndex(indice_cmbgrado);
    }//GEN-LAST:event_cmbgradoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        limpiarcampos();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
        limpiarcampos();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        //txtmateria.setEditable(false);
//        int fila = tabla.getSelectedRow();
//        if (fila == -1) {
//            showMessageDialog(this, "Se debe seleccionar una fila");
//        } else {
//            id = parseInt(tabla.getValueAt(fila, 0).toString());
//            String letra = tabla.getValueAt(fila, 1).toString();
//            cmbgrado.setSelectedItem(tabla.getValueAt(fila, 2));
//
//            txtmateria.setText(letra);
//
//        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        limpiarcampos();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       limpiarcampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> cmb_idgrado;
    private javax.swing.JComboBox<String> cmbgrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtmateria;
    // End of variables declaration//GEN-END:variables
}
