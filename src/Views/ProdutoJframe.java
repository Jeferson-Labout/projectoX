package Views;

import DAO.ProdutoDAO;
import Model.Produto;
import Util.LimpaTela;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jaqueline
 */
public final class ProdutoJframe extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    @SuppressWarnings({"unchecked", "unchecked"})
    public ProdutoJframe() {
        initComponents();

    }

//    @SuppressWarnings("unchecked")
    public void ListarTabela() {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarProdutos();
        DefaultTableModel dados = (DefaultTableModel) tblProdutos.getModel();
        dados.setNumRows(0);

        for (Produto p : lista) {
            dados.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getTamanho(),
                p.getCor(),
                p.getQdt(),
                p.getValorDeCusto(),
                p.getValorDeVenda(),
                p.getQtdMinimaEstoque(),
                p.getQtdMaximaEstoque(),
                p.getFornecedor(),
                p.getLucro()

            });

        }

    }

    ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jdproduto = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNOME = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textQUANTIDADE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textComboFORNECEDOR = new javax.swing.JComboBox<>();
        textCOR = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textTAMANHO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textQtdMinima = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textQtdMaxima = new javax.swing.JTextField();
        textValorCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textValorSaida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textLucro = new javax.swing.JTextField();
        btnCadatrar = new javax.swing.JButton();
        btnMostrarLista = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        textCOD = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Produtos");

        Jdproduto.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastre um novo produto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Cod:");

        textNOME.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textNOME.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        textQUANTIDADE.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Quantidade:");

        jLabel12.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Fornecedor:");

        textComboFORNECEDOR.setEditable(true);
        textComboFORNECEDOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIke", "Adidas", "Puma", "Triton" }));
        textComboFORNECEDOR.setSelectedIndex(-1);
        textComboFORNECEDOR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textCOR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Cor:");

        textTAMANHO.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Tamanho:");

        textQtdMinima.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Qtd. minima do estoque:");

        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Qtd. maxíma do estoque:");

        textQtdMaxima.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textValorCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Valor de compra:");

        textValorSaida.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Valor de saída:");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Lucro:");

        textLucro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadatrar.setBackground(new java.awt.Color(102, 255, 102));
        btnCadatrar.setText("Salvar");
        btnCadatrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadatrarActionPerformed(evt);
            }
        });

        btnMostrarLista.setBackground(new java.awt.Color(0, 102, 255));
        btnMostrarLista.setText("Mostrar Lista");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Remover");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textQUANTIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCOR, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTAMANHO, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(textValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textQtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textQtdMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textComboFORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCadatrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNOME, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(textQUANTIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(textCOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCOR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTAMANHO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQtdMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQtdMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textComboFORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValorSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadatrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Cadastrados"), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.:", "Nome:", "Tamanho", "Cor", "Qdt", "Valor Custo", "Valor Venda", "Qdt. Min. Estoque", "Qdt. Max. Estoque", "Fornecedor", "Lucro"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(10).setMinWidth(0);
            tblProdutos.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblProdutos.getColumnModel().getColumn(10).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 216, Short.MAX_VALUE))
        );

        Jdproduto.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Jdproduto.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JdprodutoLayout = new javax.swing.GroupLayout(Jdproduto);
        Jdproduto.setLayout(JdprodutoLayout);
        JdprodutoLayout.setHorizontalGroup(
            JdprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdprodutoLayout.createSequentialGroup()
                .addGroup(JdprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JdprodutoLayout.setVerticalGroup(
            JdprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jdproduto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jdproduto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadatrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadatrarActionPerformed
        if (textCOD.getText().equals("")) {
            Cadastrar();
        } else {
            Alterar();
        }

    }//GEN-LAST:event_btnCadatrarActionPerformed

    public void Cadastrar() {

        try {
            Produto obj = new Produto();
            int intQdt = Integer.parseInt(textQUANTIDADE.getText());
            BigDecimal DecimalprecoCusto = new BigDecimal(textValorCompra.getText());
            BigDecimal DecimalvalorDeVenda = new BigDecimal(textValorSaida.getText());
            BigDecimal lucro = new BigDecimal(textLucro.getText());
            int intQtdMinimaEstoque = Integer.parseInt(textQtdMinima.getText());
            int intQtdMaximaEstoque = Integer.parseInt(textQtdMaxima.getText());
            String fornecedorComb = (String) this.textComboFORNECEDOR.getSelectedItem();

            obj.setNome(textNOME.getText());
            obj.setTamanho(textTAMANHO.getText());
            obj.setCor(textCOR.getText());
            obj.setQdt(intQdt);
            obj.setValorDeCusto(DecimalprecoCusto);
            obj.setValorDeVenda(DecimalvalorDeVenda);
            obj.setLucro(lucro);
            obj.setQtdMinimaEstoque(intQtdMinimaEstoque);
            obj.setQtdMaximaEstoque(intQtdMaximaEstoque);

            obj.setFornecedor(fornecedorComb);
            ProdutoDAO dao = new ProdutoDAO();
            dao.cadastrarProduto(obj);
            new LimpaTela().LimpaTela(jPanel2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar " + e);
        }
        ListarTabela();

    }

    public void Alterar() {

        try {
            Produto obj = new Produto();
            int intQdt = Integer.parseInt(textQUANTIDADE.getText());
            BigDecimal DecimalprecoCusto = new BigDecimal(textValorCompra.getText());
            BigDecimal DecimalvalorDeVenda = new BigDecimal(textValorSaida.getText());
            BigDecimal lucro = new BigDecimal(textLucro.getText());
            int intQtdMinimaEstoque = Integer.parseInt(textQtdMinima.getText());
            int intQtdMaximaEstoque = Integer.parseInt(textQtdMaxima.getText());
            String fornecedorComb = (String) this.textComboFORNECEDOR.getSelectedItem();

            obj.setNome(textNOME.getText());
            obj.setTamanho(textTAMANHO.getText());
            obj.setCor(textCOR.getText());
            obj.setQdt(intQdt);
            obj.setValorDeCusto(DecimalprecoCusto);
            obj.setValorDeVenda(DecimalvalorDeVenda);
            obj.setLucro(lucro);
            obj.setQtdMinimaEstoque(intQtdMinimaEstoque);
            obj.setQtdMaximaEstoque(intQtdMaximaEstoque);

            obj.setFornecedor(fornecedorComb);

            obj.setCod(Integer.parseInt(textCOD.getText()));
            ProdutoDAO dao = new ProdutoDAO();
            dao.alterarProduto(obj);
            new LimpaTela().LimpaTela(jPanel2);
            textCOD.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar " + e);
        }
        ListarTabela();

    }

    private void btnMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaActionPerformed
        ListarTabela();


    }//GEN-LAST:event_btnMostrarListaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        try {
            Produto obj = new Produto();

            obj.setCod(Integer.parseInt(textCOD.getText()));

            ProdutoDAO dao = new ProdutoDAO();

            dao.removerProduto(obj);

            new LimpaTela().LimpaTela(jPanel2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Remover Produto " + e);
        }
        ListarTabela();
        textCOD.setText("");

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        int linha = this.tblProdutos.getSelectedRow();
        String code = this.tblProdutos.getValueAt(linha, 0).toString();
        this.textCOD.setText(code);
        String nome = this.tblProdutos.getValueAt(linha, 1).toString();
        this.textNOME.setText(nome);
        String tamanho = this.tblProdutos.getValueAt(linha, 2).toString();
        this.textTAMANHO.setText(tamanho);
        String cor = this.tblProdutos.getValueAt(linha, 3).toString();
        this.textCOR.setText(cor);
        String qdt = this.tblProdutos.getValueAt(linha, 4).toString();
        this.textQUANTIDADE.setText(qdt);
        String valorCompra = this.tblProdutos.getValueAt(linha, 5).toString();
        this.textValorCompra.setText(valorCompra);
        String valorVenda = this.tblProdutos.getValueAt(linha, 6).toString();
        this.textValorSaida.setText(valorVenda);
        String qtdMinima = this.tblProdutos.getValueAt(linha, 7).toString();
        this.textQtdMinima.setText(qtdMinima);
        String qtdMaxima = this.tblProdutos.getValueAt(linha, 8).toString();
        this.textQtdMaxima.setText(qtdMaxima);
        String fornecedor = (String) this.tblProdutos.getValueAt(linha, 9).toString();
        this.textComboFORNECEDOR.setSelectedItem(fornecedor);
        String lucro = this.tblProdutos.getValueAt(linha, 10).toString();
        this.textLucro.setText(lucro);

    }//GEN-LAST:event_tblProdutosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Jdproduto;
    private javax.swing.JButton btnCadatrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JLabel textCOD;
    private javax.swing.JTextField textCOR;
    private javax.swing.JComboBox<String> textComboFORNECEDOR;
    private javax.swing.JTextField textLucro;
    private javax.swing.JTextField textNOME;
    private javax.swing.JTextField textQUANTIDADE;
    private javax.swing.JTextField textQtdMaxima;
    private javax.swing.JTextField textQtdMinima;
    private javax.swing.JTextField textTAMANHO;
    private javax.swing.JTextField textValorCompra;
    private javax.swing.JTextField textValorSaida;
    // End of variables declaration//GEN-END:variables
}
