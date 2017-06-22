
package telas;

import bean.Situacao;
import bean.Personagem;
import escolhas.CaminhoEscolhas;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import tratamentos.TrataEmocao;

public class TelaComecar extends javax.swing.JFrame {

    int pontuacao = 0;
    Situacao situacao = new Situacao();
    DefaultListModel listaEAA = new DefaultListModel();
    DefaultListModel listaEA = new DefaultListModel();
    Personagem personagem = new Personagem();
    String vetor[] = new String[4];
    CaminhoEscolhas caminho = new CaminhoEscolhas();

    
    /**
     * Creates new form TelaComecar
     */
    public TelaComecar() {

    }

    public TelaComecar(Personagem personagemParametro) {

        personagem = personagemParametro;
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 150));
        //situacao.setHora("06");
        //situacao.setMinuto("30");
        lblSituacao.setText("<html>" + personagem.getNome() + ", estudante do ensino médio, possui 15 anos. "
                + "<br/>Diariamente, sua mãe o acorda às 06:30h para leva-lo à escola."
                + "<br/><br/>Por favor, escolha uma ação para " + personagem.getNome() + ".</html>");
        //lblHora.setText(situacao.getHora()+"  :");
        //lblMinuto.setText(situacao.getMinuto());
        //lblHoras.setVisible(false);

        //lblHora.setVisible(false);
        //lblMinuto.setVisible(false);

        btnAcao1.setText("<html>Acordar e ir para escola.</html>");
        btnAcao2.setText("<html>Dormir mais 5 minutos.</html>");
        //btnAcao4.setVisible(false);
        listaEAA.removeAllElements();
        listaEA.removeAllElements();
        int n = (int) (1 + Math.random() * (10));
        System.out.println(n);
        if (n <= 5) {
            listaEA.addElement("Alegria");
            pontuacao += retornaPontos("Alegria");
        } else {
            listaEA.addElement("Sofrimento");
            pontuacao += retornaPontos("Sofrimento");
        }
        //lblHoras.setText(Integer.toString(pontuacao));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSituacao = new javax.swing.JLabel();
        btnAcao1 = new javax.swing.JButton();
        btnAcao2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEA = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEAA = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menDescEmo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADWE");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSituacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacao.setText("Situação");
        getContentPane().add(lblSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 0, 279, 222));

        btnAcao1.setForeground(new java.awt.Color(51, 51, 0));
        btnAcao1.setText("Ação 1");
        btnAcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcao1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 130, 100));

        btnAcao2.setForeground(new java.awt.Color(51, 51, 0));
        btnAcao2.setText("Ação 2");
        btnAcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcao2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 130, 100));

        lstEA.setModel(listaEA);
        jScrollPane1.setViewportView(lstEA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 253, 121, 161));

        jLabel2.setFont(new java.awt.Font("Kalinga", 3, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Emoções após a ação");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 130, 23));

        jLabel4.setFont(new java.awt.Font("Kalinga", 3, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Emoções atuais");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 228, 121, 19));

        lstEAA.setModel(listaEAA);
        jScrollPane3.setViewportView(lstEAA);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 121, 170));

        jMenu1.setText("Descrição");

        menDescEmo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        menDescEmo.setText("Emoções");
        menDescEmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDescEmoActionPerformed(evt);
            }
        });
        jMenu1.add(menDescEmo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(605, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menDescEmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menDescEmoActionPerformed
        TelaDescricao descricao = new TelaDescricao();
        descricao.setVisible(true);
    }//GEN-LAST:event_menDescEmoActionPerformed

    private void btnAcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcao1ActionPerformed
        listaEAA.removeAllElements();
        listaEA.removeAllElements();
        situacao = caminho.configurar("1", personagem, pontuacao);
        if(situacao.getSituacao().equals("FIM")){
            this.dispose();
            JOptionPane.showMessageDialog(null, "Fim de jogo, sua pontuação: \n" + pontuacao);
            TelaIniciar telaIniciar = new TelaIniciar();
            telaIniciar.setVisible(true);
            
        }
        lblSituacao.setText(situacao.getSituacao());
        //lblHora.setText(situacao.getHora()+"  :");
        //lblMinuto.setText(situacao.getMinuto());
        btnAcao1.setText(situacao.getAcao1());
        btnAcao2.setText(situacao.getAcao2());
        for (String emocoesAA : situacao.getEmocoesAA()) {
            listaEAA.addElement(emocoesAA);
            pontuacao += retornaPontos(emocoesAA);
        }
        for (String emocoesA : situacao.getEmocoesA()) {
            listaEA.addElement(emocoesA);
            pontuacao += retornaPontos(emocoesA);
        }

        //lblHoras.setText(Integer.toString(pontuacao));
    }//GEN-LAST:event_btnAcao1ActionPerformed

    private void btnAcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcao2ActionPerformed
        listaEAA.removeAllElements();
        listaEA.removeAllElements();
        situacao = caminho.configurar("2", personagem, pontuacao);
        if(situacao.getSituacao().equals("FIM")){
            this.dispose();
            JOptionPane.showMessageDialog(null, "Fim de jogo, sua pontuação: \n" + pontuacao);
            TelaIniciar telaIniciar = new TelaIniciar();
            telaIniciar.setVisible(true);
        }
        lblSituacao.setText(situacao.getSituacao());
        //lblHora.setText(situacao.getHora()+"  :");
        //lblMinuto.setText(situacao.getMinuto());
        btnAcao1.setText(situacao.getAcao1());
        btnAcao2.setText(situacao.getAcao2());
        for (String emocoesAA : situacao.getEmocoesAA()) {
            listaEAA.addElement(emocoesAA);
            pontuacao += retornaPontos(emocoesAA);
        }
        for (String emocoesA : situacao.getEmocoesA()) {
            listaEA.addElement(emocoesA);
            pontuacao += retornaPontos(emocoesA);
        }
        //lblHoras.setText(Integer.toString(pontuacao));
    }//GEN-LAST:event_btnAcao2ActionPerformed

    private int retornaPontos(String emocao) {
        emocao = TrataEmocao.trataEmocao(emocao);

        //RETORNA DOIS PONTOS POIS É UM COMPOSTA POR DUAS EMOÇÕES
        if (emocao.equals("gratificacao")
                || emocao.equals("gratidao")) {
            return 2;
        } else if (emocao.equals("remorso")
                || emocao.equals("raiva")) {
            return -2;

        } else if (emocao.equals("feliz por outro")
                || emocao.equals("regozijo")
                || emocao.equals("alegria")
                || emocao.equals("orgulho")
                || emocao.equals("admiracao")
                || emocao.equals("amor")
                || emocao.equals("esperanca")
                || emocao.equals("jubilo")
                || emocao.equals("alivio")) {
            return 1;
        }

        return -1;
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
            java.util.logging.Logger.getLogger(TelaComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComecar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComecar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao1;
    private javax.swing.JButton btnAcao2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JList<String> lstEA;
    private javax.swing.JList<String> lstEAA;
    private javax.swing.JMenuItem menDescEmo;
    // End of variables declaration//GEN-END:variables
}