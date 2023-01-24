/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rede_de_cinemas;
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class Servicos  {
    
    protected int[] sala = new int[10], data_loc = new int[10], hor_loc = new int[10], tempo_loc = new int[10],forma_pag = new int[10],qtde = new int[10];
    protected final double[] valor_und = new double[10], valor_total = new double[10], valor_hr = new double[10], valor_total1 = new double[10];
    private String continuar;
    protected String [] nome1 = new String[10],filme = new String[10], data = new String[10],hora = new String[10],sessao = new String [10];
    protected int i=1;
    
    public void Vender_Ingresso () {
        do{
            JOptionPane.showMessageDialog(null, "VENDA DE INGRESSOS");
            JOptionPane.showMessageDialog(null,"O CÓDIGO É "+i);
            nome1[i]=JOptionPane.showInputDialog("INSIRA O NOME DO CLIENTE: ");
            filme[i]= JOptionPane.showInputDialog("INSIRA O NOME DO FILME DESEJADO:");
            sessao[i] =JOptionPane.showInputDialog("INFORME O HORARIO DA SESSÃO DESEJADA: ");
            sala[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A SALA QUE SERÁ UTILIZADA"));
            valor_und[i]=Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR UNITARIO DO INGRESSO: "));
            qtde[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE INGRESSOS: "));
            valor_total[i]=valor_und[i]*qtde[i];
            data[i]=JOptionPane.showInputDialog("INFORME A DATA DA VENDA: ");
            hora[i]=JOptionPane.showInputDialog("INFORME A HORA DA VENDA: ");
            i++;
            continuar=JOptionPane.showInputDialog("DESEJA FAZER OUTRA VENDA DE INGRESSOS? \nS-SIM   N-NÃO","Digite S ou N" );
        }while (continuar.equalsIgnoreCase("s"));
    }
        public void Alugar_Sala () {
        do{
            JOptionPane.showMessageDialog(null, "LOCAÇÃO DE SALAS");
            JOptionPane.showMessageDialog(null,"O CÓDIGO É "+i);
            nome1[i]=JOptionPane.showInputDialog("INSIRA O NOME DO CLIENTE: ");
            sala[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A SALA QUE SERÁ UTILIZADA"));
            data_loc[i] = Integer.parseInt(JOptionPane.showInputDialog("INFORME A DATA DA LOCAÇÃO: "));
            hor_loc[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A HORA QUE SERÁ UTILIZADA: "));
            tempo_loc[i]=Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE HORAS QUE SERÁ UTILIZADA "));
            valor_hr[i]=Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DE 1 HORA: "));
            valor_total1[i]=valor_hr[i]*tempo_loc[i];
            data[i]=JOptionPane.showInputDialog("INFORME A DATA DA SOLICITAÇÃO: ");
            hora[i]=JOptionPane.showInputDialog("INFORME A HORA DA SOLICITAÇÃO: ");
            i++;
            continuar=JOptionPane.showInputDialog("DESEJA FAZER OUTRA SOLICITAÇÃO DE LOCAÇÃO? \nS-SIM   N-NÃO","Digite S ou N" );
        }while (continuar.equalsIgnoreCase("s"));
    }
    
        public void Exibir_Venda_Ingresso(){
            do{
                i=Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO DA VENDA DE INGRESSOS: "));
                JOptionPane.showMessageDialog(null,"RELATORIO DE VENDA DE INGRESSOS:"+"\nNOME DO(A) CLIENTE: "+nome1[i]+"\nFILME: "+filme[i]+"\nSESSÃO: "+sessao[i]+"\nSALA: "+sala[i]+"\nVALOR UNITARIO: R$"+ valor_und[i]+"\nQUANTIDADE: R$"+qtde[i]+"\nVALOR TOTAL: R$ "+valor_total[i]+"\nDATA: "+data[i]+"\nHORA: "+hora[i]);
                
                
            continuar=JOptionPane.showInputDialog("DESEJA EXIBIR OUTRO RELATORIO DE VENDA DE INGRESSOS? \nS-SIM   N-NÃO","Digite S ou N" );
        }while (continuar.equalsIgnoreCase("s"));
        }
        
        public void Exibir_Locacao_Sala(){
            do{
                
                JOptionPane.showMessageDialog(null,"RELATORIO DE VENDA DE INGRESSOS:"+"\nNOME DO(A) CLIENTE: "+nome1[i]+"\nSALA"+sala[i]+"\nDATA DA LOCAÇÃO: "+data_loc[i]+"\nHORA DA LOCAÇÃO: "+hor_loc[i]+"\nHORAS QUE SERÁ UTILIZADA: "+ tempo_loc[i]+"\nVALOR/HORA: "+valor_hr[i]+"\nVALOR TOTAL: "+valor_total1[i]+"\nDATA: "+data[i]+"\nHORA: "+hora[i]);
                
                
            continuar=JOptionPane.showInputDialog("DESEJA EXIBIR OUTRO RELATORIO DE LOCAÇÃO DE SALAS? \nS-SIM   N-NÃO","Digite S ou N" );
        }while (continuar.equalsIgnoreCase("s"));
        }
        
    
}

