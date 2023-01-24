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
public class Filmes {
    protected String[] nome = new String[10000], produtora = new String [10000], nacionalidade = new String [10000],categoria = new String[10000];
    String hr_exibicao [ ] ={"13:00","14:30","16:00","18:30","20:00","22:30"};
    int sala [ ] = {1,2,3,4,5,6,7,8,9,10};
    protected int [] censura = new int[10000], duracao = new int[10000];
    protected String continuar;
    protected int i=1;
    
    public void Cadastro_de_Filmes (){
        JOptionPane.showMessageDialog(null,"O CÓDIGO DO FILME É "+i);
        nome[i]=JOptionPane.showInputDialog("INFORME O NOME DO FILME:");
        categoria[i]=JOptionPane.showInputDialog("INFORME CATEGORIA DO FILME");
        nacionalidade[i]=JOptionPane.showInputDialog("INFORME A NACIONALIDADE");
        produtora[i]=JOptionPane.showInputDialog("INFORME A PRODUTORA DO FILME");
        censura[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A CENSURA DO FILME"));
        duracao[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A DURAÇÃO DO FILME (EM MINUTOS)"));
      i++;  
    }
    public void Consultar_Filme (){
        do{
            i=Integer.parseInt(JOptionPane.showInputDialog("CONSULTA DE DADOS DE FILME!\nINFORME O CÓDIGO DO FILME"));
            JOptionPane.showMessageDialog(null,"NOME: "+nome[i]+"\nCATEGORIA: "+categoria[i]+"\nNACIONALIDADE:"+nacionalidade[i]+"\nPRODUTORA: "+produtora[i]+"\nCENSURA: "+ censura[i]+"\nDURAÇÃO: "+ duracao[i]+"min.");
            continuar=JOptionPane.showInputDialog( "DESEJA CONSULTAR OS DADOS DE OUTRO FILME?\nS-SIM     N-NÃO");
        }while(continuar.equalsIgnoreCase("s"));
    }
    public void Exibição_Filmes (){
       do{
        i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO DO FILME: "));
                
        if (censura[i] <= 12){
            JOptionPane.showMessageDialog(null,"FILME:"+nome[i]+"OS HORARIOS DE EXIBIÇÃO PARA ESTE FILME É "+hr_exibicao[1]+", "+hr_exibicao[2]+", "+hr_exibicao[3]+".\nSALAS DISPONIVEIS: "+sala[1]+","+sala[3]+","+sala[4]);
            continuar=JOptionPane.showInputDialog("DESEJA CONSULTAR OUTROS FILMES?\nS-SIM  N-NÃO");
        }else if(censura[i]==14){
            JOptionPane.showMessageDialog(null, "FILME:"+nome[i]+"OS HORARIOS DE EXIBIÇÃO PARA ESTE FILME É "+hr_exibicao[2]+", "+hr_exibicao[3]+", "+hr_exibicao[4]+".\nSALAS DISPONIVEIS: "+sala[2]+","+sala[6]+","+sala[5]);
           continuar=JOptionPane.showInputDialog("DESEJA CONSULTAR OUTROS FILMES?\nS-SIM  N-NÃO");
        }else if (censura[i]==16){
           JOptionPane.showMessageDialog(null,"FILME:"+nome[i]+ "OS HORARIOS DE EXIBIÇÃO PARA ESTE FILME É "+hr_exibicao[4]+", "+hr_exibicao[5]+", "+hr_exibicao[6]+".\nSALAS DISPONIVEIS: "+sala[3]+","+sala[9]+","+sala[10]);
           continuar=JOptionPane.showInputDialog("DESEJA CONSULTAR OUTROS FILMES?\nS-SIM  N-NÃO");
        }else if (censura[i]>18){
           JOptionPane.showMessageDialog(null,"FILME:"+nome[i]+ "OS HORARIOS DE EXIBIÇÃO PARA ESTE FILME É "+hr_exibicao[5]+", "+hr_exibicao[6]+".\nSALAS DISPONIVEIS: "+sala[8]+","+sala[7]);
           continuar=JOptionPane.showInputDialog("DESEJA CONSULTAR OUTROS FILMES?\nS-SIM  N-NÃO");
        }else{
           continuar=JOptionPane.showInputDialog("CÓDIGO INVALIDO! DESEJA TENTAR NOVAMENTE?\nS-SIM  N-NÃO");
           
       }
       }while(continuar.equalsIgnoreCase("s"));
    }
    
    
}
