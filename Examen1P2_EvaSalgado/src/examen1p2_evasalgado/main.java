/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1p2_evasalgado;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author evaja
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setLocation(400, 200);
        equipos.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JTabbedPane();
        menuañadir = new javax.swing.JPanel();
        añadirequipo = new javax.swing.JButton();
        añadirestadio = new javax.swing.JButton();
        añadirjugador = new javax.swing.JButton();
        equipos = new javax.swing.JPanel();
        country = new javax.swing.JTextField();
        nameequipo = new javax.swing.JTextField();
        añadire = new javax.swing.JButton();
        plantilla = new javax.swing.JSpinner();
        menulistar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuañadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        añadirequipo.setText("Añadir Equipo");
        añadirequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirequipoActionPerformed(evt);
            }
        });
        menuañadir.add(añadirequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 193, 85));

        añadirestadio.setText("Añadir Estadio");
        añadirestadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirestadioActionPerformed(evt);
            }
        });
        menuañadir.add(añadirestadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 193, 85));

        añadirjugador.setText("Añadir Jugador");
        añadirjugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirjugadorActionPerformed(evt);
            }
        });
        menuañadir.add(añadirjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 193, 85));

        country.setText("Ingrese el pais de origen");
        country.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countryMouseClicked(evt);
            }
        });
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        nameequipo.setText("Ingrese el nombre del equipo");
        nameequipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameequipoMouseClicked(evt);
            }
        });
        nameequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameequipoActionPerformed(evt);
            }
        });

        añadire.setText("añadir");
        añadire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadireActionPerformed(evt);
            }
        });

        plantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plantillaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout equiposLayout = new javax.swing.GroupLayout(equipos);
        equipos.setLayout(equiposLayout);
        equiposLayout.setHorizontalGroup(
            equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equiposLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añadire, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
            .addGroup(equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(equiposLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(nameequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(396, Short.MAX_VALUE)))
        );
        equiposLayout.setVerticalGroup(
            equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equiposLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(plantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(añadire, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(equiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(equiposLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(nameequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        menuañadir.add(equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        menu.addTab("Añadir", menuañadir);

        javax.swing.GroupLayout menulistarLayout = new javax.swing.GroupLayout(menulistar);
        menulistar.setLayout(menulistarLayout);
        menulistarLayout.setHorizontalGroup(
            menulistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        menulistarLayout.setVerticalGroup(
            menulistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        menu.addTab("Lista", menulistar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirjugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirjugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirjugadorActionPerformed

    private void añadirequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirequipoActionPerformed
        // TODO add your handling code here:
        
        equipos.setVisible(true);
        añadirequipo.setVisible(false);
        añadirestadio.setVisible(false);
        añadirjugador.setVisible(false);
    }//GEN-LAST:event_añadirequipoActionPerformed

    private void añadirestadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirestadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirestadioActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_countryActionPerformed

    private void nameequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameequipoActionPerformed
        // TODO add your handling code here:                                    
        
    }//GEN-LAST:event_nameequipoActionPerformed

    private void nameequipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameequipoMouseClicked
      if (nameequipo.getText().equals("Ingrese el nombre del equipo")) {
          nameequipo.setText("");
          nameequipo.setForeground(Color.GRAY);
        }
        if (country.getText().isEmpty()) {
            country.setText("Ingrese el pais de origen");
            country.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nameequipoMouseClicked

    private void countryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countryMouseClicked
         if (country.getText().equals("Ingrese el pais de origen")) {
            country.setText("");
            country.setForeground(Color.GRAY);
        }
        if (nameequipo.getText().isEmpty()) {
            nameequipo.setText("Ingrese el nombre del equipo");
            nameequipo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_countryMouseClicked

    private void añadireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadireActionPerformed
        // TODO add your handling code here:
        
        E.add(new equipo(nameequipo.getText(),country.getText()));
        JOptionPane.showMessageDialog(this,"Datos ingresados correctamente");
        equipos.setVisible(false);
        añadirequipo.setVisible(true);
        añadirestadio.setVisible(true);
        añadirjugador.setVisible(true);
    }//GEN-LAST:event_añadireActionPerformed

    private void plantillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantillaMouseClicked
        // TODO add your handling code here:
        if (plantilla.size()>) {
            
        }
    }//GEN-LAST:event_plantillaMouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    equipo Equipo
    ArrayList<equipo> E =new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadire;
    private javax.swing.JButton añadirequipo;
    private javax.swing.JButton añadirestadio;
    private javax.swing.JButton añadirjugador;
    private javax.swing.JTextField country;
    private javax.swing.JPanel equipos;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel menuañadir;
    private javax.swing.JPanel menulistar;
    private javax.swing.JTextField nameequipo;
    private javax.swing.JSpinner plantilla;
    // End of variables declaration//GEN-END:variables
}