/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rede_de_cinemas;
import javax.swing.JOptionPane;
/**
 *
 * @authores Daniel Carvalho, Fernanda Uchôa e Gabriela de Freitas
 */

public class Clientes extends Pessoa_Fisica {
        //Declaração de variaveis:
        private int i=1,k/*(decisão*/;//contadores
        private String continua1,modi;//"repetidores"

    public void Cadastrar_Clientes(){//Metodo de Cadastro

        do{//Faz com que o código só repita enquanto o usuario achar necessario
        
        JOptionPane.showMessageDialog(null,"O CÓDIGO DO CLIENTE É: "+i);
        nome[i]=JOptionPane.showInputDialog("INFORME O NOME DO CLIENTE","Digite seu nome aqui");
        rg[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME O RG DO CLIENTE","Digite seu rg sem traços Ex 0000000"));
        cpf[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O CPF DO CLIENTE","Digite se CPF sem traços Ex 00000000000"));
        
        sexo[i]=JOptionPane.showInputDialog("INFORME O SEXO DO CLIENTE\nF-FEMININO  M-MASCULINO","digite F para Feminino ou M para Masculino");
        if (sexo[i].equalsIgnoreCase("f")){
            sexo[i]="Feminino";
        }else 
        if (sexo[i].equalsIgnoreCase("m")){
                sexo[i]="Masculino";
            }
        
        data_nasc[i]=JOptionPane.showInputDialog("INFORME A DATA DE NASCIMENTO DO CLIENTE");
        endereco[i]=JOptionPane.showInputDialog("INFORME O ENDERECO DO CLIENTE");
        telefone[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O TELEFONE DO CLIENTE"));
        cidade[i]=JOptionPane.showInputDialog("INFORME A CIDADE DO CLIENTE");
        uf[i]=JOptionPane.showInputDialog("INFORME A UF DO CLIENTE");
        i++;
        continua1=JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRO CLIENTE?\nS-Sim   N-Não");
        }while (continua1.equalsIgnoreCase("s"));
        
    }

        
    public void Consultar_Clientes () {//Metodo para Consulta de Cadastros
        do{
        JOptionPane.showMessageDialog(null,"CONSULTA DE CADASTRO DE CLIENTE");
        i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO DO CLIENTE:"));//a variavel i seria um "codigo" para obter melhor os dados de consulta
        
        JOptionPane.showMessageDialog(null,"\t\tDADOS DO CLIENTE "+"\nNOME:"+nome[i]+"\nRG: "+rg[i]+"\nCPF"+"\nSEXO:"+sexo[i]+"\nDATA DE NASCIMENTO:"+data_nasc[i]+"\nTELEFONE:"+telefone[i]+"\nENDEREÇO:"+endereco[i]+"\nCIDADE:"+cidade[i]+"\nUF:"+uf[i]);
       
        continua1=JOptionPane.showInputDialog("DESEJA CONSULTAR O CADASTRO DE OUTRO CLIENTE?\nS-Sim\t\tN-Não");
        
        }while (continua1.equalsIgnoreCase("s"));
    }
        
        
    public void Modificar_Clientes(){
        
        JOptionPane.showMessageDialog(null,"MODIFICAÇÃO CADASTRAL DE CLIENTE");
            do{
            i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO CADASTRAL DO CLIENTE"));
                
                do{
            k=Integer.parseInt(JOptionPane.showInputDialog("QUAL DADO DESEJA MODIFICAR?\n-1TELEFONE\n2-ENDEREÇO\n3-CIDADE\n4-UF"));
            switch(i){
                case 1:
                    telefone[i]=Long.parseLong(JOptionPane.showInputDialog("INFORME O NOVO TELEFONE DO CLIENTE"));
                    break;
                case 2:
                    endereco[i]=JOptionPane.showInputDialog("INFORME O NOVO ENDERECO DO CLIENTE");
                    break;
                case 3:
                    cidade[i]=JOptionPane.showInputDialog("INFORME A NOVA CIDADE DO CLIENTE");
                    break;
                case 4:
                    uf[i]=JOptionPane.showInputDialog("INFORME A NOVA UF DO CLIENTE");
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVALIDA");
                    break;       
                }
                modi=JOptionPane.showInputDialog("DESEJA MODIFICAR OUTRO DADO DESTE CADASTRO?\nS-Sim\t\tN=Não");
                }while((modi.equals("s"))||(modi.equals("S")));

                    
             continua1=JOptionPane.showInputDialog("DESEJA MODIFICAR O CADASTRO DE OUTRO CLIENTE?\nS-Sim\t\tN-Não");
            }while ((continua1.equals("S"))||(continua1.equals("s")));
    }
    
    
}

