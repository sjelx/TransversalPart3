/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author matiSqui
 */
public class InternalAlumno extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;
    
    
    /**
     * Creates new form InternalAlumno
     */
    public InternalAlumno() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JCheckBox();
        btGuardar = new javax.swing.JButton();
        txDniAlumno = new javax.swing.JTextField();
        txApellidoAlum = new javax.swing.JTextField();
        txNombreAlum = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jcFechaNac = new com.toedter.calendar.JDateChooser();
        labelMensaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btNuevo = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registrar Alumnos");

        jLabel3.setText("DNI:");

        jLabel4.setText("APELLIDO:");

        jLabel5.setText("NOMBRE:");

        jLabel6.setText("DATE:");

        jLabel7.setText("ESTADO:");

        cbEstado.setText("Activo");
        cbEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbEstadoMouseEntered(evt);
            }
        });
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        labelMensaje.setForeground(new java.awt.Color(58, 186, 90));
        labelMensaje.setText("\"          \"");

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.setToolTipText("");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbEstado)
                                        .addGap(29, 29, 29)
                                        .addComponent(labelMensaje))
                                    .addComponent(jcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txDniAlumno)
                                    .addComponent(txApellidoAlum)
                                    .addComponent(txNombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(btBuscar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNuevo)
                        .addGap(55, 55, 55)
                        .addComponent(btEliminar)
                        .addGap(53, 53, 53)
                        .addComponent(btGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txDniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txApellidoAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txNombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addComponent(jcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbEstado)
                    .addComponent(labelMensaje))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo)
                    .addComponent(btSalir)
                    .addComponent(btEliminar)
                    .addComponent(btGuardar))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void cbEstadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEstadoMouseEntered

        labelMensaje.setText("Si alumno esta ''ACTIVO'' check = [x]");

    }//GEN-LAST:event_cbEstadoMouseEntered

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        
        try{
            Integer dni = Integer.parseInt(txDniAlumno.getText());
            
            alumnoActual = aluData.buscarAlumnoDni(dni);
            
            if (alumnoActual!= null) {
                
                txApellidoAlum.setText(alumnoActual.getApellido());
                txNombreAlum.setText(alumnoActual.getNombre());
                
                LocalDate lc = alumnoActual.getFechaNac();
                //Convierto un objeto LocalDate a un objeto de tipo Date, por medio de una instancia
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jcFechaNac.setDate(date);
                
                cbEstado.setSelected(alumnoActual.isActivo());
                
                }
            
            
        } catch (NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this,"DEBE INGRESAR UN NUMERO VALIDO");
            
        }
  
        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        
        labelMensaje.setText("");

    }//GEN-LAST:event_formMouseEntered

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed

    limpiarCampos();
    alumnoActual = null;
            
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

         try{
             
            Integer dniSel = Integer.parseInt(txDniAlumno.getText());
            String apellidoSel = txApellidoAlum.getText();
            String nombreSel = txNombreAlum.getText();
            
             if (apellidoSel.isEmpty() || nombreSel.isEmpty()) {
                 
                 JOptionPane.showConfirmDialog(this,"No puede haber campos vacios!!");
                 return;
             }
              
            java.util.Date fechaSel = jcFechaNac.getDate();
            //Paso de un date a un LocalDate
            LocalDate fechaNac = fechaSel.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            Boolean estadoSel = cbEstado.isSelected();
            
            //Si el alumno no esta registrado, se llama al metodo de aluData y se guarda
             if (alumnoActual == null) {
                 
                 alumnoActual = new Alumno(dniSel, apellidoSel, nombreSel, fechaNac, estadoSel);
                 
                 aluData.guardarAlumno(alumnoActual);
                 
                 //Si el alumno ya esta cargado, se recopila los campos y se llama al metodo modificar para guardar los cambios
             } else {
                 
                 alumnoActual.setDni(dniSel);
                 alumnoActual.setApellido(apellidoSel);
                 alumnoActual.setNombre(nombreSel);
                 alumnoActual.setFechaNac(fechaNac);   
                 //con esto puedo modificar el estado sin tener que eliminar 
                 alumnoActual.setActivo(estadoSel);
                 
                 aluData.modificarAlumno(alumnoActual);
                 
                 
             }
            
        } catch (NumberFormatException nfe){
            
            JOptionPane.showMessageDialog(this,"DEBE INGRESAR UN DNI VALIDO");
            
        }
   


    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        
        dispose();

    }//GEN-LAST:event_btSalirActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

        if (alumnoActual!= null) {
            
            //La eliminacion consiste en cambiar el estado 1 = activo / 0 = inactivo
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual = null;
            limpiarCampos();
            
        } else {
            
            JOptionPane.showConfirmDialog(this, "No hay alumno seleccionado");
            
        }
        

    }//GEN-LAST:event_btEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jcFechaNac;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JTextField txApellidoAlum;
    private javax.swing.JTextField txDniAlumno;
    private javax.swing.JTextField txNombreAlum;
    // End of variables declaration//GEN-END:variables


    private void limpiarCampos(){
        
        txDniAlumno.setText("");
        txApellidoAlum.setText("");
        txNombreAlum.setText("");
        cbEstado.setSelected(false);
        jcFechaNac.setDate(new Date());
        
    }


}
