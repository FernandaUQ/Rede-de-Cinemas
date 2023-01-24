/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rede_de_cinemas;

import javax.swing.JOptionPane;

/**
 * @author Lenita
 */
public class Funcionario extends Pessoa_Fisica {
    public int i = 1000;
    public int k;
    public String continua, modi;
    protected String[] cargo = new String[10000];
    protected long[] ctps = new long[10000];
    protected double[] salario_hora = new double[10000];
    protected double[] salario = new double[10000];
    protected int[] horas_trab = new int[10000];


    public void Cadastrar_Funcionario() {
        do {
            JOptionPane.showMessageDialog(null, "A MATRICULA DO FUNCIONÁRIO É: " + i);
            nome[i] = JOptionPane.showInputDialog("INFORME O NOME DO FUNCIONÁRIO:");
            rg[i] = Integer.parseInt(JOptionPane.showInputDialog("INFORME O RG DO FUNCIONÁRIO"));
            cpf[i] = Long.parseLong(JOptionPane.showInputDialog("INFORME O CPF DO FUNCIONÁRIO"));

            sexo[i] = JOptionPane.showInputDialog("INFORME O SEXO DO FUNCIONARIO\nF-FEMININO  M-MASCULINO", "digite F para Feminino ou M para Masculino");
            if (sexo[i].equalsIgnoreCase("F")) {
                sexo[i] = "Feminino";
            } else if (sexo[i].equalsIgnoreCase("M")) {
                sexo[i] = "Masculino";
            }
            data_nasc[i] = JOptionPane.showInputDialog("INFORME A DATA DE NASCIMENTO DO FUNCIONÁRIO");
            endereco[i] = JOptionPane.showInputDialog("INFORME O ENDERECO DO FUNCIONÁRIO");
            telefone[i] = Long.parseLong(JOptionPane.showInputDialog("INFORME O TELEFONE DO FUNCIONÁRIO"));
            cidade[i] = JOptionPane.showInputDialog("INFORME A CIDADE DO FUNCIONÁRIO");
            uf[i] = JOptionPane.showInputDialog("INFORME A UF DO FUNCIONÁRIO:");
            cargo[i] = JOptionPane.showInputDialog("INFORME O CARGO DO FUNCIONÁRIO:");
            ctps[i] = Long.parseLong(JOptionPane.showInputDialog("INFORME O NÚMERO DA CTPS DO FUNCIONÁRIO"));
            salario_hora[i] = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DO SALÁRIO POR HORA DO FUNCIONÁRIO"));
            horas_trab[i] = Integer.parseInt(JOptionPane.showInputDialog("INFORME QUANTIDADE DE HORAS TRABALHADAS PELO FUNCIONÁRIO"));
            salario[i] = (salario_hora[i] * horas_trab[i]);
            i++;
            continua = JOptionPane.showInputDialog("DESEJA CADASTRAR OUTRO FUNCIONÁRIO?\nS-Sim    N-Não");
        } while ((continua.equals("S")) || (continua.equals("s")));
    }

    public void Consultar_Funcionario() {
        do {
            JOptionPane.showMessageDialog(null, "CONSULTA DE CADASTRO DE FUNCIONÁRIO");
            i = Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO DO FUNCIONÁRIO:"));
            if ((i >= 1000) || (i <= 1010)) {
                JOptionPane.showMessageDialog(null, "\t\tDADOS DO FUNCIONÁRIO " + "\n NOME:" + nome[i] + "\n RG: " + rg[i] + "\n CPF" + cpf[i] + "\nSEXO:" + sexo[i] + "\nDATA DE NASCIMENTO:" + data_nasc[i] + "\nTELEFONE:" + telefone[i] + "\nENDEREÇO:" + endereco[i] + "\nCIDADE:" + cidade[i] + "\nUF:" + uf[i] + "\nCTPS:" + ctps[i] + "\nCARGO:" + cargo[i] + "\nQUANTIDADE DE HORAS TRABALHADAS: " + horas_trab[i] + "\nVALOR DO SALARIO POR HORA: R$" + salario_hora[i] + "\nSALÁRIO TOTAL: R$ " + salario[i]);
            } else {
                continua = JOptionPane.showInputDialog("MATRICULA INVÁLIDA!!\nDESEJA TENTAR NOVAMENTE?\nS-SIM\t\tN-Nâo");
            }
            continua = JOptionPane.showInputDialog("DESEJA CONSULTAR OUTRO CADASTRO DE FUNCIONÁRIO?\nS-Sim    N-Não");

        } while ((continua.equals("s")) || (continua.equals("S")));
    }

    public void Modificar_Funcionario() {
        do {
            JOptionPane.showMessageDialog(null, "MODIFICAÇÃO CADASTRAL DE FUNCIONÁRIO");
            i = Integer.parseInt(JOptionPane.showInputDialog("INFORME O CÓDIGO CADASTRAL DO FUNCIONÁRIO"));
            if ((i >= 1000) || (i <= 1010)) {
                do {
                    k = Integer.parseInt(JOptionPane.showInputDialog("QUAL DADO DESEJA MODIFICAR?\n-1TELEFONE\n2-ENDEREÇO\n3-CIDADE\n4-UF\n5-CARGO \n6-SALÁRIO POR HORA"));
                    switch (k) {
                        case 1:
                            telefone[i] = Long.parseLong(JOptionPane.showInputDialog("INFORME O NOVO TELEFONE DO FUNCIONÁRIO"));
                            break;
                        case 2:
                            endereco[i] = JOptionPane.showInputDialog("INFORME O NOVO ENDERECO DO FUNCIONÁRIO");
                            break;
                        case 3:
                            cidade[i] = JOptionPane.showInputDialog("INFORME A NOVA CIDADE DO FUNCIONÁRIO");
                            break;
                        case 4:
                            uf[i] = JOptionPane.showInputDialog("INFORME A NOVA UF DO FUNCIONÁRIO");
                            break;
                        case 5:
                            cargo[i] = JOptionPane.showInputDialog("INFORME O NOVO CARGO DO FUNCIONÁRIO:");
                            break;
                        case 6:
                            salario_hora[i] = Double.parseDouble(JOptionPane.showInputDialog("INFORME O NOVO VALOR DO SALÁRIO POR HORA DO FUNCIONÁRIO"));
                            salario[i] = (salario_hora[i] * horas_trab[i]);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
                            break;

                    }
                    modi = JOptionPane.showInputDialog("DESEJA MODIFICAR OUTRO DADO NESTE CADASTRO?\nS-Sim    N=Não");
                } while ((modi.equals("s")) || (modi.equals("S")));

            } else {
                continua = JOptionPane.showInputDialog(null, "CÓDIGO INVALIDO!DESEJA TENTAR NOVAMENTE?\nS-Sim   N-Não");
            }
            continua = JOptionPane.showInputDialog("DESEJA MODIFICAR OUTRO CADASTRO?\nS-Sim   N-Não");

        } while ((continua.equals("S")) || (continua.equals("s")));
    }
}