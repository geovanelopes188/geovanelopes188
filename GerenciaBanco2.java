/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco2;

import java.util.Scanner;

/**
 * *
 * *@author Geovane Jesus
 */

class Cliente {
private String nome;
private String sobrenome;
private String cpf;
private double saldo;


public Cliente(String nome, String sobrenome, String cpf) {
    this.nome = nome;
    this.nome = sobrenome;
    this.nome = cpf;
    this.saldo = 0.0;
}


public void consultarSaldo()  {
    System.out.println("Seu saldo atual: R$" + saldo);
}
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado com sucesso.");
        }else {
            System.out.println("Saldo insulficiente ou valor do saldo invalido.");
}
    }        
            public void sacar(double valor) {
                saldo -= valor;
                System.out.println("Sauqe de R$" + valor + "realizado com sucesso." );
            }
}
    

            
        
            
    public class GerenciaBanco2 {
       
                public static void main(String[] args)  {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("informe seu por favor:");
                    String nome = scanner.nextLine();
                    System.out.println("informe seu sobre nome por favor:");
                    String sobrenome = scanner.nextLine();
                    System.out.println("informe seu cpf por favor:");
                    String cpf = scanner.nextLine();
                
                    Cliente cliente = new Cliente(nome, sobrenome, cpf);
                    
                    boolean continuar = true;
                    while (continuar) {
                        System.out.println("\n O que deseja:");
                        System.out.println("1 - consultar saldo");
                        System.out.println("2 - Fazer deposito");
                        System.out.println("3 - Fazer saque");
                        System.out.println("4 - encerrar a aplicação\n\n");
                        
                        int escolha = scanner.nextInt();
                        switch (escolha)  {
                            case 1:
                                cliente.consultarSaldo();
                                break;
                            case 2:
                                System.out.println("informe o valor a ser depositado:");
                                double valorDepositado = scanner.nextDouble();
                                cliente.depositar(valorDepositado);
                                break;
                            case 3:
                                System.out.println("informe o valor a ser sacado:");
                                double valorSaque = scanner.nextDouble();
                                cliente.sacar(valorSaque) ;
                                break;
                            case 4:
                                continuar = false;
                                System.out.println("encerrando a aplicação. ate breve!");
                                break;
                            default:
                                System.out.println("opcão invalida, tente novamente.");
                                break;
                                        
                                        
                                
                               
                        }
                    }
                    scanner.close();
                }
            }
