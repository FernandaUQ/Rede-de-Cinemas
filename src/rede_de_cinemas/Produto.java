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
public class Produto extends Caixa{
    protected String[] descricao = new String[10];
    protected int i=1,j,k,l, escolha;
    protected String[] nome2 = new String[10], descricao2 = new String[10],forma_pag2=new String[10],fornecedor = new String [10] ;
    protected String continuar,cont,cont1,cont2,escolher,confirma;
    protected int[] codigo2 = new int[10],forma_pag = new int[10];
    protected double[] valor_venda2 = new double[10],valor_total= new double[10];
    protected double valor_final,valor_final2;
    
    public void Cadastrar_Produto(){
        do{
        JOptionPane.showMessageDialog(null,"CADASTRO DE PRODUTO");
        JOptionPane.showMessageDialog(null,"O CÓDIGO DO PRODUTO É "+i);
        nome[i]=JOptionPane.showInputDialog("INFORME O NOME DO PRODUTO");
        descricao[i]=JOptionPane.showInputDialog("INFORME A DESCRIÇÃO DO PRODUTO");
        valor_compra[i]=Double.parseDouble(JOptionPane.showInputDialog("INFORME O PREÇO DE COMPRA "));
        valor_venda[i]=Double.parseDouble(JOptionPane.showInputDialog("INFORME O PREÇO DE VENDA "));
        i++;
        continuar=JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRO PRODUTO?\nS-SIM   N-NÃO");
        }while ((continuar.equals("S"))||(continuar.equals("s")));
    }
    
    public void Vender_Produto () {
        do{
        JOptionPane.showMessageDialog(null,"VENDA DE PRODUTOS");
        do{
           i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CODIGO DO PRODUTO"));
        confirma=JOptionPane.showInputDialog("\nCÓDIGO DO PRODUTO: "+i+"\nNOME DO PRODUTO: "+nome[i]+"\nDESCRIÇÃO: "+descricao[i]+"\nVALOR DE VENDA UNITARIO: "+ valor_venda[i]+"\nESSE É O PRODUTO DESEJADO? S-SIM   N-NÃO");
       
            if (confirma.equalsIgnoreCase("s")){
         qtde_venda[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DO PRODUTO","Digite a quantidade aqui"));
        valor_final=((qtde_venda[i]*valor_venda[i])+valor_final);
        
        
            }else{
                cont=JOptionPane.showInputDialog("NOME INCORRETO! DESEJA TENTAR NOVAMENTE? \nS-SIM  N-NÃO","DIGITE S PARA SIM OU N PARA NÃO");
                        }
            cont=JOptionPane.showInputDialog("DESEJA ADICIONAR OUTRO PRODUTO À VENDA?\nS-SIM    N-NÃO");
            }while ((cont.equals("S"))||(cont.equals("s")));
        
        data[i]=JOptionPane.showInputDialog("INFORME A DATA DA VENDA","dd/mm/aaaa");
        hora[i]=JOptionPane.showInputDialog("INFORME A HORA DA VENDA","hh:mm");
       
        do{
        forma_pag[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A FORMA DE PAGAMENTO: \n 1-DINHEIRO \n2-CARTÃO \n3-CHEQUE"));
        switch (forma_pag[i]){
            case 1:
                forma_pag2[i]="DINHEIRO";
                valor_final=(((qtde_venda[i]*valor_venda[i])+valor_final)-((((qtde_venda[i]*valor_venda[i])+valor_final)*10)/100));
                break;
            case 2:
                forma_pag2[i]="CARTÃO";
                valor_final=(((qtde_venda[i]*valor_venda[i])+valor_final)+((((qtde_venda[i]*valor_venda[i])+valor_final)*10)/100));
                break;
            case 3: 
                forma_pag2[i]="CHEQUE";
                valor_final=(((qtde_venda[i]*valor_venda[i])+valor_final)+((((qtde_venda[i]*valor_venda[i])+valor_final)*30)/100));
                break;
            default:
                escolha=Integer.parseInt(JOptionPane.showInputDialog("CÓDIGO INVALIDO!! DESEJA TENTAR NOVAMENTE? \n1-Sim    2-Não"));     
        }
        }while (escolha==1);
        i++;
       
        
        JOptionPane.showMessageDialog(null,"\t\tRELATORIO DE VENDA\nCÓDIGO DE VENDA:"+i+"\nPRODUTO 1:"+nome[1]+"QUANTIDADE: "+qtde_venda[1]+"Valor Unt: "+valor_venda[1]+"\nPRODUTO 2:"+nome[2]+"QUANTIDADE: "+qtde_venda[2]+"Valor Unt: "+valor_venda[2]+"\nPRODUTO 3:"+nome[3]+"QUANTIDADE: "+qtde_venda[3]+"Valor Unt: "+valor_venda[3]+"\nVALOR TOTAL:"+valor_final+"\nDATA: "+data[i]+"\nHORA: "+hora[i]+"\nFORMA DE PAGAMENTO: "+forma_pag2[i]+"");
        
        continuar=JOptionPane.showInputDialog(null,"DESEJA FAZER OUTRA VENDA?\nS-SIM\t\tN-NÃO");
        }while ((continuar.equals("S"))||(continuar.equals("s")));
       
        
        
    }
    public void Solicitar_Produtos() {
        do {
            JOptionPane.showMessageDialog(null, "SOLICITAÇÃO PARA COMPRA DE PRODUTOS");
        JOptionPane.showMessageDialog(null,"O CÓDIGO DA SOLICITAÇÃO DE COMPRA É "+l);
        nome2[l]=JOptionPane.showInputDialog("INFORME O NOME DO PRODUTO SOLICITADO");
        descricao2[l]=JOptionPane.showInputDialog("INFORME A DESCRIÇÃO DO PRODUTO SOLICITADO");
        qtde_estoque[l]=Integer.parseInt(JOptionPane.showInputDialog("INFORME QUANTIDADE DE PRODUTOS SOLICITADOS"));
        valor_compra[l]=Double.parseDouble(JOptionPane.showInputDialog("INFORME O PREÇO DE COMPRA DO PRODUTO SOLICITADO"));
        fornecedor[i]=JOptionPane.showInputDialog("INFORME O FORNECEDOR DA SOLICITAÇÃO");
        data[j]=JOptionPane.showInputDialog("INFORME A DATA DA SOLICITAÇÃO","dd/mm/aaaa");
        hora[j]=JOptionPane.showInputDialog("INFORME A HORA DA SOLICITAÇÃO","hh:mm");
        valor_total[l] = (valor_compra[l]*qtde_estoque[l]);
        valor_final2=valor_total[l]+valor_final2;
        do{
        forma_pag[l]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A FORMA DE PAGAMENTO: \n 1-DINHEIRO \n2-CHEQUE","Digite 1 para comprar com cartão e 2- para comprar com cheque"));
        switch (forma_pag[l]){
            case 1:
                forma_pag2[l]="DINHEIRO";
                valor_final=(((qtde_venda[i]*valor_venda[i])+valor_final)-((((qtde_venda[i]*valor_venda[i])+valor_final)*10)/100));
                break;
            case 2: 
                forma_pag2[l]="CHEQUE";
                valor_final=(((qtde_venda[i]*valor_venda[i])+valor_final)+((((qtde_venda[i]*valor_venda[i])+valor_final)*10)/100));
                break;
            default:
                escolha=Integer.parseInt(JOptionPane.showInputDialog("CÓDIGO INVALIDO!! DESEJA TENTAR NOVAMENTE? \n1-Sim  |  2-Não"));     
        }
        }while (escolha==1);
        
        continuar=JOptionPane.showInputDialog("DESEJA SOLICITAR OUTRO PRODUTO?\nS-SIM\t\tN-NÃO");
     
            l++;
        }while((continuar.equals("S"))||(continuar.equals("s")));
    }
    
    
    public void Mostrar_Solicitacoes (){
        do{
        escolha=Integer.parseInt(JOptionPane.showInputDialog("DESEJA CONSULTAR APENAS UMA SOLICITAÇÃO OU CONSULTAR TODOS AS SOLICITAÇÕES? \n 1- UMA SOLICITAÇÃO  |2-TODAS AS SOLICITAÇÕES"));
        switch (escolha){
            case 1:
        do{
        i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO DO CADASTRO"));
        if (i>j){
            cont=JOptionPane.showInputDialog("CÓDIGO INVALIDO! DESEJA TENTAR NOVAMENTE? \nS-SIM  N-NÃO");
        }else{
            JOptionPane.showMessageDialog(null,"RELATORIO DE SOLICITAÇÕES DE PRODUTOS "+"\nCÓDIGO DA SOLICITAÇÃO: "+i+"\nNOME DO PRODUTO: "+nome2[i]+"\nDESCRIÇÃO: "+descricao2[i]+"\nFORNECEDOR: "+fornecedor[i]+"\nQUANTIDADE SOLICITADA:"+qtde_estoque[i]+"\nVALOR DE VENDA UNITARIO: "+ valor_compra[i]+"\nDATA: "+data[i]+"\nHORA:"+hora[i]+"\nVALOR TOTAL:"+valor_total[i]);
        }
        }while ((cont.equals("S"))||(cont.equals("s")));
        break;
        
            case 2:
        for (i=0; i==l;i++){
        JOptionPane.showMessageDialog(null,"RELATORIO DE SOLICITAÇÕES DE PRODUTOS "+"\nCÓDIGO DA SOLICITAÇÃO: "+i+"\nNOME DO PRODUTO: "+nome[i]+"\nDESCRIÇÃO: "+descricao[i]+"\nFORNECEDOR: "+fornecedor[i]+"\nQUANTIDADE SOLICITADA:"+qtde_estoque[i]+"\nVALOR DE VENDA UNITARIO: "+ valor_compra[i]+"\nDATA: "+data[i]+"\nHORA:"+hora[i]+"\nVALOR TOTAL:"+valor_total[i]);
        }
        JOptionPane.showMessageDialog(null,"VALOR FINAL DE TODAS AS SOLICITAÇÕES: R$ "+ valor_final2);
            break;
            
            default:
                cont2=JOptionPane.showInputDialog("CÓDIGO INVALIDO!! DESEJA TENTAR NOVAMENTE?\n S-SIM | N- NÃO");
        }
        }while ((cont2.equals("S"))||(cont2.equals("s")));
        JOptionPane.showMessageDialog(null,"BYE!! ");
}
    
    
    
    
}
