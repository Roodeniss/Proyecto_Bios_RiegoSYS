/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Empleado;
import uy.cursojava.proyecto.RiegoSYS.Logica.FachadaEmpleado;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class VentanaBusquedaEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public VentanaBusquedaEmpleado() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        nombreEmpleado = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpleado = new javax.swing.JList<>();
        botonEliminarEmpleado = new javax.swing.JButton();
        botonAgregarHoras = new javax.swing.JButton();
        botonEditarEmpleado = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Buesqueda empleado");

        jLabel3.setText("Nombre del empleado");

        jScrollPane1.setViewportView(listaEmpleado);

        botonEliminarEmpleado.setText("Eliminar");
        botonEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEmpleadoActionPerformed(evt);
            }
        });

        botonAgregarHoras.setText("Agregar Horas");

        botonEditarEmpleado.setText("Editar");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEliminarEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAgregarHoras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEditarEmpleado))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscar)))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarEmpleado)
                    .addComponent(botonAgregarHoras)
                    .addComponent(botonEditarEmpleado))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private FachadaEmpleado fachada = new FachadaEmpleado();

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Inicio in = new Inicio();
        in.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Empleado e = new Empleado();
        e.setNombre(nombreEmpleado.getText());
        DefaultListModel display = mismoNombre(fachada.FachaEmpleadoListar(e));
        listaEmpleado.setModel(display);
        nombreEmpleado.setText(null);
    }//GEN-LAST:event_buscarActionPerformed

    private void botonEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEmpleadoActionPerformed
        Empleado e = new Empleado();
        ListModel<String> lista = listaEmpleado.getModel();
        int o = listaEmpleado.getSelectedIndex();
        String empleadoEliminar = lista.getElementAt(o).toString();
        //El string anterior tiene la siguente forma: nombre  apellido  cedula
         String[] textoEmpleado = empleadoEliminar.split(" ");
        //Separo el string de la lista en 3
         Integer cedulaEmpleadoEliminar = Integer.parseInt(textoEmpleado[0]);
          e.setDocumento(cedulaEmpleadoEliminar);
        fachada.FachaEmoleadoEliminar(e);
    }//GEN-LAST:event_botonEliminarEmpleadoActionPerformed

    private DefaultListModel mismoNombre(DefaultListModel dlm){
        DefaultListModel retorno = new DefaultListModel();
        for (int i = 0; i < dlm.size(); i++) {
            Empleado empleado =  (Empleado)dlm.get(i);
            if (empleado.getNombre().equalsIgnoreCase(nombreEmpleado.getText())) {
                retorno.addElement(dlm.get(i));
            } 
        }
        return retorno;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarHoras;
    private javax.swing.JButton botonEditarEmpleado;
    private javax.swing.JButton botonEliminarEmpleado;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaEmpleado;
    private javax.swing.JTextField nombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
