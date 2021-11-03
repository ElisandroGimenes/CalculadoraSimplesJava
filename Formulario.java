
package calculadorasimplesjava;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }
    
    //Declaração das variáveis:
    Double valor1, valor2;
    String sinal;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        BotaoSete = new javax.swing.JButton();
        BotaoOito = new javax.swing.JButton();
        BotaoCe = new javax.swing.JButton();
        BotaoAdicao = new javax.swing.JButton();
        BotaoNove = new javax.swing.JButton();
        BotaoQuatro = new javax.swing.JButton();
        BotaoCinco = new javax.swing.JButton();
        BotaoSeis = new javax.swing.JButton();
        BotaoC = new javax.swing.JButton();
        BotaoSubtracao = new javax.swing.JButton();
        BotaoUm = new javax.swing.JButton();
        BotaoDois = new javax.swing.JButton();
        BotaoTres = new javax.swing.JButton();
        BotaoMultiplicacao = new javax.swing.JButton();
        botaoZero = new javax.swing.JButton();
        botaoPonto = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoSete.setText("7");
        BotaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSeteActionPerformed(evt);
            }
        });

        BotaoOito.setText("8");
        BotaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOitoActionPerformed(evt);
            }
        });

        BotaoCe.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        BotaoCe.setText("<");
        BotaoCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCeActionPerformed(evt);
            }
        });

        BotaoAdicao.setText("+");
        BotaoAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicaoActionPerformed(evt);
            }
        });

        BotaoNove.setText("9");
        BotaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNoveActionPerformed(evt);
            }
        });

        BotaoQuatro.setText("4");
        BotaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoQuatroActionPerformed(evt);
            }
        });

        BotaoCinco.setText("5");
        BotaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCincoActionPerformed(evt);
            }
        });

        BotaoSeis.setText("6");
        BotaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSeisActionPerformed(evt);
            }
        });

        BotaoC.setText("c");
        BotaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCActionPerformed(evt);
            }
        });

        BotaoSubtracao.setText("-");
        BotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtracaoActionPerformed(evt);
            }
        });

        BotaoUm.setText("1");
        BotaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUmActionPerformed(evt);
            }
        });

        BotaoDois.setText("2");
        BotaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDoisActionPerformed(evt);
            }
        });

        BotaoTres.setText("3");
        BotaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTresActionPerformed(evt);
            }
        });

        BotaoMultiplicacao.setText("*");
        BotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicacaoActionPerformed(evt);
            }
        });

        botaoZero.setText("0");
        botaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZeroActionPerformed(evt);
            }
        });

        botaoPonto.setText(".");
        botaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPontoActionPerformed(evt);
            }
        });

        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        BotaoDivisao.setText("/");
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoCe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtResultado))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZeroActionPerformed
        txtResultado.setText(txtResultado.getText()+"0");
    }//GEN-LAST:event_botaoZeroActionPerformed

    private void BotaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUmActionPerformed
        txtResultado.setText(txtResultado.getText()+"1");
    }//GEN-LAST:event_BotaoUmActionPerformed

    private void BotaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDoisActionPerformed
        txtResultado.setText(txtResultado.getText()+"2");
    }//GEN-LAST:event_BotaoDoisActionPerformed

    private void BotaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTresActionPerformed
        txtResultado.setText(txtResultado.getText()+"3");
    }//GEN-LAST:event_BotaoTresActionPerformed

    private void BotaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoQuatroActionPerformed
        txtResultado.setText(txtResultado.getText()+"4");
    }//GEN-LAST:event_BotaoQuatroActionPerformed

    private void BotaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCincoActionPerformed
        txtResultado.setText(txtResultado.getText()+"5");
    }//GEN-LAST:event_BotaoCincoActionPerformed

    private void BotaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSeisActionPerformed
        txtResultado.setText(txtResultado.getText()+"6");
    }//GEN-LAST:event_BotaoSeisActionPerformed

    private void BotaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSeteActionPerformed
        txtResultado.setText(txtResultado.getText()+"7");
    }//GEN-LAST:event_BotaoSeteActionPerformed

    private void BotaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOitoActionPerformed
        txtResultado.setText(txtResultado.getText()+"8");
    }//GEN-LAST:event_BotaoOitoActionPerformed

    private void BotaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNoveActionPerformed
        txtResultado.setText(txtResultado.getText()+"9");
    }//GEN-LAST:event_BotaoNoveActionPerformed

    private void botaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPontoActionPerformed
        txtResultado.setText(txtResultado.getText()+".");
    }//GEN-LAST:event_botaoPontoActionPerformed

    private void BotaoCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCeActionPerformed
        txtResultado.setText("");
    }//GEN-LAST:event_BotaoCeActionPerformed

    private void BotaoAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "adicao";
    }//GEN-LAST:event_BotaoAdicaoActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        valor2 = Double.parseDouble(txtResultado.getText());
        if (sinal == "adicao"){
            txtResultado.setText(String.valueOf(valor1+valor2));
        } 
        
        if (sinal == "subtracao"){
            txtResultado.setText(String.valueOf(valor1-valor2));
        }
        
        if (sinal == "divisao"){
            txtResultado.setText(String.valueOf(valor1/valor2));
        }
        
        if (sinal == "multiplicacao"){
            txtResultado.setText(String.valueOf(valor1*valor2));
        }
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void BotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtracaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "subtracao";
    }//GEN-LAST:event_BotaoSubtracaoActionPerformed

    private void BotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicacaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "multiplicacao";
    }//GEN-LAST:event_BotaoMultiplicacaoActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "divisao";
    }//GEN-LAST:event_BotaoDivisaoActionPerformed

    private void BotaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCActionPerformed
        valor1 = null;
        valor2 = null;
        txtResultado.setText("");
    }//GEN-LAST:event_BotaoCActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicao;
    private javax.swing.JButton BotaoC;
    private javax.swing.JButton BotaoCe;
    private javax.swing.JButton BotaoCinco;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoDois;
    private javax.swing.JButton BotaoMultiplicacao;
    private javax.swing.JButton BotaoNove;
    private javax.swing.JButton BotaoOito;
    private javax.swing.JButton BotaoQuatro;
    private javax.swing.JButton BotaoSeis;
    private javax.swing.JButton BotaoSete;
    private javax.swing.JButton BotaoSubtracao;
    private javax.swing.JButton BotaoTres;
    private javax.swing.JButton BotaoUm;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoPonto;
    private javax.swing.JButton botaoZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
