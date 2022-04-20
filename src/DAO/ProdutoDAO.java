package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private final Connection con;

    public ProdutoDAO() {
        this.con = new Conexao.ConnectionFactory().getConnection();

    }

    public void cadastrarProduto(Produto obj) {
        try {
            //    1 passo - Criar o comando sql 
            String sql = "insert into produto(nome,tamanho,cor,qdt,valorDeCusto,valorDeVenda,lucro,qtdMinimaEstoque,qtdMaximaEstoque,Fornecedor)"
                    + " values(?,?,?,?,?,?,?,?,?,?);";

            try (//    2 passo - conectart o banco de dados e Organizar o Comando sql
                    PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, obj.getNome());
                stmt.setString(2, obj.getTamanho());
                stmt.setString(3, obj.getCor());
                stmt.setInt(4, obj.getQdt());
                stmt.setBigDecimal(5, obj.getValorDeCusto());
                stmt.setBigDecimal(6, obj.getValorDeVenda());
                stmt.setBigDecimal(7, obj.getLucro());
                stmt.setInt(8, obj.getQtdMinimaEstoque());
                stmt.setInt(9, obj.getQtdMaximaEstoque());
                stmt.setString(10, obj.getFornecedor());
                stmt.executeUpdate();
                stmt.close();
            }
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }

    }

    public void removerProduto(Produto obj) {

        try {
            //    1 passo - Criar o comando sql 
            String sql = "delete from produto where cod = ?";

            try (//    2 passo - conectart o banco de dados e Organizar o Comando sql
                    PreparedStatement stmt = con.prepareStatement(sql)) {

                stmt.setInt(1, obj.getCod());
                stmt.executeUpdate();
                stmt.close();
            }
            JOptionPane.showMessageDialog(null, "Exluido com Sucesso com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }

    }

    public void alterarProduto(Produto obj) {

        try {
            //    1 passo - Criar o comando sql 
            String sql = "update produto set  nome=?,tamanho=?,cor=?,qdt=?,valorDeCusto=?,valorDeVenda=?,lucro=?,"
                    + "qtdMinimaEstoque=?,qtdMaximaEstoque=?,Fornecedor=? where cod = ?";

            try (//    2 passo - conectart o banco de dados e Organizar o Comando sql
                    PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, obj.getNome());
                stmt.setString(2, obj.getTamanho());
                stmt.setString(3, obj.getCor());
                stmt.setInt(4, obj.getQdt());
                stmt.setBigDecimal(5, obj.getValorDeCusto());
                stmt.setBigDecimal(6, obj.getValorDeVenda());
                stmt.setBigDecimal(7, obj.getLucro());
                stmt.setInt(8, obj.getQtdMinimaEstoque());
                stmt.setInt(9, obj.getQtdMaximaEstoque());
                stmt.setString(10, obj.getFornecedor());
                stmt.setInt(11, obj.getCod());
                stmt.executeUpdate();
                stmt.close();
            }
            JOptionPane.showMessageDialog(null, "Atualizado  com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }

    }

    public List<Produto> listarProdutos() {
        try {
//            criar lista
            List<Produto> lista = new ArrayList<>();
            String sql = "SELECT * FROM xproject.produto";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto obj = new Produto();
                obj.setCod(rs.getInt("cod"));
                obj.setNome(rs.getString("nome"));
                obj.setTamanho(rs.getString("tamanho"));
                obj.setCor(rs.getString("cor"));
                obj.setQdt(rs.getInt("qdt"));
                obj.setValorDeCusto(rs.getBigDecimal("valorDeCusto"));
                obj.setValorDeVenda(rs.getBigDecimal("valorDeVenda"));
                obj.setLucro(rs.getBigDecimal("lucro"));
                obj.setQtdMinimaEstoque(rs.getInt("qtdMinimaEstoque"));
                obj.setQtdMaximaEstoque(rs.getInt("qtdMaximaEstoque"));
                obj.setFornecedor(rs.getString("fornecedor"));

                lista.add(obj);

            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ops aconteceu o Erro: " + e);
        }
        return null;

    }
}
