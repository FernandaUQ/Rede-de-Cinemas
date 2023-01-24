/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rede_de_cinemas;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenita
 */
public class Fornecedor extends Pessoa_Juridica {
    protected String continua,continua2;
    protected int i=1,opcao1;
    
    public void Cadastrar_Fornecedor(){
        do{
           JOptionPane.showMessageDialog(null,"CADASTRO DE FORNECEDOR");
           JOptionPane.showMessageDialog(null,"O CÓDIGO DO FORNECEDOR É:"+i);
           nome[i]=JOptionPane.showInputDialog("INFORME O NOME DO FORNECEDOR");
           cnpj[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O CNPJ DO FORNECEDOR"));
           inscricao_estadual[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME A INSCRIÇÃO ESTADUAL DO FORNECEDOR"));
           uf[i]=JOptionPane.showInputDialog("INFORME A UNIDADE FEDERAL DO FORNECEDOR");
           cidade[i]=JOptionPane.showInputDialog("INFORME A CIDADE DO FORNECEDOR");
           endereco[i]=JOptionPane.showInputDialog("INFORME O ENDEREÇO DO FORNECEDOR");
           telefone[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O TELEFONE DO FORNECEDOR"));
           email[i]=JOptionPane.showInputDialog("INFORME O E-MAIL DO FORNECEDOR");
           produtos_fornecidos[i]=JOptionPane.showInputDialog("INFORME OS PRODUTOS OFERECIDOS POR ESTE FORNECEDOR");
           i++;
           continua=JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRO FORNECEDOR?\nS-Sim\t\tN-Não");
           
        }while((continua.equals("s"))||(continua.equals("S")));
    }
    
    public void Modificar_Fornecedor(){
        do{
            JOptionPane.showMessageDialog(null,"MODIFICAÇÃO DE CADASTRO DE FORNECEDOR");
            i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO CADASTRAL DO FORNECEDOR"));
            do{
            opcao1=Integer.parseInt(JOptionPane.showInputDialog("INFORME QUAL OPÇÃO DESEJA MODIFICAR?\n1-UF\n2-CIDADE\n3-ENDERECO\n4-TELEFONE\n5-E-MAIL"));
            switch (opcao1) {
                case 1:
                    uf[i]=JOptionPane.showInputDialog("INFORME A UNIDADE FEDERAL DO FORNECEDOR");
                    break;
                case 2:
                    cidade[i]=JOptionPane.showInputDialog("INFORME A CIDADE DO FORNECEDOR");
                    break;
                case 3:
                    endereco[i]=JOptionPane.showInputDialog("INFORME O ENDEREÇO DO FORNECEDOR");
                    break;
                case 4:
                    telefone[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O TELEFONE DO FORNECEDOR"));
                    break;
                case 5:
                    email[i]=JOptionPane.showInputDialog("INFORME O E-MAIL DO FORNECEDOR");
                    break;
                default:
                     continua2=JOptionPane.showInputDialog("OPÇÃO INVALIDA!!\nDESEJA TENTAR NOVAMENTE?\nS-SIM\t\tN-NÃO");
                    break;
            }
            }while((continua2.equals("s"))||(continua2.equals("S")));
            continua=JOptionPane.showInputDialog("DESEJA MODIFICAR O CADASTRO DE OUTRO FORNECEDOR?\nS-Sim\t\tN-Não");
        }while((continua.equals("s"))||(continua.equals("S")));
    }
    
    public void Exibir_Cadastro (){
        do{
        JOptionPane.showMessageDialog(null,"CONSULTA CADASTRAL DE FORNECEDOR");
        i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO CADASTRAL DO FORNECEDOR"));
        JOptionPane.showMessageDialog(null,"DADOS CADASTRAIS DO FORNECEDOR "+i+".\nNOME: "+nome[i]+"\nCNPJ: "+cnpj[i]+"\nINSCRIÇÃO ESTADUAL: "+inscricao_estadual[i]+"\nUNIDADE FEDERAL: "+uf[i]+"\nCIDADE: "+cidade[i]+"\nENDEREÇO: "+endereco[i]+"\nTELEFONE: "+telefone[i]+"\nE-MAIL: "+email[i]+"\nPRODUTOS OFERECIDOS POR ESTA EMPRESA:"+produtos_fornecidos[i]);
        continua=JOptionPane.showInputDialog("DESEJA CONSULTAR O CADASTRO DE OUTRO FORNECEDOR?\nS-Sim\t\tN-Não");
        }while((continua.equals("s"))||(continua.equals("S")));
        }
}
    
    

