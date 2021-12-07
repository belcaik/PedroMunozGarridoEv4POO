/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;

/**
 *
 * @author belca
 */
public class contenedor extends javax.swing.JFrame {

		/**
		 * Creates new form contenedor
		 */
		public contenedor() {
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

        mainPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        alquilerMenu = new javax.swing.JMenuItem();
        oficinaMenu = new javax.swing.JMenuItem();
        perfileMenu = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenuItem();
        usuarioMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTOR");

        mainPane.setName("mainPane"); // NOI18N

        org.jdesktop.layout.GroupLayout mainPaneLayout = new org.jdesktop.layout.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 944, Short.MAX_VALUE)
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 575, Short.MAX_VALUE)
        );

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        mainMenu.setText("GESTION");
        mainMenu.setName("mainMenu"); // NOI18N

        alquilerMenu.setText("Alquiler");
        alquilerMenu.setName("alquilerMenu"); // NOI18N
        alquilerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilerMenuActionPerformed(evt);
            }
        });
        mainMenu.add(alquilerMenu);

        oficinaMenu.setText("Oficina");
        oficinaMenu.setName("oficinaMenu"); // NOI18N
        oficinaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oficinaMenuActionPerformed(evt);
            }
        });
        mainMenu.add(oficinaMenu);

        perfileMenu.setText("Perfil");
        perfileMenu.setName("perfileMenu"); // NOI18N
        perfileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfileMenuActionPerformed(evt);
            }
        });
        mainMenu.add(perfileMenu);

        productoMenu.setText("Producto");
        productoMenu.setName("productoMenu"); // NOI18N
        productoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoMenuActionPerformed(evt);
            }
        });
        mainMenu.add(productoMenu);

        usuarioMenu.setText("Usuario");
        usuarioMenu.setName("usuarioMenu"); // NOI18N
        usuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioMenuActionPerformed(evt);
            }
        });
        mainMenu.add(usuarioMenu);

        jMenuBar1.add(mainMenu);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oficinaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oficinaMenuActionPerformed
        // TODO add your handling code here:
				gestorOficina gestor;
				gestor = new gestorOficina();
				mainPane.add(gestor);
				gestor.setVisible(true);
				
				
				
    }//GEN-LAST:event_oficinaMenuActionPerformed

    private void alquilerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilerMenuActionPerformed
        // TODO add your handling code here:
				gestorAlquiler gestor;
				try {
						gestor= new gestorAlquiler();
						mainPane.add(gestor);
						gestor.setVisible(true);
				} catch (Exception e) {
				}
				
				
				
    }//GEN-LAST:event_alquilerMenuActionPerformed

    private void perfileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfileMenuActionPerformed
        gestorPerfile gestor;
				try {
						gestor=new gestorPerfile();
						mainPane.add(gestor);
						gestor.setVisible(true);
				} catch (Exception e) {
				}
    }//GEN-LAST:event_perfileMenuActionPerformed

    private void productoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoMenuActionPerformed
        gestorProducto gestor;
				try {
						gestor= new gestorProducto();
						mainPane.add(gestor);
						gestor.setVisible(true);
				} catch (Exception e) {
				}
    }//GEN-LAST:event_productoMenuActionPerformed

    private void usuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioMenuActionPerformed
        gestorUsuario gestor;
				try {
						gestor= new gestorUsuario();
						mainPane.add(gestor);
						gestor.setVisible(true);
				} catch (Exception e) {
				}
    }//GEN-LAST:event_usuarioMenuActionPerformed

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
						java.util.logging.Logger.getLogger(contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (InstantiationException ex) {
						java.util.logging.Logger.getLogger(contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (IllegalAccessException ex) {
						java.util.logging.Logger.getLogger(contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				} catch (javax.swing.UnsupportedLookAndFeelException ex) {
						java.util.logging.Logger.getLogger(contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}
				//</editor-fold>

				/* Create and display the form */
				java.awt.EventQueue.invokeLater(new Runnable() {
						public void run() {
								new contenedor().setVisible(true);
						}
				});
		}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alquilerMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JDesktopPane mainPane;
    private javax.swing.JMenuItem oficinaMenu;
    private javax.swing.JMenuItem perfileMenu;
    private javax.swing.JMenuItem productoMenu;
    private javax.swing.JMenuItem usuarioMenu;
    // End of variables declaration//GEN-END:variables
}
