/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.awt.ComponentOrientation;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author BM
 */
public class Application extends javax.swing.JFrame implements WindowListener {

    private TriangleTopicDialog triangleTopic = null;

    final private ArrayList<Locale> locales = new ArrayList<>();

    final private String[][] topicTexts = new String[][]{
        {"Háromszögek tulajdonságai",
            "Háromszögek csoportosítása",
            "Háromszögek szerkeszthetőségének alapesetei",
            "Háromszögek nevei"
        },
        {"Properties of triangles",
            "Grouping of triangles",
            "Basics of editing triangles",
            "Names of triangles"
        },
        {"خصائص المثلثات",
            "تجميع المثلثات",
            "أساسيات المثلثات التحرير",
            "أسماء المثلثات"
        }
    };

    String[][][] topicText = new String[3][4][21];

    private int imageInd;
    private int langCode;
    private int topicInd;
    final private int noOfTopic = 4;

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 204, 0));
        initLocales();
        initTopicText();
        setComponents();
        addWindowListener(this);
    }

    private void initLocales() {
        String[][] localeCodes = new String[][]{
            {"hu", "HU"},
            {"en", "GB"},
            {"ar", "YE"}};

        for (String[] localeCode : localeCodes) {
            locales.add(new Locale(localeCode[0], localeCode[1]));
        }
    }

    private void initTopicText() {

        String[] filenames = {
            "0/0_ar.txt",
            "0/0_en.txt",
            "0/0_hu.txt",
            "0/1_ar.txt",
            "0/1_en.txt",
            "0/1_hu.txt",
            "0/2_ar.txt",
            "0/2_en.txt",
            "0/2_hu.txt",
            "0/3_ar.txt",
            "0/3_en.txt",
            "0/3_hu.txt",
            "0/4_ar.txt",
            "0/4_en.txt",
            "0/4_hu.txt",
            "0/5_ar.txt",
            "0/5_en.txt",
            "0/5_hu.txt",
            "1/0_ar.txt",
            "1/0_en.txt",
            "1/0_hu.txt",
            "1/1_ar.txt",
            "1/1_en.txt",
            "1/1_hu.txt",
            "1/2_ar.txt",
            "1/2_en.txt",
            "1/2_hu.txt",
            "1/3_ar.txt",
            "1/3_en.txt",
            "1/3_hu.txt",
            "1/4_ar.txt",
            "1/4_en.txt",
            "1/4_hu.txt",
            "2/0_ar.txt",
            "2/0_en.txt",
            "2/0_hu.txt",
            "2/1_ar.txt",
            "2/1_en.txt",
            "2/1_hu.txt",
            "2/2_ar.txt",
            "2/2_en.txt",
            "2/2_hu.txt",
            "2/3_ar.txt",
            "2/3_en.txt",
            "2/3_hu.txt",
            "2/4_ar.txt",
            "2/4_en.txt",
            "2/4_hu.txt",
            "2/5_ar.txt",
            "2/5_en.txt",
            "2/5_hu.txt",
            "2/6_ar.txt",
            "2/6_en.txt",
            "2/6_hu.txt",
            "2/7_ar.txt",
            "2/7_en.txt",
            "2/7_hu.txt",
            "2/8_ar.txt",
            "2/8_en.txt",
            "2/8_hu.txt",
            "2/9_ar.txt",
            "2/9_en.txt",
            "2/9_hu.txt",
            "2/10_ar.txt",
            "2/10_en.txt",
            "2/10_hu.txt",
            "2/11_ar.txt",
            "2/11_en.txt",
            "2/11_hu.txt",
            "2/12_ar.txt",
            "2/12_en.txt",
            "2/12_hu.txt",
            "2/13_ar.txt",
            "2/13_en.txt",
            "2/13_hu.txt",
            "2/14_ar.txt",
            "2/14_en.txt",
            "2/14_hu.txt",
            "2/15_ar.txt",
            "2/15_en.txt",
            "2/15_hu.txt",
            "2/16_ar.txt",
            "2/16_en.txt",
            "2/16_hu.txt",
            "2/17_ar.txt",
            "2/17_en.txt",
            "2/17_hu.txt",
            "2/18_ar.txt",
            "2/18_en.txt",
            "2/18_hu.txt",
            "2/19_ar.txt",
            "2/19_en.txt",
            "2/19_hu.txt",
            "3/0_ar.txt",
            "3/0_en.txt",
            "3/0_hu.txt",
            "3/1_ar.txt",
            "3/1_en.txt",
            "3/1_hu.txt",
            "3/2_ar.txt",
            "3/2_en.txt",
            "3/2_hu.txt",
            "3/3_ar.txt",
            "3/3_en.txt",
            "3/3_hu.txt",
            "3/4_ar.txt",
            "3/4_en.txt",
            "3/4_hu.txt",
            "3/5_ar.txt",
            "3/5_en.txt",
            "3/5_hu.txt",
            "3/6_ar.txt",
            "3/6_en.txt",
            "3/6_hu.txt",
            "3/7_ar.txt",
            "3/7_en.txt",
            "3/7_hu.txt",
            "3/8_ar.txt",
            "3/8_en.txt",
            "3/8_hu.txt",
            "3/9_ar.txt",
            "3/9_en.txt",
            "3/9_hu.txt",
            "3/10_ar.txt",
            "3/10_en.txt",
            "3/10_hu.txt",
            "3/11_ar.txt",
            "3/11_en.txt",
            "3/11_hu.txt",
            "3/12_ar.txt",
            "3/12_en.txt",
            "3/12_hu.txt",
            "3/13_ar.txt",
            "3/13_en.txt",
            "3/13_hu.txt",
            "3/14_ar.txt",
            "3/14_en.txt",
            "3/14_hu.txt",
            "3/15_ar.txt",
            "3/15_en.txt",
            "3/15_hu.txt",
            "3/16_ar.txt",
            "3/16_en.txt",
            "3/16_hu.txt",};

        for (String filename : filenames) {            
            
            File file = new File(getClass().getResource("/triangle/texts/" + filename).getPath());            

            try {
                InputStream in = getClass().getResourceAsStream("/triangle/texts/" + filename); 
                BufferedReader reader = new BufferedReader(new InputStreamReader(in, Charset.forName("UTF-8")));

                int textNo = Integer.parseInt(file.getName().split("_")[0]);

                String line = "";
                String read = null;
                while ((read = reader.readLine()) != null) {                    
                    line += read + "\n";
                }
                
                String absolutePath = file.getAbsolutePath();
                String lang = absolutePath.substring(absolutePath.length() - 6, absolutePath.length() - 4);
                
                int top = Integer.parseInt(filename.substring(0,1));
                switch (lang) {
                    case "hu":
                        topicText[0][top][textNo] = line;
                        break;
                    case "en":
                        topicText[1][top][textNo] = line;
                        break;
                    case "ar":
                        topicText[2][top][textNo] = line;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private void setExplainText() {
        explainTextArea.setText(topicText[langCode][topicInd][imageInd]);
        if (triangleTopic != null) {
            topic.setText(topicTexts[langCode][topicInd]);
        }
        explainTextArea.setCaretPosition(0);
    }

    private void setImage() {
        if (triangleTopic != null) {
            imageViewer.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/triangle/pictures/" + topicInd + "/" + imageInd + ".jpg")).getImage().getScaledInstance(770, 414, Image.SCALE_DEFAULT)));
        }
    }

    private void setComponents() {
        setImage();
        setExplainText();
        setButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        localeCodeSelector = new javax.swing.JComboBox();
        previousButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        explainTextArea = new javax.swing.JTextPane();
        imageViewer = new javax.swing.JLabel();
        topic = new javax.swing.JLabel();
        selectTopic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("triangle/Bundle"); // NOI18N
        setTitle(bundle.getString("Application.title")); // NOI18N
        setBackground(new java.awt.Color(255, 204, 0));
        setName("mainFrame"); // NOI18N
        setResizable(false);

        nextButton.setText(bundle.getString("Application.nextButton.text")); // NOI18N
        nextButton.setName("nextButton"); // NOI18N
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        localeCodeSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Magyar", "English", "عربى" }));
        localeCodeSelector.setToolTipText(bundle.getString("Application.localeCodeSelector.toolTipText")); // NOI18N
        localeCodeSelector.setName("localeCodeSelector"); // NOI18N
        localeCodeSelector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                localeCodeSelectorItemStateChanged(evt);
            }
        });
        localeCodeSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localeCodeSelectorActionPerformed(evt);
            }
        });

        previousButton.setText(bundle.getString("Application.previousButton.text")); // NOI18N
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setName("explainScroll"); // NOI18N

        explainTextArea.setEditable(false);
        explainTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        explainTextArea.setText(bundle.getString("Application.explainTextArea.text")); // NOI18N
        jScrollPane2.setViewportView(explainTextArea);

        imageViewer.setBackground(new java.awt.Color(255, 255, 255));
        imageViewer.setForeground(new java.awt.Color(255, 255, 255));
        imageViewer.setText(bundle.getString("Application.imageViewer.text")); // NOI18N
        imageViewer.setToolTipText(bundle.getString("Application.imageViewer.toolTipText")); // NOI18N
        imageViewer.setFocusable(false);
        imageViewer.setOpaque(true);

        topic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topic.setText(bundle.getString("Application.topic.text")); // NOI18N

        selectTopic.setText(bundle.getString("Application.selectTopic.text")); // NOI18N
        selectTopic.setToolTipText(bundle.getString("Application.selectTopic.toolTipText")); // NOI18N
        selectTopic.setActionCommand(bundle.getString("Application.selectTopic.actionCommand")); // NOI18N
        selectTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTopicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageViewer, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(localeCodeSelector, 0, 127, Short.MAX_VALUE)
                            .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(selectTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localeCodeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imageViewer, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        imageInd++;
        setComponents();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void localeCodeSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localeCodeSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localeCodeSelectorActionPerformed

    private void localeCodeSelectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_localeCodeSelectorItemStateChanged
        final int lIndex = localeCodeSelector.getSelectedIndex();
        Locale l = locales.get(lIndex);
        langCode = lIndex;
        setExplainText();
        ResourceBundle rb = ResourceBundle.getBundle("triangle/Bundle", l);
        nextButton.setText(rb.getString("Application.nextButton.text"));
        previousButton.setText(rb.getString("Application.previousButton.text"));
        localeCodeSelector.setToolTipText(rb.getString("Application.localeCodeSelector.toolTipText"));
        selectTopic.setText(rb.getString("Application.selectTopic.text"));
        selectTopic.setToolTipText(rb.getString("Application.selectTopic.toolTipText"));
        this.setTitle(rb.getString("Application.title"));
        triangleTopic.setLanguage(rb);

        switch (lIndex) {
            case 0:
            case 1:
                explainTextArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                break;
            case 2:
                explainTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                break;
            default:
                explainTextArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
    }//GEN-LAST:event_localeCodeSelectorItemStateChanged

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        imageInd--;
        setComponents();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void selectTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTopicActionPerformed
        setTopic();
    }//GEN-LAST:event_selectTopicActionPerformed

    private void setButtons() {
        previousButton.setEnabled(imageInd > 0);
        nextButton.setEnabled(topicText[langCode][topicInd][imageInd + 1] != null);
    }

    private void setTopic() {
        triangleTopic.setVisible(true);
        imageInd = 0;
        topicInd = triangleTopic.getTopicIndex();
        setComponents();
    }

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane explainTextArea;
    private javax.swing.JLabel imageViewer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox localeCodeSelector;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton selectTopic;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent we) {
        triangleTopic = new TriangleTopicDialog(this, true);
        setTopic();
    }

    @Override
    public void windowClosing(WindowEvent we) {

    }

    @Override
    public void windowClosed(WindowEvent we) {

    }

    @Override
    public void windowIconified(WindowEvent we) {

    }

    @Override
    public void windowDeiconified(WindowEvent we) {

    }

    @Override
    public void windowActivated(WindowEvent we) {

    }

    @Override
    public void windowDeactivated(WindowEvent we) {

    }
}
