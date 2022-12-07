/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Presentacion;

import javax.swing.JOptionPane;

import uy.cursojava.proyecto.RiegoSYS.Logica.Cliente;
import uy.cursojava.proyecto.RiegoSYS.Logica.Empleado;
import uy.cursojava.proyecto.RiegoSYS.Logica.Servicio;
//import uy.cursojava.proyecto.RiegoSYS.Sistema.Sistema;

/**
 *
 * @author rodrigo, rodrigo silveria, bruno rasetti
 */
public class VentanaServicio extends javax.swing.JFrame {

    /**
     * Creates new form ventanaServicio
     */
    public VentanaServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedulaEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idProd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDocumentoCli = new javax.swing.JTextField();
        jBotonAddServicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datePickerServicio = new com.github.lgooddatepicker.components.DatePicker();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cedulaEmpleado.setText(" ");
        cedulaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Empleado:");

        idProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bomba Electrica", "Bomba Hidraulica", "Bomba Comun", "Bomba Mecanica" }));

        jLabel2.setText("Producto:");

        jLabel3.setText("Cliente:");

        jLabel4.setText("Fecha realización:");

        jDocumentoCli.setText(" ");

        jBotonAddServicio.setText("Agregar");
        jBotonAddServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAddServicioActionPerformed(evt);
            }
        });

        jLabel5.setText("Registro De Servicio");

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDocumentoCli)
                                .addComponent(datePickerServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBotonAddServicio)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jDocumentoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datePickerServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jBotonAddServicio)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaEmpleadoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Inicio in = new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jBotonAddServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAddServicioActionPerformed
        Servicio s = new Servicio();
        s.setTipoServicio(obtenerTipoServicio());
        if (cedulaEmpleado.getText().equalsIgnoreCase("")) {
            s.setEmpleado(obtenerEmpleado(cedulaEmpleado.getText()));
        } else {
            JOptionPane.showMessageDialog(this,"Debe ingresar un documentoe valido para el empleado "," ",JOptionPane.WARNING_MESSAGE);
        }
        if (!jDocumentoCli.getText().equalsIgnoreCase("")) {
            s.setCliente(obtenerCliente(jDocumentoCli.getText()));
        } else {
            JOptionPane.showMessageDialog(this,"Debe ingresar un documentoe valido para el cliente","", JOptionPane.WARNING_MESSAGE);
        }
        s.setFecha(datePickerServicio.getText());
    }//GEN-LAST:event_jBotonAddServicioActionPerformed

    private String obtenerTipoServicio() {
        return idProd.getItemAt(idProd.getSelectedIndex());

    }

    private Cliente obtenerCliente(String s) {
        Cliente retorno = new Cliente();
        //if (/*!s.equalsIgnoreCase("") &&*/sis.getListaCliente().size() != 0) {
//            for (int i = 0; i < sis.getListaCliente().size(); i++) {
//                if (sis.getListaCliente().get(i).getDocumento() == Integer.parseInt(s)) {
//                    retorno = sis.getListaCliente().get(i);
//                }
           // }
      //  }
        return retorno;
    }

    private Empleado obtenerEmpleado(String s) {
        Empleado retorno = new Empleado();
        //if (!s.equalsIgnoreCase(s) && sis.getListaEmpleado().size() != 0) {
           // for (int i = 0; i < sis.getListaEmpleado().size(); i++) {
       //         if (sis.getListaEmpleado().get(i).getDocumento() == Integer.parseInt(s)) {
       //             retorno = sis.getListaEmpleado().get(i);
     //           }
     //       }
    //    }
        return retorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaEmpleado;
    private com.github.lgooddatepicker.components.DatePicker datePickerServicio;
    private javax.swing.JComboBox<String> idProd;
    private javax.swing.JButton jBotonAddServicio;
    private javax.swing.JTextField jDocumentoCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
