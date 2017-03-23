/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import br.com.infox.dal.ModuloConexao;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LEE
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadCliente = new javax.swing.JMenuItem();
        menuCadOs = new javax.swing.JMenuItem();
        menuCadUsuarios = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuRelCli = new javax.swing.JMenuItem();
        menuRelServico = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjuSobre = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuOpSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Sistema para controle de OS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        lblData.setText("Data");

        menuCadastro.setText("Cadastro");

        menuCadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuCadCliente.setText("Cliente");
        menuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadCliente);

        menuCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menuCadOs.setText("OS");
        menuCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadOsActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadOs);

        menuCadUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuCadUsuarios.setText("Usuários");
        menuCadUsuarios.setEnabled(false);
        menuCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadUsuarios);

        jMenuBar1.add(menuCadastro);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setEnabled(false);

        menuRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menuRelCli.setText("Clientes");
        menuRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelCliActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuRelCli);

        menuRelServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuRelServico.setText("Serviços");
        menuRelatorio.add(menuRelServico);

        jMenuBar1.add(menuRelatorio);

        menuAjuda.setText("Ajuda");

        menuAjuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menuAjuSobre.setText("Sobre");
        menuAjuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuAjuSobre);

        jMenuBar1.add(menuAjuda);

        menuOpcoes.setText("Opções");

        menuOpSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuOpSair.setText("Sair");
        menuOpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuOpSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblData))
                .addGap(0, 132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblUsuario)
                        .addGap(46, 46, 46)
                        .addComponent(lblData)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuOpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpSairActionPerformed
        // exibir uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuOpSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // substitue a variavel lblData pela data atual ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menuAjuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjuSobreActionPerformed
        //
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menuAjuSobreActionPerformed

    private void menuCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuariosActionPerformed
        //abri o form TelaUsuario dentro do desktop pane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        Desktop.add(usuario);
    }//GEN-LAST:event_menuCadUsuariosActionPerformed

    private void menuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadClienteActionPerformed
        // TODO add your handling code here:
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        Desktop.add(cliente);
    }//GEN-LAST:event_menuCadClienteActionPerformed

    private void menuCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadOsActionPerformed
        // Chamando a Tela OS
        TelaOs os = new TelaOs();
        os.setVisible(true);
        Desktop.add(os);
    }//GEN-LAST:event_menuCadOsActionPerformed

    private void menuRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelCliActionPerformed
        // Gerando um relatorio de clientes
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressao desse relatorio?", "Atenção", JOptionPane.YES_NO_OPTION);
        
        if(confirma == JOptionPane.YES_OPTION){
          //imprimindo um relatorio com o framework JasperReports
            try {
                //Usando a classe JasperPrint para preparar a impressao de um relatorio
                JasperPrint print = JasperFillManager.fillReport("C:/reports/clientes.jasper", null, conexao);
                //a classe JasperViewer exibe o relatorio
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } 
    }//GEN-LAST:event_menuRelCliActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menuAjuSobre;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuCadCliente;
    private javax.swing.JMenuItem menuCadOs;
    public static javax.swing.JMenuItem menuCadUsuarios;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuOpSair;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuRelCli;
    private javax.swing.JMenuItem menuRelServico;
    public static javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}
