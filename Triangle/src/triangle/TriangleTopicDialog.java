/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangle;

import java.util.ResourceBundle;

/**
 *
 * @author BM
 */
public class TriangleTopicDialog extends javax.swing.JDialog {

    /**
     * Creates new form TriangleTopicDialog
     */                    
    
    public TriangleTopicDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private int topic = 0;

    public int getTopicIndex() {
        return topic;
    }

    public void setLanguage(ResourceBundle rb){
        cim.setText(rb.getString("TriangleTopicDialog.cim.text"));
        propOfTriangle.setText(rb.getString("TriangleTopicDialog.propOfTriangle.text"));
        groupOfTriangle.setText(rb.getString("TriangleTopicDialog.groupOfTriangle.text"));
        editingOfTriangle.setText(rb.getString("TriangleTopicDialog.editingOfTriangle.text"));                
        nameOfTriangle.setText(rb.getString("TriangleTopicDialog.nameOfTriangle.text"));
        
        this.setTitle(rb.getString("TriangleTopicDialog.title"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editingOfTriangle = new javax.swing.JButton();
        groupOfTriangle = new javax.swing.JButton();
        propOfTriangle = new javax.swing.JButton();
        nameOfTriangle = new javax.swing.JButton();
        cim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("triangle/Bundle"); // NOI18N
        setTitle(bundle.getString("TriangleTopicDialog.title")); // NOI18N
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);

        editingOfTriangle.setText(bundle.getString("TriangleTopicDialog.editingOfTriangle.text")); // NOI18N
        editingOfTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editingOfTriangleActionPerformed(evt);
            }
        });

        groupOfTriangle.setText(bundle.getString("TriangleTopicDialog.groupOfTriangle.text")); // NOI18N
        groupOfTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupOfTriangleActionPerformed(evt);
            }
        });

        propOfTriangle.setText(bundle.getString("TriangleTopicDialog.propOfTriangle.text")); // NOI18N
        propOfTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propOfTriangleActionPerformed(evt);
            }
        });

        nameOfTriangle.setText(bundle.getString("TriangleTopicDialog.nameOfTriangle.text")); // NOI18N
        nameOfTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameOfTriangleActionPerformed(evt);
            }
        });

        cim.setBackground(new java.awt.Color(255, 255, 255));
        cim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cim.setText(bundle.getString("TriangleTopicDialog.cim.text")); // NOI18N
        cim.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editingOfTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(groupOfTriangle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(nameOfTriangle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(propOfTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(cim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cim, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propOfTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupOfTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editingOfTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameOfTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editingOfTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editingOfTriangleActionPerformed
        topic = 2;        
        setVisible(false);
    }//GEN-LAST:event_editingOfTriangleActionPerformed

    private void propOfTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propOfTriangleActionPerformed
        topic = 0;        
        setVisible(false);
    }//GEN-LAST:event_propOfTriangleActionPerformed

    private void groupOfTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupOfTriangleActionPerformed
        topic = 1;        
        setVisible(false);
    }//GEN-LAST:event_groupOfTriangleActionPerformed

    private void nameOfTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameOfTriangleActionPerformed
        topic = 3;        
        setVisible(false);
    }//GEN-LAST:event_nameOfTriangleActionPerformed

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
            java.util.logging.Logger.getLogger(TriangleTopicDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriangleTopicDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriangleTopicDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriangleTopicDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TriangleTopicDialog dialog = new TriangleTopicDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel cim;
    private javax.swing.JButton editingOfTriangle;
    private javax.swing.JButton groupOfTriangle;
    private javax.swing.JButton nameOfTriangle;
    private javax.swing.JButton propOfTriangle;
    // End of variables declaration//GEN-END:variables
}
