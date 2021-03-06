/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ADM
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
//        jButton1.setBorderPainted(false);  
//jButton1.setContentAreaFilled(false);  
//jButton1.setFocusPainted(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFundo = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        pSuperior = new javax.swing.JPanel();
        pInferior = new javax.swing.JPanel();
        btAviamentos = new javax.swing.JButton();
        lbAviamentos = new javax.swing.JLabel();
        btFuncionario = new javax.swing.JButton();
        lbFuncionario = new javax.swing.JLabel();
        btFornecedor = new javax.swing.JButton();
        lbFornecedor = new javax.swing.JLabel();
        btFuncao = new javax.swing.JButton();
        lbFuncao = new javax.swing.JLabel();
        btColecoes = new javax.swing.JButton();
        lbColecoes = new javax.swing.JLabel();
        btTecidos = new javax.swing.JButton();
        txtTecidos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 670));
        getContentPane().setLayout(null);

        pFundo.setBackground(new java.awt.Color(255, 255, 255));
        pFundo.setLayout(null);

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/teste4.fw.png"))); // NOI18N
        pFundo.add(lbImagen);
        lbImagen.setBounds(0, 60, 380, 530);

        pSuperior.setBackground(new java.awt.Color(204, 153, 255));
        pSuperior.setLayout(null);
        pFundo.add(pSuperior);
        pSuperior.setBounds(0, 0, 1080, 70);

        pInferior.setBackground(new java.awt.Color(204, 153, 255));
        pInferior.setToolTipText("rgb(155, 89, 182)");
        pInferior.setLayout(null);
        pFundo.add(pInferior);
        pInferior.setBounds(0, 600, 1080, 70);

        btAviamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Botao.fw.png"))); // NOI18N
        btAviamentos.setBorderPainted(false);
        btAviamentos.setContentAreaFilled(false);
        btAviamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAviamentosMouseEntered(evt);
            }
        });
        btAviamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAviamentosActionPerformed(evt);
            }
        });
        pFundo.add(btAviamentos);
        btAviamentos.setBounds(910, 70, 150, 140);

        lbAviamentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAviamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAviamentos.setText("Aviamentos");
        pFundo.add(lbAviamentos);
        lbAviamentos.setBounds(920, 70, 130, 140);

        btFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Botao.fw.png"))); // NOI18N
        btFuncionario.setBorderPainted(false);
        btFuncionario.setContentAreaFilled(false);
        btFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFuncionarioMouseExited(evt);
            }
        });
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });
        pFundo.add(btFuncionario);
        btFuncionario.setBounds(740, 70, 130, 140);

        lbFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncionario.setText("Funcionario");
        pFundo.add(lbFuncionario);
        lbFuncionario.setBounds(740, 70, 130, 140);

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Botao.fw.png"))); // NOI18N
        btFornecedor.setBorderPainted(false);
        btFornecedor.setContentAreaFilled(false);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorActionPerformed(evt);
            }
        });
        pFundo.add(btFornecedor);
        btFornecedor.setBounds(740, 220, 130, 140);

        lbFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFornecedor.setText("Fornecedor");
        pFundo.add(lbFornecedor);
        lbFornecedor.setBounds(740, 220, 130, 140);

        btFuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Botao.fw.png"))); // NOI18N
        btFuncao.setBorderPainted(false);
        btFuncao.setContentAreaFilled(false);
        btFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncaoActionPerformed(evt);
            }
        });
        pFundo.add(btFuncao);
        btFuncao.setBounds(550, 70, 130, 140);

        lbFuncao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFuncao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncao.setText("Função");
        pFundo.add(lbFuncao);
        lbFuncao.setBounds(550, 70, 130, 140);

        btColecoes.setForeground(new java.awt.Color(255, 255, 255));
        btColecoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Botao.fw.png"))); // NOI18N
        btColecoes.setBorderPainted(false);
        btColecoes.setContentAreaFilled(false);
        btColecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btColecoesActionPerformed(evt);
            }
        });
        pFundo.add(btColecoes);
        btColecoes.setBounds(920, 220, 130, 140);

        lbColecoes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbColecoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbColecoes.setText("Coleções");
        pFundo.add(lbColecoes);
        lbColecoes.setBounds(920, 220, 130, 140);

        btTecidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Botao.fw.png"))); // NOI18N
        btTecidos.setBorderPainted(false);
        btTecidos.setContentAreaFilled(false);
        btTecidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTecidosActionPerformed(evt);
            }
        });
        pFundo.add(btTecidos);
        btTecidos.setBounds(550, 220, 130, 140);

        txtTecidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTecidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTecidos.setText("Tecidos");
        pFundo.add(txtTecidos);
        txtTecidos.setBounds(550, 220, 130, 140);

        getContentPane().add(pFundo);
        pFundo.setBounds(0, 0, 1080, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
       FuncionarioGui fu = new FuncionarioGui();
        
       fu.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFuncionarioMouseEntered
      //  btFuncionario.setIcon(new ImageIcon(getClass().getResource("Imagens/Botao2.fw.png"))); 
        
    }//GEN-LAST:event_btFuncionarioMouseEntered

    private void btFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFuncionarioMouseExited
     //   btFuncionario.setIcon(new ImageIcon(getClass().getResource("Imagens/Botao.fw.png")));
    }//GEN-LAST:event_btFuncionarioMouseExited

    private void btColecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btColecoesActionPerformed
      ColecaoGui cg = new ColecaoGui();
      cg.setVisible(true);
    }//GEN-LAST:event_btColecoesActionPerformed

    private void btTecidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTecidosActionPerformed
        TecidoGui tg = new TecidoGui();
      tg.setVisible(true);
    }//GEN-LAST:event_btTecidosActionPerformed

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
       FornecedorGui forg = new FornecedorGui();
       forg.setVisible(true);
       
    }//GEN-LAST:event_btFornecedorActionPerformed

    private void btFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncaoActionPerformed
       FuncaoGui fg = new FuncaoGui();
       fg.setVisible(true);
    }//GEN-LAST:event_btFuncaoActionPerformed

    private void btAviamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAviamentosActionPerformed
        AviamentoGui av = new AviamentoGui();

        av.setVisible(true);
    }//GEN-LAST:event_btAviamentosActionPerformed

    private void btAviamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAviamentosMouseEntered

    }//GEN-LAST:event_btAviamentosMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAviamentos;
    private javax.swing.JButton btColecoes;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncao;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btTecidos;
    private javax.swing.JLabel lbAviamentos;
    private javax.swing.JLabel lbColecoes;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbFuncao;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JPanel pFundo;
    private javax.swing.JPanel pInferior;
    private javax.swing.JPanel pSuperior;
    private javax.swing.JLabel txtTecidos;
    // End of variables declaration//GEN-END:variables
}