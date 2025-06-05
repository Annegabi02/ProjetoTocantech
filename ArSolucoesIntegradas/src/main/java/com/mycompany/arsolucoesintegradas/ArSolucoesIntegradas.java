/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arsolucoesintegradas;

import static Controller.ConexaoComBancoDados.conectar;
import java.sql.Connection;

/**
 *
 * @author ALUNOS
 */
public class ArSolucoesIntegradas {

    public static void main(String[] args) {
        Connection conexao = conectar();
        
        if(conexao!=null){
            System.out.println("Conexao bem sucedida!");
            
        }else{
            System.out.println("Erro na conexao com banco de dados!");
        }
    }
}
