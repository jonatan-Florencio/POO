package exemplos;

import java.util.ArrayList;

public class ProgramaContaBancaria {
 
	   public static void main(String[] args) {
           ContaCorrente cc1 = new ContaCorrente();
           cc1.setBanco("Banco do Brasil");
           cc1.setAgencia(1);
           cc1.setNumero(123);
           cc1.setTitular("Jonatan");
           cc1.setSaldo(100);
           cc1.setLimite(100);
 
           double saldoAtual = cc1.depositar(500);
           System.out.println("Novo Saldo: " + saldoAtual);
           
           if(cc1.sacar(100)) {
               System.out.println("Novo Saldo - Saque: " + cc1.getSaldo());
           } else {
               System.out.println("O valor excede o limite da conta");
           }
           
           ContaPoupanca cp1 = new ContaPoupanca();
           
           cp1.setBanco("Caixa economica");
           cp1.setNumero(321);
           cp1.setTitular("Cabele");
           cp1.setAgencia(1);
           cp1.setSaldo(300);
           
           
           double valor = cp1.depositar(300);
           
           System.out.println("Saldo da poupança do cabele é " + valor);
           
           if(cp1.sacar(300)) {
        	   System.out.println("novo saldo - saque é " + cp1.getSaldo());
           }else {
        	   System.out.println("O valor excede o limite da conta");
         }
           ContaCorrente c1 = new ContaCorrente("bradesco", 3, 122, "marco", 4020, 400);
           ContaCorrente c2 = new ContaCorrente("nubank", 2, 1262, "Sara", 4210, 200);
           ContaCorrente c3 = new ContaCorrente("BB", 4, 1252, "Vitor", 41200, 300);
           ContaCorrente c4 = new ContaCorrente("caixa", 1, 1225, "nayara", 40120, 500);
           ContaCorrente c5 = new ContaCorrente("bradesco", 3, 1232, "nathan", 40420, 100);
           
           ArrayList<ContaCorrente> lista = new ArrayList<>();
           lista.add(c1);
           lista.add(c2);
           lista.add(c3);
           lista.add(c4);
           lista.add(c5);
       }
	
}