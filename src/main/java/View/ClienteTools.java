package View;

import Controller.ClienteController;

/**
 *
 * @author joaoc
 */
public class ClienteTools extends javax.swing.JFrame {

    // Chama a controler
    private ClienteController controller;
    
    /**
     * Creates new form Cliente
     */
    public ClienteTools() {
        initComponents();
        controller = new ClienteController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextClienteID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonBusca = new javax.swing.JButton();
        jButtonDeleta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextResultCliente = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextClienteIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente ID:");

        jButtonBusca.setBackground(new java.awt.Color(0, 102, 255));
        jButtonBusca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBusca.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBusca.setText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jButtonDeleta.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDeleta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDeleta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleta.setText("Apagar");
        jButtonDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletaActionPerformed(evt);
            }
        });

        jTextResultCliente.setColumns(20);
        jTextResultCliente.setRows(5);
        jScrollPane1.setViewportView(jTextResultCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleta)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBusca)
                    .addComponent(jButtonDeleta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextClienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextClienteIDActionPerformed

    private void jButtonDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletaActionPerformed
        try 
        {           
            String dadosCliente;
            
            dadosCliente = controller.buscaClienteFisico(Long.parseLong(jTextClienteID.getText()));
            
            jTextResultCliente.setText(dadosCliente);
        }
        catch(Exception e)
        {
            jTextResultCliente.setText("Erro ao excluir -> " + e);
        }
    }//GEN-LAST:event_jButtonDeletaActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        try 
        {           
            controller.removeClienteFisico(Long.parseLong(jTextClienteID.getText()));
            
            jTextResultCliente.setText("Cliente removido com sucesso");
        }
        catch(Exception e)
        {
            jTextResultCliente.setText("Erro ao buscar Cliente -> " + e);
        }
    }//GEN-LAST:event_jButtonBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteTools().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonDeleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextClienteID;
    private javax.swing.JTextArea jTextResultCliente;
    // End of variables declaration//GEN-END:variables
}
