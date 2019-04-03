
import java.util.Scanner;


public class ClassePrincipal {
    
    public static void main(String [] args) {
        
       Carro carro = new Carro();
       
       carro.nome = "Fusca";
       carro.marca = "Volkswagem";
       carro.cor = "Azul";
       carro.fabricacao = "1556";
       carro.largura = "1,70 mm";
       carro.peso = "1300KG";
       
       System.out.println ("Nome:" + carro.nome);
       System.out.println ("Marca:" + carro.marca);
       System.out.println ("Cor:" + carro.cor);
       System.out.println ("Fabricacao:" + carro.fabricacao);
       System.out.println ("Largura:" + carro.largura);
       System.out.println ("Peso:" + carro.peso);
    
       Carro brasilia = new Carro () ;
    
     brasilia.nome = "brasilia";
       brasilia.marca = "Volkswagem";
       brasilia.cor = "Azul";
       brasilia.fabricacao = "1973";
       brasilia.largura = "1,50 mm";
       brasilia.peso = "900KG";
      
     System.out.println ("Nome:" + brasilia.nome);
     System.out.println ("Marca:" + brasilia.marca);
     System.out.println ("Cor:" + brasilia.cor);
     System.out.println ("Fabricacao:" + brasilia.fabricacao);
     System.out.println ("Largura:" + brasilia.largura);
     System.out.println ("Peso:" + brasilia.peso);
        Carro carro01 = new Carro ();
        
            Scanner scan1 = new Scanner (System.in) ;
                System.out.print("Nome: ");
                carro01.nome = scan1.next();
                System.out.print("Marca: ");
                     carro01.marca = scan1.next();
                System.out.print("cor: ");
                carro01.cor = scan1.next();
                System.out.print("Fabricacao: ");
                carro01.fabricacao = scan1.next();
                System.out.print("Largura: ");
                carro01.largura = scan1.next();
                System.out.print("Peso: ");
                carro01.peso = scan1.next();



     
  }
}
