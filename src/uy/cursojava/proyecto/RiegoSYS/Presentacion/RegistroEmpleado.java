/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ContraroNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.EmpleadoNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Presentacion.Inicio;
import uy.cursojava.proyecto.RiegoSYS.Logica.Contrato;
import uy.cursojava.proyecto.RiegoSYS.Logica.Empleado;
import uy.cursojava.proyecto.RiegoSYS.Logica.FachadaContrato;
import uy.cursojava.proyecto.RiegoSYS.Logica.FachadaEmpleado;
//import uy.cursojava.proyecto.RiegoSYS.Sistema.Sistema;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class RegistroEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form empleadoDatos
     */
    public RegistroEmpleado() {
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

        empleadoNombre = new javax.swing.JLabel();
        empleadoApellido = new javax.swing.JLabel();
        empleadoCI = new javax.swing.JLabel();
        empleadoCelular = new javax.swing.JLabel();
        empleadoDireccion = new javax.swing.JLabel();
        empleadoBanco = new javax.swing.JLabel();
        empleadoCuentabanco = new javax.swing.JLabel();
        empleadoNombreTxt = new javax.swing.JTextField();
        empleadoApellidoTxt = new javax.swing.JTextField();
        empleadoCITxt = new javax.swing.JTextField();
        empleadoCelularTxt = new javax.swing.JTextField();
        empleadoDireccionTxt = new javax.swing.JTextField();
        empleadoBancoTxt = new javax.swing.JTextField();
        empleadoCuentabancoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCrearEmpleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empleadoEmail = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();
        jLabelError1 = new javax.swing.JLabel();
        jComboBoxTipoContrato = new javax.swing.JComboBox<>();
        jComboBoxTipoSalario = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        empleadoNombre.setText("Nombres:");

        empleadoApellido.setText("Apellidos:");

        empleadoCI.setText("C.I:");

        empleadoCelular.setText("Número celular:");

        empleadoDireccion.setText("Dirección:");

        empleadoBanco.setText("Banco:");

        empleadoCuentabanco.setText("Cuenta de banco:");

        jLabel1.setText("Registro de Empleado");

        jCrearEmpleado.setText("Crear");
        jCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCrearEmpleadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de contrato:");

        jLabel3.setText("Tipo de salario:");

        jLabel4.setText("Email");

        jComboBoxTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Jornalero" }));

        jComboBoxTipoSalario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Quicenal" }));

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelError)
                            .addComponent(jLabelError1))
                        .addGap(246, 246, 246))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jComboBoxTipoSalario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(empleadoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(empleadoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(empleadoCI)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(empleadoNombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                            .addComponent(empleadoCITxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(empleadoApellidoTxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(empleadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadoCelular)
                                    .addComponent(empleadoDireccion)
                                    .addComponent(empleadoBanco)
                                    .addComponent(empleadoCuentabanco)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(empleadoCelularTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadoDireccionTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadoBancoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadoCuentabancoTxt)
                                    .addComponent(jComboBoxTipoContrato, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadoNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoApellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoCITxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadoCI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoCelular)
                    .addComponent(empleadoCelularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoDireccion)
                    .addComponent(empleadoDireccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoBanco)
                    .addComponent(empleadoBancoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoCuentabanco)
                    .addComponent(empleadoCuentabancoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxTipoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError1)
                .addGap(12, 12, 12)
                .addComponent(jCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private FachadaEmpleado fachada = new FachadaEmpleado();
    private FachadaContrato fachadaCon = new FachadaContrato();

    private void jCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCrearEmpleadoActionPerformed
        Empleado e = new Empleado();
        e.setApellido(empleadoApellidoTxt.getText());
        e.setBanco(empleadoCuentabancoTxt.getText());
        //e.setContrato(tipoContrato(empleadoTipoCon.getText(), empleadoTipoSalario.getText()));
        e.setCueBanPago(Integer.valueOf(empleadoCuentabancoTxt.getText()));
        e.setDirecc(empleadoDireccionTxt.getText());
        try {
            e.setDocumento(Integer.valueOf(empleadoCITxt.getText()));
            e.setNumCel(Integer.valueOf(empleadoCelularTxt.getText()));
        } catch (NumberFormatException c) {
            jLabelError.setText("Ingrese bien el su Documento o su Numero de Celular"); //cambiar por jOptionPane
        }
        e.setEmail(empleadoEmail.getText());
        e.setNombre(empleadoNombreTxt.getText());
        Contrato contrato = new Contrato();
        contrato.setTipoSalario((String) jComboBoxTipoSalario.getSelectedItem());
        contrato.setTipoContrato((String) jComboBoxTipoContrato.getSelectedItem());
        contrato.setEmpleado(e);
        //  contrato.setNumeroContrato(fachada.numeroContrato(e)+1);
        e.setContrato(contrato);
        try {
            //            if (this.fachada.FachaEmpleadoExiste(e) != null) {
            //                JOptionPane.showMessageDialog(this, "El empleado: " + e.getNombre() + " ya existe");
            //            } else {
            this.fachadaCon.fachaContratoAgregar(contrato);
            this.fachada.fachaEmpleadoAgregar(e);
            JOptionPane.showMessageDialog(this, "Se creó el empleado: " + e.getNombre());
            limpiarCampos();
//            }
        } catch (EmpleadoNoValidoException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ContraroNoValidoException ex) {
            Logger.getLogger(RegistroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jCrearEmpleadoActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Inicio in = new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void limpiarCampos() {
        empleadoApellidoTxt.setText(null);
        empleadoBancoTxt.setText(null);
        empleadoCITxt.setText(null);
        empleadoNombreTxt.setText(null);
        empleadoEmail.setText(null);
        empleadoCITxt.setText(null);
        empleadoCelularTxt.setText(null);
        empleadoCuentabancoTxt.setText(null);
        empleadoDireccionTxt.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empleadoApellido;
    private javax.swing.JTextField empleadoApellidoTxt;
    private javax.swing.JLabel empleadoBanco;
    private javax.swing.JTextField empleadoBancoTxt;
    private javax.swing.JLabel empleadoCI;
    private javax.swing.JTextField empleadoCITxt;
    private javax.swing.JLabel empleadoCelular;
    private javax.swing.JTextField empleadoCelularTxt;
    private javax.swing.JLabel empleadoCuentabanco;
    private javax.swing.JTextField empleadoCuentabancoTxt;
    private javax.swing.JLabel empleadoDireccion;
    private javax.swing.JTextField empleadoDireccionTxt;
    private javax.swing.JTextField empleadoEmail;
    private javax.swing.JLabel empleadoNombre;
    private javax.swing.JTextField empleadoNombreTxt;
    private javax.swing.JComboBox<String> jComboBoxTipoContrato;
    private javax.swing.JComboBox<String> jComboBoxTipoSalario;
    private javax.swing.JButton jCrearEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelError1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
