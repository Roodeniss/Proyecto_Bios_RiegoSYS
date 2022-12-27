/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Presentacion;

import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ClienteNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Cliente;
import uy.cursojava.proyecto.RiegoSYS.Logica.FachadaCliente;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import uy.cursojava.proyecto.RiegoSYS.Presentacion.Inicio;

/**
 *
 * @author Rodrigo
 */
public class VentanaBusquedaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBusquedaCliente
     */
    public VentanaBusquedaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private FachadaCliente fachada = new FachadaCliente();
    private String nombreCli = "";

    
    
    private void listar(String nombreCliente) {
        Cliente c = new Cliente();
        c.setNombre(nombreCliente);
        try {
            ArrayList<Cliente> listaCli = fachada.fachaClienteListar(c);
            DefaultTableModel tablaClienteModel = (DefaultTableModel) jTableCliente.getModel();
            jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tablaClienteModel.setRowCount(0);
            Cliente cliente = null;
            for (int i = 0; i < listaCli.size(); i++) {
                cliente = listaCli.get(i);
                String nombre = cliente.getNombre();
                String apellido = cliente.getApellido();
                Integer documento = cliente.getDocumento();
                String direcc = cliente.getDirecc();
                String email = cliente.getEmail();
                Integer cel = cliente.getNumCel();
                Object[] data = {nombre, apellido, documento, direcc, email, cel};
                tablaClienteModel.addRow(data);
            }
            JTextFieldNombreCliente.setText("");
        } catch (ClienteNoValidoException ex) {
            Logger.getLogger(VentanaBusquedaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        JTextFieldNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jEliminarCliente = new javax.swing.JButton();
        JActualizarCliente = new javax.swing.JButton();
        jEditarCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Documento", "Direccion", "Email", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jLabel1.setText("Nombre del Cliente");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel3.setText("Busqueda Cliente");

        jEliminarCliente.setText("Eliminar");
        jEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarClienteActionPerformed(evt);
            }
        });

        JActualizarCliente.setText("Actualizar");
        JActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActualizarClienteActionPerformed(evt);
            }
        });

        jEditarCliente.setText("Editar");
        jEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarClienteActionPerformed(evt);
            }
        });

        JMenu1.setText("Inicio");
        JMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(JMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEliminarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JActualizarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEditarCliente)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(255, 255, 255))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(buscar)
                            .addGap(107, 107, 107))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscar))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEliminarCliente)
                    .addComponent(JActualizarCliente)
                    .addComponent(jEditarCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        nombreCli = JTextFieldNombreCliente.getText();
        listar(JTextFieldNombreCliente.getText());
    }//GEN-LAST:event_buscarActionPerformed

    private void jEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarClienteActionPerformed
        Cliente c = new Cliente();
        Integer row = jTableCliente.getSelectedRow();
        int fila = jTableCliente.getSelectedColumnCount();
        Integer column = 2;
        Integer documento = (Integer) jTableCliente.getModel().getValueAt(row, column);
        c.setDocumento(documento);
        nombreCli = (String) jTableCliente.getModel().getValueAt(row, fila);
        try {
            fachada.fachaClienteEliminar(c);
            JOptionPane.showMessageDialog(this, "Se eliminó el cliente: " + (String) jTableCliente.getModel().getValueAt(row, 0) + " de numero de documento: " + c.getDocumento());
        } catch (ClienteNoValidoException ex) {
            Logger.getLogger(VentanaBusquedaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jEliminarClienteActionPerformed

    private void jEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarClienteActionPerformed
        Cliente c = new Cliente();
        Integer row = jTableCliente.getSelectedRow();
        Integer column = jTableCliente.getSelectedColumn();
        String NombreColumna = jTableCliente.getColumnName(column);
        String contenido = (String) jTableCliente.getModel().getValueAt(row, column);
        switch (NombreColumna) {
            case "Direccion"://row 3
                c.setDirecc(contenido);
                c.setEmail((String) jTableCliente.getModel().getValueAt(row, 4));
                c.setNumCel((Integer) jTableCliente.getModel().getValueAt(row, 5));
                break;
            case "Email"://row 4
                c.setEmail(contenido);
                c.setNumCel((Integer) jTableCliente.getModel().getValueAt(row, 5));
                c.setDirecc((String) jTableCliente.getModel().getValueAt(row, 3));
                break;
            case "Celular"://row 5
                c.setNumCel(Integer.valueOf(contenido));
                c.setDirecc((String) jTableCliente.getModel().getValueAt(row, 3));
                c.setEmail((String) jTableCliente.getModel().getValueAt(row, 4));
                break;
        }
        Integer columnDoc = 2; //columna donde se encuentra el documento del cliente a eliminar
        Integer documento = (Integer) jTableCliente.getModel().getValueAt(row, columnDoc);
        c.setDocumento(documento);
        fachada.fachaClienteModificar(c);
    }//GEN-LAST:event_jEditarClienteActionPerformed

    private void JActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActualizarClienteActionPerformed
        listar(nombreCli);
    }//GEN-LAST:event_JActualizarClienteActionPerformed

    private void JMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenu1MouseClicked
        Inicio in = new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMenu1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JActualizarCliente;
    private javax.swing.JMenu JMenu1;
    private javax.swing.JTextField JTextFieldNombreCliente;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jEditarCliente;
    private javax.swing.JButton jEliminarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    // End of variables declaration//GEN-END:variables
}