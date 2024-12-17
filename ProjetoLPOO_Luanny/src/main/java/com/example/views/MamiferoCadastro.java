/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.views;

import com.example.entities.Animal; 
import com.example.entities.Mamifero;  
import com.example.entities.Habitat;  
import com.example.dao.PersistenciaJPA; 
import java.util.ArrayList; 
import java.util.List;      
import javax.persistence.EntityManager; 
import javax.persistence.TypedQuery; 
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author luanny
 */
public class MamiferoCadastro extends javax.swing.JFrame {
    
    private Long idMamiferoEditando = null;

    /**
     * Creates new form MamiferoCadastro
     */
    private void carregarStatusConservacao() {
        String[] status = {"Extinto", "Ameaçado", "Vulnerável", "Pouco Preocupante"};
        jComboBox1Status.setModel(new DefaultComboBoxModel<>(status));
    }
    
    public MamiferoCadastro() {
        initComponents();
        carregarStatusConservacao();
    }
    
    public MamiferoCadastro(Mamifero mamifero) {
        initComponents();
        carregarMamifero(mamifero);
    }
    
    private void carregarMamifero(Mamifero mamifero) {
        this.idMamiferoEditando = mamifero.getId();
        textNome.setText(mamifero.getNome());
        TextCientifico.setText(mamifero.getNomeCientifico());
        textGestacao.setText(String.valueOf(mamifero.getPeriodoGestacao()));
        textDieta.setText(String.valueOf(mamifero.getDieta()));
        jComboBox1Status.setSelectedItem(mamifero.getStatus());
    }
    
    private void limparCampos() {
        textNome.setText("");
        TextCientifico.setText("");
        textGestacao.setText("");
        textDieta.setText("");
        jComboBox1Status.setSelectedIndex(0);
        jCheckBox1PossuiPelo.setSelected(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1Status = new javax.swing.JComboBox<>();
        textNome = new javax.swing.JTextField();
        TextCientifico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1PossuiPelo = new javax.swing.JCheckBox();
        btnSalvar = new java.awt.Button();
        textGestacao = new javax.swing.JTextField();
        textDieta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SWRomnc", 0, 16)); // NOI18N
        jLabel1.setText(" CADASTRO DE MAMÍFEROS");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText(" Status de Conservação ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText(" Nome Científico");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText(" Nome Popular");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TextCientifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCientificoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText(" Período de Gestação (dias)");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText(" Dieta");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1PossuiPelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox1PossuiPelo.setText("Possui Pelo");
        jCheckBox1PossuiPelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox1PossuiPelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1PossuiPeloActionPerformed(evt);
            }
        });

        btnSalvar.setLabel("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        textGestacao.setText("0");
        textGestacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGestacaoActionPerformed(evt);
            }
        });

        textDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCientifico)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jCheckBox1PossuiPelo)
                            .addComponent(textGestacao)
                            .addComponent(textDieta))))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGestacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1PossuiPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSalvar.getAccessibleContext().setAccessibleName("Salvar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCientificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCientificoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCientificoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            // Captura os dados dos campos
            String nome = textNome.getText();
            String nomeCientifico = TextCientifico.getText();
            String dieta = textDieta.getText();
            String status = jComboBox1Status.getSelectedItem().toString(); 
            int periodoGestacao = Integer.parseInt(textGestacao.getText());
            boolean possuiPelo = jCheckBox1PossuiPelo.isSelected();

            PersistenciaJPA persistencia = new PersistenciaJPA();
            EntityManager em = persistencia.getEntityManager();
            em.getTransaction().begin();

            Mamifero mamifero;

            // Verifica se é edição ou novo cadastro
            if (idMamiferoEditando == null) {
                mamifero = new Mamifero();
            } else {
                mamifero = em.find(Mamifero.class, idMamiferoEditando);
            }

            mamifero.setNome(nome);
            mamifero.setNomeCientifico(nomeCientifico);
            mamifero.setDieta(dieta);
            mamifero.setPeriodoGestacao(periodoGestacao);
            mamifero.setPossuiPelo(possuiPelo);
            mamifero.setStatus(status);

            // Persistência
            if (idMamiferoEditando == null) {
                em.persist(mamifero);
            } else {
                em.merge(mamifero);
            }

            em.getTransaction().commit();

            String mensagem = (idMamiferoEditando == null) ? "Mamífero cadastrado com sucesso!" : "Mamífero editado com sucesso!";
            javax.swing.JOptionPane.showMessageDialog(this, mensagem);

            limparCampos();
            this.dispose();

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar mamífero: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jCheckBox1PossuiPeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1PossuiPeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1PossuiPeloActionPerformed

    private void textGestacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGestacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textGestacaoActionPerformed

    private void textDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDietaActionPerformed

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
            java.util.logging.Logger.getLogger(MamiferoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MamiferoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MamiferoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MamiferoCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MamiferoCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCientifico;
    private java.awt.Button btnSalvar;
    private javax.swing.JCheckBox jCheckBox1PossuiPelo;
    private javax.swing.JComboBox<String> jComboBox1Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textDieta;
    private javax.swing.JTextField textGestacao;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}