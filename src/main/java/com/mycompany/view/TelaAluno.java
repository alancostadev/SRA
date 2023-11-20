/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.bean.Aluno;
import com.mycompany.model.dao.alunoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class TelaAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAlunoI
     */
    public TelaAluno() {
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

        jPanel2 = new javax.swing.JPanel();
        jTSenha = new javax.swing.JTextField();
        jCTurno = new javax.swing.JComboBox<>();
        jCTurma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTMatricula = new javax.swing.JTextField();
        jTMatricula1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTSenha2 = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 209, -1));

        jCTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde" }));
        jPanel2.add(jCTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 140, -1));

        jCTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º ano", "2º ano", "3º ano" }));
        jPanel2.add(jCTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 148, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Id");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 22, -1));

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jBSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Matricula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 30, 70, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Senha:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 57));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Turno:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Turma:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jTMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMatriculaActionPerformed(evt);
            }
        });
        jPanel2.add(jTMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 115, -1));

        jTMatricula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMatricula1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTMatricula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 223, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 425, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Data de nascimento");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));
        jPanel2.add(jTSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 209, -1));
        jPanel2.add(jTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CADASTRO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 205, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Icons/10925582-laboratorio-de-informatica-habilidades-avancadas-de-informatica-aprendizado-de-tecnologia-da-informacao-laboratorio-sob-demanda-da-universidade-equipamento-de-sala-de-aula-de-tecnologia-da-faculdade-design-pl.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 1270, 590));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 890, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        Aluno naluno = new Aluno();
        alunoDAO dao = new alunoDAO();
        //naluno.setId(Long.valueOf(jLid.getText()));
        naluno.setMatricula(jTMatricula.getText());
        naluno.setNome(jTNome.getText());
        naluno.setSenha(jTSenha.getText());
        naluno.setTurma(jCTurma.getSelectedItem().toString());
        naluno.setTurno(jCTurno.getSelectedItem().toString());

        try{
            dao.salva(naluno);
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMatriculaActionPerformed

    private void jTMatricula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMatricula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMatricula1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCTurma;
    private javax.swing.JComboBox<String> jCTurno;
    private org.netbeans.modules.form.InvalidComponent jDateC;
    private org.netbeans.modules.form.InvalidComponent jDateC1;
    private org.netbeans.modules.form.InvalidComponent jDateC2;
    private org.netbeans.modules.form.InvalidComponent jDateC3;
    private org.netbeans.modules.form.InvalidComponent jDateC4;
    private org.netbeans.modules.form.InvalidComponent jDateC5;
    private org.netbeans.modules.form.InvalidComponent jDateC6;
    private org.netbeans.modules.form.InvalidComponent jDateC7;
    private org.netbeans.modules.form.InvalidComponent jDateC8;
    private org.netbeans.modules.form.InvalidComponent jDateC9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTMatricula;
    private javax.swing.JTextField jTMatricula1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTSenha;
    private javax.swing.JTextField jTSenha2;
    // End of variables declaration//GEN-END:variables
}
