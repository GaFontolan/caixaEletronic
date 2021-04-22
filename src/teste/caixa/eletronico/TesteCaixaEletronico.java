
package teste.caixa.eletronico;
        
import java.util.Scanner;
        
public class TesteCaixaEletronico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        int deposito,saque, saldoatual =0, novosaldo, funcao;  
        String senha;
        long CPF;       
        System.out.println("Bem vindo :D ");
        System.out.println("|==========|");
                    
    System.out.print("Digite seu CPF:");
    CPF = ler.nextLong();
    
    if (CPF == 12345678900L){
            System.out.println("CPF Valido");
    }else{
        System.out.println("CPF Invalido, acesso nao permitido");
        System.exit(0);
    }
       
   while(true){
        System.out.print("Digite sua Senha:");
        senha = ler.next(); 
            if (senha.equals ("01020304")){  
        System.out.println("Senha Correta");
        break;
            }else{ 
  
        System.out.println("Senha incorreta, mais 2 tentativas");
        System.out.print("Digite sua Senha:");
        senha = ler.next();
    
            if (senha.equals ("01020304")){
        System.out.println("Senha Correta");
            break;
            }
        System.out.println("Senha incorreta, mais 1 tentativa");
        System.out.print("Digite sua Senha:");
        senha = ler.next();
       
            if (senha.equals ("01020304")){
        System.out.println("Senha Correta");
            break;
            }
    
        System.out.println("Conta Bloqueada");   
            break;
        }
    }
        System.out.println("        ");
        System.out.println("Menu da Conta");
        System.out.println(" |=========| ");      
        int saldo = 1000,num;
    
        System.out.println("Digite\n 1 para Saldo \n 2 para Deposito \n 3 para Saque");         
        funcao = ler.nextInt();
   
   switch(funcao){
        
        case 1:
            while(true){
            System.out.println("Saldo: " + saldo);
            System.out.println("Digite 0 para realizar uma nova operacao ou 9 sair");
            num = ler.nextInt();
            if (num == 0);
            break;
            }        
   System.out.println("Digite\n1 - para Saldo\n2 - para Deposito\n3 - para Saque");         
   funcao = ler.nextInt();
        
        case 2:
            while(true){
            System.out.println("Digite o valor do deposito: ");
            deposito = ler.nextInt();
            saldoatual = saldo+deposito;
            System.out.println("Saldo: " + saldoatual);
            System.out.println("Digite 0 para realizar uma nova operacao");
            num = ler.nextInt();
            if (num == 0);
            break;
            }
   System.out.println("Digite\n1 - Saldo\n2 -Deposito\n3 - para Saque");         
   funcao = ler.nextInt();
            
        case 3:
            while(true){
            System.out.println("Digite o valor do saque: ");
            saque = ler.nextInt();
            novosaldo = saldoatual - saque;
            System.out.println("Saldo: " + novosaldo);
            System.out.println("Digite 0 para realizar uma nova operacao");
            num = ler.nextInt();
            if (num == 0);
            break;           
            }
    }
    }    
}