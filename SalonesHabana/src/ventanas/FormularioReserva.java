/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Canales-PC
 */
public class FormularioReserva extends javax.swing.JDialog {

    /**
     * Creates new form FormularioReserva
     */
    public FormularioReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lbNombre = new javax.swing.JLabel();
        lbTele = new javax.swing.JLabel();
        txNombre = new javax.swing.JTextField();
        txTele = new javax.swing.JTextField();
        Calendario = new com.toedter.calendar.JCalendar();
        lblFecha = new javax.swing.JLabel();
        cBTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        spPersonas = new javax.swing.JSpinner();
        lblPersonas = new javax.swing.JLabel();
        lblCocina = new javax.swing.JLabel();
        cBCocina = new javax.swing.JComboBox<>();
        PanelCongreso = new javax.swing.JPanel();
        lblJornadas = new javax.swing.JLabel();
        lblHabitaciones = new javax.swing.JLabel();
        txJornadas = new javax.swing.JTextField();
        checkHabitaciones = new javax.swing.JCheckBox();
        txHabitaciones = new javax.swing.JTextField();
        btnReservar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblReserva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombre.setText("Nombre:");
        lbNombre.setToolTipText("Añade un nombre para la reserva");

        lbTele.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTele.setText("Teléfono:");
        lbTele.setToolTipText("Añade un telefono para la reserva");

        txNombre.setToolTipText("Añade un nombre para la reserva");
        txNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNombreKeyTyped(evt);
            }
        });

        txTele.setToolTipText("Añade un telefono para la reserva");
        txTele.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txTeleKeyTyped(evt);
            }
        });

        Calendario.setToolTipText("Fecha requerida para la reserva");

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setText("Fecha de Reserva:");
        lblFecha.setToolTipText("Fecha requerida para la reserva");

        cBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso" }));
        cBTipo.setToolTipText("Selecciona un tipo de reserva");
        cBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBTipoActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipo.setText("Tipo:");
        lblTipo.setToolTipText("Selecciona un tipo de reserva");

        spPersonas.setToolTipText("Selecciona el numero de asistentes");

        lblPersonas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPersonas.setText("Nº Personas:");
        lblPersonas.setToolTipText("Selecciona el numero de asistentes");

        lblCocina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCocina.setText("Cocina:");
        lblCocina.setToolTipText("Selecciona el tipo de cocina para la reserva");

        cBCocina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bufé", "Carta", "Chef" }));
        cBCocina.setToolTipText("Selecciona el tipo de cocina para la reserva");

        PanelCongreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones Congreso"));
        PanelCongreso.setEnabled(false);

        lblJornadas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblJornadas.setText("Nº Jornadas:");
        lblJornadas.setToolTipText("Numero de jornadas en el caso de congreso");
        lblJornadas.setEnabled(false);

        lblHabitaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHabitaciones.setText("Habitaciones:");
        lblHabitaciones.setToolTipText("Numero de habitaciones que se requieren para la reserva");
        lblHabitaciones.setEnabled(false);

        txJornadas.setToolTipText("Numero de jornadas en el caso de congreso");
        txJornadas.setEnabled(false);

        checkHabitaciones.setText("¿Necesitan habitaciones?");
        checkHabitaciones.setToolTipText("Seleccion de si se requieren habitaciones");
        checkHabitaciones.setEnabled(false);
        checkHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHabitacionesActionPerformed(evt);
            }
        });

        txHabitaciones.setToolTipText("Numero de habitaciones que se requieren para la reserva");
        txHabitaciones.setEnabled(false);

        javax.swing.GroupLayout PanelCongresoLayout = new javax.swing.GroupLayout(PanelCongreso);
        PanelCongreso.setLayout(PanelCongresoLayout);
        PanelCongresoLayout.setHorizontalGroup(
            PanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCongresoLayout.createSequentialGroup()
                .addGroup(PanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCongresoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblHabitaciones)
                        .addGap(18, 18, 18)
                        .addComponent(txHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCongresoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkHabitaciones)
                            .addGroup(PanelCongresoLayout.createSequentialGroup()
                                .addComponent(lblJornadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PanelCongresoLayout.setVerticalGroup(
            PanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCongresoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJornadas)
                    .addComponent(txJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkHabitaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHabitaciones))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReservar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(0, 0, 255));
        btnReservar.setText("Reservar");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblReserva.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblReserva.setText("Reserva:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(PanelCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPersonas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbTele)
                                            .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txTele, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                            .addComponent(txNombre))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCocina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cBCocina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(cBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersonas)
                            .addComponent(spPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCocina)
                            .addComponent(cBCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnReservar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //Comprueba el item seleccionado y activa los componentes oportunos
    private void cBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBTipoActionPerformed
        int op = cBTipo.getSelectedIndex();
        if(op == 2){
            txJornadas.setEnabled(true);
            PanelCongreso.setEnabled(true);
            lblJornadas.setEnabled(true);
            checkHabitaciones.setEnabled(true);
        }else{
            txJornadas.setEnabled(false);
            PanelCongreso.setEnabled(false);
            lblJornadas.setEnabled(false);
            checkHabitaciones.setEnabled(false);
            lblHabitaciones.setEnabled(false);
            txHabitaciones.setEnabled(false);
            txHabitaciones.setText("");
            txJornadas.setText("");
        }
    }//GEN-LAST:event_cBTipoActionPerformed
    //Comprueba si esta el checkbox a true y activa los componentes oportunos
    private void checkHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHabitacionesActionPerformed
        if(checkHabitaciones.isSelected()){
            txHabitaciones.setEnabled(true);
            lblHabitaciones.setEnabled(true);
        }else{
            txHabitaciones.setEnabled(false);
            lblHabitaciones.setEnabled(false);
            txHabitaciones.setText("");
        }
    }//GEN-LAST:event_checkHabitacionesActionPerformed

    private void txTeleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTeleKeyTyped
        char n = evt.getKeyChar();
        int tam = txTele.getText().length();
        if(n<'0' || n>'9') evt.consume();
        if(tam ==9 ) evt.consume();
    }//GEN-LAST:event_txTeleKeyTyped

    private void txNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNombreKeyTyped
        int tam = txNombre.getText().length();
        if(tam == 15) evt.consume();
    }//GEN-LAST:event_txNombreKeyTyped

    
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
            java.util.logging.Logger.getLogger(FormularioReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioReserva dialog = new FormularioReserva(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar Calendario;
    private javax.swing.JPanel PanelCongreso;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cBCocina;
    private javax.swing.JComboBox<String> cBTipo;
    private javax.swing.JCheckBox checkHabitaciones;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTele;
    private javax.swing.JLabel lblCocina;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHabitaciones;
    private javax.swing.JLabel lblJornadas;
    private javax.swing.JLabel lblPersonas;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JSpinner spPersonas;
    private javax.swing.JTextField txHabitaciones;
    private javax.swing.JTextField txJornadas;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txTele;
    // End of variables declaration//GEN-END:variables
}
