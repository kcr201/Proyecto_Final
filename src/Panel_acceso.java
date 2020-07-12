
import static java.awt.Image.SCALE_DEFAULT;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class Panel_acceso extends javax.swing.JFrame {
    
    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    
    public Panel_acceso() {
        initComponents();
        try {
            arduino.arduinoTX("COM5", 9600);
        } catch (Exception ex) {
            Logger.getLogger(Panel_acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
        ImageIcon icon;
        icon = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
        
        int ancho = fondo.getWidth();
        int altura = fondo.getHeight();
        
        ImageIcon icono;
        icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, altura, SCALE_DEFAULT)); 
        fondo.setIcon(icono);
        this.repaint();;
        tecla_borrar.setIcon(setIcono("/Imagenes/tecla_borrar.png",tecla_borrar));
        tecla_borrar.setIcon(setIconoPresionado("/Imagenes/tecla_borrar.png",tecla_borrar,7,7));
        tecla_borrar.setPressedIcon(setIconoPresionado("/Imagenes/tecla_borrar.png",tecla_borrar,15,15));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tecla_borrar = new javax.swing.JButton();
        numero_2 = new javax.swing.JButton();
        numero_3 = new javax.swing.JButton();
        numero_5 = new javax.swing.JButton();
        numero_6 = new javax.swing.JButton();
        numero_4 = new javax.swing.JButton();
        numero_7 = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        numero_8 = new javax.swing.JButton();
        numero_1 = new javax.swing.JButton();
        numero_9 = new javax.swing.JButton();
        numero_0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(null);

        tecla_borrar.setBackground(new java.awt.Color(255, 255, 255));
        tecla_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecla_borrarActionPerformed(evt);
            }
        });
        jPanel2.add(tecla_borrar);
        tecla_borrar.setBounds(30, 350, 70, 50);

        numero_2.setBackground(new java.awt.Color(255, 255, 255));
        numero_2.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_2.setText("2");
        numero_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_2ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_2);
        numero_2.setBounds(150, 140, 70, 50);

        numero_3.setBackground(new java.awt.Color(255, 255, 255));
        numero_3.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_3.setText("3");
        numero_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_3ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_3);
        numero_3.setBounds(260, 140, 70, 50);

        numero_5.setBackground(new java.awt.Color(255, 255, 255));
        numero_5.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_5.setText("5");
        numero_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_5ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_5);
        numero_5.setBounds(150, 210, 70, 50);

        numero_6.setBackground(new java.awt.Color(255, 255, 255));
        numero_6.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_6.setText("6");
        numero_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_6ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_6);
        numero_6.setBounds(260, 210, 70, 50);

        numero_4.setBackground(new java.awt.Color(255, 255, 255));
        numero_4.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_4.setText("4");
        numero_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_4ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_4);
        numero_4.setBounds(30, 210, 70, 50);

        numero_7.setBackground(new java.awt.Color(255, 255, 255));
        numero_7.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_7.setText("7");
        numero_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_7ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_7);
        numero_7.setBounds(30, 280, 70, 50);

        enter.setBackground(new java.awt.Color(255, 255, 255));
        enter.setFont(new java.awt.Font("Songti TC", 1, 12)); // NOI18N
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel2.add(enter);
        enter.setBounds(260, 350, 70, 50);

        numero_8.setBackground(new java.awt.Color(255, 255, 255));
        numero_8.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_8.setText("8");
        numero_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_8ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_8);
        numero_8.setBounds(150, 280, 70, 50);

        numero_1.setBackground(new java.awt.Color(255, 255, 255));
        numero_1.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_1.setText("1");
        numero_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_1ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_1);
        numero_1.setBounds(30, 140, 70, 50);

        numero_9.setBackground(new java.awt.Color(255, 255, 255));
        numero_9.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_9.setText("9");
        numero_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_9ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_9);
        numero_9.setBounds(260, 280, 70, 50);

        numero_0.setBackground(new java.awt.Color(255, 255, 255));
        numero_0.setFont(new java.awt.Font("Songti TC", 1, 24)); // NOI18N
        numero_0.setText("0");
        numero_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_0ActionPerformed(evt);
            }
        });
        jPanel2.add(numero_0);
        numero_0.setBounds(150, 350, 70, 50);

        jLabel1.setFont(new java.awt.Font("Songti TC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESA EL CODIGO");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 20, 190, 30);

        contrasena.setFont(new java.awt.Font("Songti TC", 1, 36)); // NOI18N
        contrasena.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        contrasena.setOpaque(true);
        jPanel2.add(contrasena);
        contrasena.setBounds(100, 60, 170, 50);

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setOpaque(true);
        jPanel2.add(fondo);
        fondo.setBounds(0, 0, 370, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_9ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"9");
    }//GEN-LAST:event_numero_9ActionPerformed

    private void numero_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_7ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"7");
    }//GEN-LAST:event_numero_7ActionPerformed

    private void numero_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_1ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"1");
    }//GEN-LAST:event_numero_1ActionPerformed

    private void numero_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_2ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"2");
    }//GEN-LAST:event_numero_2ActionPerformed

    private void numero_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_3ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"3");
    }//GEN-LAST:event_numero_3ActionPerformed

    private void numero_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_4ActionPerformed
       this.contrasena.setText(this.contrasena.getText()+"4");
    }//GEN-LAST:event_numero_4ActionPerformed

    private void numero_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_5ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"5");
    }//GEN-LAST:event_numero_5ActionPerformed

    private void numero_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_6ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"6");
    }//GEN-LAST:event_numero_6ActionPerformed

    private void numero_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_8ActionPerformed
        this.contrasena.setText(this.contrasena.getText()+"8");
    }//GEN-LAST:event_numero_8ActionPerformed

    private void numero_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_0ActionPerformed
       this.contrasena.setText(this.contrasena.getText()+"0");
    }//GEN-LAST:event_numero_0ActionPerformed

    private void tecla_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecla_borrarActionPerformed
        this.contrasena.setText("");
    }//GEN-LAST:event_tecla_borrarActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        
        String cadena = String.valueOf(contrasena.getPassword());
        String cadena_2="1234";
        int contador=0;
        
        
        if("".equals(cadena)){
            JOptionPane.showMessageDialog(null,"ESCRIBE UN CODIGO");}
        else{
        if(cadena.equals(cadena_2))
        {
            try {
                arduino.sendData("1");
            } catch (Exception ex) {
                Logger.getLogger(Panel_acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"CODIGO CORRECTO");
            try {
                arduino.sendData("0");
            } catch (Exception ex) {
                Logger.getLogger(Panel_acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.contrasena.setText("");
        }
        
        if(!cadena.equals(cadena_2))
        {
            do
        {        
            
        {try {
                arduino.sendData("2");
            } catch (Exception ex) {
                Logger.getLogger(Panel_acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            JOptionPane.showMessageDialog(null,"CODIGO INCORRECTO");
            try {
                arduino.sendData("0");
            } catch (Exception ex) {
                Logger.getLogger(Panel_acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.contrasena.setText("");
        contador++;
        }
        
        
        }
        
        while(contador<3);
        }
        }
        
        if (contador==3)
        {
            try {
                arduino.sendData("3");
            } catch (Exception ex) {
                Logger.getLogger(Panel_acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"ALARMA ACTIVADA, INGRESE LA CONTRASEÑA CORRECTA");
            
        }
         
        
        
        
        
        
                
                    
                
        
        
        
        
        
         
        
        
  


        
    }//GEN-LAST:event_enterActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_acceso().setVisible(true);
            }
        });
    }
    public Icon setIcono(String url, JButton btn)
    {
        ImageIcon icon;
        icon = new ImageIcon(getClass().getResource(url));
        
        int ancho = btn.getWidth();
        int altura = btn.getHeight();
        
        ImageIcon icono;
        icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, altura, SCALE_DEFAULT));
        
        return icono;
    }
    public Icon setIconoPresionado(String url, JButton btn,int ancho,int altura)
    {
        ImageIcon icon;
        icon = new ImageIcon(getClass().getResource(url));
        
        int w = btn.getWidth()-ancho;
        int h = btn.getHeight()-altura;
        
        ImageIcon icono;
        icono = new ImageIcon(icon.getImage().getScaledInstance(w, h, SCALE_DEFAULT));
        
        return icono;
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField contrasena;
    public javax.swing.JButton enter;
    public javax.swing.JLabel fondo;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton numero_0;
    public javax.swing.JButton numero_1;
    public javax.swing.JButton numero_2;
    public javax.swing.JButton numero_3;
    public javax.swing.JButton numero_4;
    public javax.swing.JButton numero_5;
    public javax.swing.JButton numero_6;
    public javax.swing.JButton numero_7;
    public javax.swing.JButton numero_8;
    public javax.swing.JButton numero_9;
    public javax.swing.JButton tecla_borrar;
    // End of variables declaration//GEN-END:variables
}
