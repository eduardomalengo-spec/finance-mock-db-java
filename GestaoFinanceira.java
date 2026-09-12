import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Funcionario {
	String nome;
    double salario;
   
    public Funcionario() {};
   
    public Funcionario(String nome, double salario) {
    	this.nome = nome;
        this.salario = salario;
    }
    
    	public static String nome() {
        	return " Eduardo ";
        }
        public static double salario() {
        	return 1590.87;
        }
}

public class GestaoFinanceira {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        List<Funcionario> fun = new ArrayList<>();
       
        String nome = "";
        double salario = 0;
       
        while(true) {
        	System.out.println("[1] - FUNCIONARIO ");
            System.out.println("[2] - SALARIO ");
            System.out.print("[0] - Sair ");
            int escolha = sc.nextInt();
            sc.nextLine();
           
            switch (escolha) {
            	case 1:
                	nome = Funcionario.nome();
                    break;
                case 2:
                	salario = Funcionario.salario();
                    break;
                case 0:
                	return;
                default:
                	System.out.println("[ERROR...]");
            }
           
            Funcionario funst = new Funcionario(nome, salario);
           
            fun.add(funst);
            
            System.out.println("======================");
            System.out.println("       RELATORIO      ");
            System.out.println("======================");
            System.out.println("| NOME: " + funst.nome + " | ");
            System.out.println("| SALARIO: " + funst.salario + " | ");
        }
    }
}