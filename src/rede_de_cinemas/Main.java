/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rede_de_cinemas;

import javax.swing.JOptionPane;

/**
 *
 * @author 241733
 */
public class Main {
    public static int menu,menu1,menu2,menu3,menu4,menu5,menu6,menu7;
    public static String cont,cont6,decisao;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clientes cliente = new Clientes();
        Funcionario funcionario = new Funcionario();
        Fornecedor fornecedor = new Fornecedor();
        Distribuidora_de_Filmes distribuidora = new Distribuidora_de_Filmes();
        Produto produto = new Produto ();
        Servicos servicos = new Servicos();
        Filmes filmes = new Filmes ();
        
        
        do{
            JOptionPane.showMessageDialog(null,"BEM VINDO AO SISTEMA DA REDE DE CINEMA CINEMIX");
            menu=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO \n1-CLIENTE   2-FUNCIONÁRIO    3-FORNECEDOR    4-DISTRIBUIDORA DE FILMES   5-PRODUTOS   6-SERVIÇOS     7-FILMES"));
            switch (menu){
                case 1:
                    do{
                    JOptionPane.showMessageDialog(null,"CLIENTE");
                    menu1=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-CADASTRO     2-MODIFICAR CADASTRO    3-CONSULTAR CADASTRO "));
                    
                    switch (menu1){
                        case 1:
                            cliente.Cadastrar_Clientes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU CLIENTES?\n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            cliente.Modificar_Clientes();
                             cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU CLIENTES?\n S-SIM      N-NÃO ");
                        break;
                        case 3:
                            cliente.Consultar_Clientes();
                             cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU CLIENTES?\n S-SIM      N-NÃO ");
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU CLIENTES?\n S-SIM      N-NÃO ");
                        break;
                    }
                    
                             
                    
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                break;
                    
                case 2:
                    do{
                    JOptionPane.showMessageDialog(null,"FUNCIONÁRIOS");
                    menu2=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-CADASTRO     2-MODIFICAR CADASTRO    3-CONSULTAR CADASTRO "));
                    
                    switch(menu2){
                        case 1:
                            funcionario.Cadastrar_Funcionario();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FUNCIONARIO?\n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            funcionario.Modificar_Funcionario();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FUNCIONARIO?\n S-SIM      N-NÃO ");
                            break;
                        case 3:
                            funcionario.Consultar_Funcionario();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FUNCIONARIO?\n S-SIM      N-NÃO ");
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FUNCIONARIO?\n S-SIM      N-NÃO ");
                        break;
                    }
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                break;
                
                case 3:
                    do{ 
                    JOptionPane.showMessageDialog(null,"FORNECEDORES");
                    menu3=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-CADASTRO     2-MODIFICAR CADASTRO    3-CONSULTAR CADASTRO "));
                    
                    switch(menu3){
                        case 1:
                            fornecedor.Cadastrar_Fornecedor();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FORNECEDORES \n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            fornecedor.Modificar_Fornecedor();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FORNECEDORES?\n S-SIM      N-NÃO ");
                            break;
                        case 3:
                            fornecedor.Exibir_Cadastro();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FORNECEDORES?\n S-SIM      N-NÃO ");
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FORNECEDOR?\n S-SIM      N-NÃO ");
                        break;
                    }
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                         
                    break;
                    
                
                case 4:
                    do{
                     JOptionPane.showMessageDialog(null,"DISTRIBUIDORA DE FILMES");
                    menu4=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-CADASTRO     2-MODIFICAR CADASTRO    3-CONSULTAR CADASTRO "));
                   
                    switch(menu4){
                        case 1:
                            distribuidora.Cadastrar_Distribuidora_de_Filmes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU DISTRUBUIDORA DE FILMES? \n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            distribuidora.Modificar_Distribuidora_de_Filmes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU DISTRUBUIDORA DE FILMES? \n S-SIM      N-NÃO ");
                            break;
                        case 3:
                            distribuidora.Exibir_Distribuidora_de_Filmes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU DISTRUBUIDORA DE FILMES? \n S-SIM      N-NÃO ");
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU DISTRUBUIDORA DE FILMES? \n S-SIM      N-NÃO ");
                        break;
                }
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                break;
                
                
                case 5:
                    do{
                     JOptionPane.showMessageDialog(null,"PRODUTOS");
                    menu5=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-CADASTRAR     2-CONSULTAR SOLICITAÇÕES   3-VENDER    4-SOLICITAR "));
                    
                    switch(menu5){
                        case 1:
                            produto.Cadastrar_Produto();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRODUTOS? \n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            produto.Mostrar_Solicitacoes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRODUTOS ? \n S-SIM      N-NÃO ");
                            break;
                        case 3:
                            produto.Vender_Produto();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRODUTOS? \n S-SIM      N-NÃO ");
                        break;
                        case 4:
                            produto.Solicitar_Produtos();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRODUTOS? \n S-SIM      N-NÃO ");
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRODUTOS? \n S-SIM      N-NÃO ");
                        break;
                }
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                break;
                
                case 6:
                    do{
                    JOptionPane.showMessageDialog(null,"SERVIÇOS");
                    menu6=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-VENDER INGRESSO      2-ALUGAR SALA"));
                    
                    switch(menu6){
                        case 1:
                            servicos.Vender_Ingresso();
                            decisao=JOptionPane.showInputDialog("DESEJA VER O RELATORIO DA VENDA?   S- SIM      N-NÃO");
                            if(decisao.equalsIgnoreCase("s")){
                            servicos.Exibir_Venda_Ingresso();
                            }
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU SERVIÇOS? \n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            servicos.Alugar_Sala();
                            decisao=JOptionPane.showInputDialog("DESEJA VER O RELATORIO DA LOCAÇÃO?   S- SIM      N-NÃO");
                            if(decisao.equalsIgnoreCase("s")){
                            servicos.Alugar_Sala();
                            }
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU SERVIÇOS? \n S-SIM      N-NÃO ");
                            break;
                        
                        
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                        break;
                    }
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                
                    break;
                    
                case 7:
                    do{
                     JOptionPane.showMessageDialog(null,"FILMES");
                   menu7=Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA A OPÇÃO QUE DESEJA:\n1-CADASTRAR     2-CONSULTAR DADOS    3-EXIBIÇÃO DE FILMES "));
                    
                    switch(menu7){
                        case 1:
                            filmes.Cadastro_de_Filmes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FILMES? \n S-SIM      N-NÃO ");
                        break;
                        case 2:
                            filmes.Consultar_Filme();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FILMES? \n S-SIM      N-NÃO ");
                            break;
                        case 3:
                            filmes.Exibição_Filmes();
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FILMES? \n S-SIM      N-NÃO ");
                        break;
                        default:
                            JOptionPane.showMessageDialog(null, "CÓDIGO INVALIDO");
                            cont6=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU FILMES? \n S-SIM      N-NÃO ");
                        break;
                }
                    }while(cont6.equalsIgnoreCase("s"));
                    cont=JOptionPane.showInputDialog("DESEJA VOLTAR AO MENU PRINCIPAL?\n S-SIM  N-NÃO");
                break;
                    
        }
       
    
        }while ((cont.equals("S"))||(cont.equals("s")));
        JOptionPane.showMessageDialog(null,"OBRIGADA!!");
    }
}