/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ifstorage;

import javax.swing.JFrame;

/**
 *
 * @author khadu
 */
public class InFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form newFornecedor
     */
    public InFornecedor() {
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

        lblAdicionaFornecedorTitle = new javax.swing.JLabel();
        lblNomeDesc = new javax.swing.JLabel();
        lblCNOJDesc = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JToggleButton();
        btnAdicionar = new javax.swing.JToggleButton();
        tfCampoNome = new javax.swing.JTextField();
        tfCampoCNPJ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(1, 1, 2, 2));
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);

        lblAdicionaFornecedorTitle.setBackground(new java.awt.Color(23, 136, 44));
        lblAdicionaFornecedorTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAdicionaFornecedorTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAdicionaFornecedorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdicionaFornecedorTitle.setText("Fornecedor");
        lblAdicionaFornecedorTitle.setOpaque(true);
        lblAdicionaFornecedorTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblAdicionaFornecedorTitleMouseDragged(evt);
            }
        });
        lblAdicionaFornecedorTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAdicionaFornecedorTitleMousePressed(evt);
            }
        });

        lblNomeDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeDesc.setText("Nome:");

        lblCNOJDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCNOJDesc.setText("CNPJ:");

        btnCancelar.setBackground(new java.awt.Color(144, 2, 8));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(25, 81, 40));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.setBorder(null);

        tfCampoCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCampoCNPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(lblAdicionaFornecedorTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCNOJDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCampoNome)
                    .addComponent(tfCampoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAdicionaFornecedorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDesc)
                    .addComponent(tfCampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNOJDesc)
                    .addComponent(tfCampoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCampoCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCampoCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCampoCNPJActionPerformed
    
    //Funções para Movimenta janela
    
    int xy, xx;
    
    private void lblAdicionaFornecedorTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdicionaFornecedorTitleMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_lblAdicionaFornecedorTitleMousePressed

    private void lblAdicionaFornecedorTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdicionaFornecedorTitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_lblAdicionaFornecedorTitleMouseDragged

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarMousePressed

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
            java.util.logging.Logger.getLogger(InFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InFornecedor fornecedor = new InFornecedor();
                
                fornecedor.setVisible(true);
                fornecedor.setSize(457, 400);
                fornecedor.setLocationRelativeTo(null); // Centraliza o JFrame na tela
                fornecedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdicionar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JLabel lblAdicionaFornecedorTitle;
    private javax.swing.JLabel lblCNOJDesc;
    private javax.swing.JLabel lblNomeDesc;
    private javax.swing.JTextField tfCampoCNPJ;
    private javax.swing.JTextField tfCampoNome;
    // End of variables declaration//GEN-END:variables
}
