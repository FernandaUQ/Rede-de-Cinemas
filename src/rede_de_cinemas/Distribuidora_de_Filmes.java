/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rede_de_cinemas;

import javax.swing.JOptionPane;

/**
 *
 * @author Diegos2Nanda
 */
public class Distribuidora_de_Filmes extends Pessoa_Juridica {
    protected String continua,continua2;
    protected int i=1,opcao1;
    
    public void Cadastrar_Distribuidora_de_Filmes(){
        do{
           JOptionPane.showMessageDialog(null,"CADASTRO DE DISTRIBUIDORA DE FILMES");
           JOptionPane.showMessageDialog(null,"O CÓDIGO DO DISTRIBUIDORA DE FILMES É:"+i);
           nome[i]=JOptionPane.showInputDialog("INFORME O NOME DO DISTRIBUIDORA DE FILMES");
           cnpj[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O CNPJ DO DISTRIBUIDORA DE FILMES"));
           inscricao_estadual[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME A INSCRIÇÃO ESTADUAL DO DISTRIBUIDORA DE FILMES"));
           uf[i]=JOptionPane.showInputDialog("INFORME A UNIDADE FEDERAL DO DISTRIBUIDORA DE FILMES");
           cidade[i]=JOptionPane.showInputDialog("INFORME A CIDADE DO DISTRIBUIDORA DE FILMES");
           endereco[i]=JOptionPane.showInputDialog("INFORME O ENDEREÇO DO DISTRIBUIDORA DE FILMES");
           telefone[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O TELEFONE DO DISTRIBUIDORA DE FILMES"));
           email[i]=JOptionPane.showInputDialog("INFORME O E-MAIL DO DISTRIBUIDORA DE FILMES");
           produtos_fornecidos[i]=JOptionPane.showInputDialog("INFORME OS PRODUTOS OFERECIDOS POR ESTE DISTRIBUIDORA DE FILMES");
           i++;
           continua=JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRO DISTRIBUIDORA DE FILMES?\nS-Sim\t\tN-Não");
           
        }while((continua.equals("s"))||(continua.equals("S")));
    }
    
    public void Modificar_Distribuidora_de_Filmes(){
        do{
            JOptionPane.showMessageDialog(null,"MODIFICAÇÃO DE CADASTRO DE DISTRIBUIDORA DE FILMES");
            i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO CADASTRAL DO DISTRIBUIDORA DE FILMES"));
            do{
            opcao1=Integer.parseInt(JOptionPane.showInputDialog("INFORME QUAL OPÇÃO DESEJA MODIFICAR?\n1-UF\n2-CIDADE\n3-ENDERECO\n4-TELEFONE\n5-E-MAIL"));
            switch (opcao1) {
                case 1:
                    uf[i]=JOptionPane.showInputDialog("INFORME A UNIDADE FEDERAL DO DISTRIBUIDORA DE FILMES");
                    break;
                case 2:
                    cidade[i]=JOptionPane.showInputDialog("INFORME A CIDADE DO DISTRIBUIDORA DE FILMES");
                    break;
                case 3:
                    endereco[i]=JOptionPane.showInputDialog("INFORME O ENDEREÇO DO DISTRIBUIDORA DE FILMES");
                    break;
                case 4:
                    telefone[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O TELEFONE DO DISTRIBUIDORA DE FILMES"));
                    break;
                case 5:
                    email[i]=JOptionPane.showInputDialog("INFORME O E-MAIL DO DISTRIBUIDORA DE FILMES");
                    break;
                default:
                     continua2=JOptionPane.showInputDialog("OPÇÃO INVALIDA!!\nDESEJA TENTAR NOVAMENTE?\nS-SIM\t\tN-NÃO");
                    break;
            }
            }while((continua2.equals("s"))||(continua2.equals("S")));
            continua=JOptionPane.showInputDialog("DESEJA MODIFICAR O CADASTRO DE OUTRO DISTRIBUIDORA DE FILMES?\nS-Sim\t\tN-Não");
        }while((continua.equals("s"))||(continua.equals("S")));
    }
    
    public void Exibir_Distribuidora_de_Filmes (){
        do{
        JOptionPane.showMessageDialog(null,"CONSULTA CADASTRAL DE DISTRIBUIDORA DE FILMES");
        i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO CADASTRAL DO DISTRIBUIDORA DE FILMES"));
        JOptionPane.showMessageDialog(null,"DADOS CADASTRAIS DO DISTRIBUIDORA DE FILMES "+i+".\nNOME: "+nome[i]+"\nCNPJ: "+cnpj[i]+"\nINSCRIÇÃO ESTADUAL: "+inscricao_estadual[i]+"\nUNIDADE FEDERAL: "+uf[i]+"\nCIDADE: "+cidade[i]+"\nENDEREÇO: "+endereco[i]+"\nTELEFONE: "+telefone[i]+"\nE-MAIL: "+email[i]+"\nPRODUTOS OFERECIDOS POR ESTA EMPRESA:"+produtos_fornecidos[i]);
        continua=JOptionPane.showInputDialog("DESEJA CONSULTAR O CADASTRO DE OUTRO DISTRIBUIDORA DE FILMES?\nS-Sim\t\tN-Não");
        }while((continua.equals("s"))||(continua.equals("S")));
        }
    
}
