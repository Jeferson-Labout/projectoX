/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import javax.swing.JOptionPane;

/**
 *
 * @author Jefson
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ops aconteceu o Erro: " + e);
        }
    }
}
