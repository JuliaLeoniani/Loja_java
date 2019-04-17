
import java.util.Scanner;


public class ClassePrincipal {
    
    public static void main(String [] args) {
        
       Carro carro01 = new Carro();
       
       Scanner scan = new Scanner (System.in)  
              
       System.out.print("Nome: ");
       carro01.nome = scan.next();
       System.out.print("Marca: ");
       carro01.marca = scan.next();
       System.out.print("cor: ");
       carro01.cor = scan.next();
       System.out.print("Fabricacao: ");
       carro01.fabricacao = scan.next();
       System.out.print("Largura: ");
       carro01.largura = scan.next();
       System.out.print("Peso: ");
       carro01.peso = scan.next();
       
       System.out.println ("Nome:" + carro01.nome);
       System.out.println ("Marca:" + carro01.marca);
       System.out.println ("Cor:" + carro01.cor);
       System.out.println ("Fabricacao:" + carro01.fabricacao);
       System.out.println ("Largura:" + carro01.largura);
       System.out.println ("Peso:" + carro01.peso);
    
       Carro carro02 = new Carro () ;
       System.out.print("Nome: ");
       carro02.nome = scan.next();
       System.out.print("Marca: ");
       carro02.marca = scan.next();
       System.out.print("cor: ");
       carro02.cor = scan.next();
       System.out.print("Fabricacao: ");
       carro02.fabricacao = scan.next();
       System.out.print("Largura: ");
       carro02.largura = scan.next();
       System.out.print("Peso: ");
       carro02.peso = scan.next();
     
     System.out.println ("Nome:" + carro02.nome);
     System.out.println ("Marca:" + carro02.marca);
     System.out.println ("Cor:" + carro02.cor);
     System.out.println ("Fabricacao:" + carro02.fabricacao);
     System.out.println ("Largura:" + carro02.largura);
     System.out.println ("Peso:" + carro02.peso);
     


     
  }
}
