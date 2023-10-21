import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n1, quadrado, i, j, e, ast, ast2;
    
  System.out.println("ATIVIDADE 1");
    System.out.println("Escolha um número para que mostre ele indo até o 0 (POSITIVO OU NEGATIVO): ");
    n1 = scan.nextInt();
    
    System.out.print("\n");

      if(n1>0){
        while(n1>0){
          System.out.print(n1+", " );
          n1--;
        }
      }
      if(n1<0){
        while(n1<0){
          System.out.print(n1+", ");
          n1++;
        }
      }
        if(n1 == 0){
          System.out.print("0. \n");
    }

    
  System.out.println("\n ATIVIDADE 2");
    
    System.out.println("Qual o tamanho do quadrado? (LIMITE DE 1 A 10)");
      quadrado = scan.nextInt();
      
      if(quadrado<=10 && quadrado>0){

        System.out.print("\n LETRA A \n \n");
        
        for(i=0; i<quadrado; i++){
          for(j=0; j<quadrado; j++){
          System.out.print("* ");
          }
          System.out.print("\n");
        }
  
        System.out.print("\n LETRA B \n \n");
  
  
        for(i=0; i<quadrado; i++){
          for(j=0; j<=i; j++){
            System.out.print("* ");
          }
          System.out.print("\n");
  
        }
        
        System.out.print("\n LETRA C \n \n");
      
        for(i=0; i<quadrado; i++){
          for(j=0; j<(quadrado-i); j++){
            System.out.print("* ");
          }
          System.out.print("\n");
          
        }
      }
      else{
        System.out.println("Escolha um número de 1 a 10");
    }

    System.out.print("\n DESAFIO DOS ASTERISTICOS INVERTIDOS \n \n");

    
      System.out.println("Escolha o numero de asteristicos(LIMITE 1 A 10)");
    
      ast = scan.nextInt();
      ast2= ast;
    
      if(quadrado<=10 && quadrado>0){
        for(i=1; i<=ast; i++){
          for(e=ast2--; e>1; e--){
            System.out.print("  ");
          }
          for(j=1; j<=i; j++){
          System.out.print("* ");
        }
          System.out.println();
        }
        System.out.print("\n");
    
        for(i=0; i<ast; i++){
          for(e=0; e<i; e++){
            System.out.print("  ");
          }
          for(j=0; j<(ast)-i; j++){
          System.out.print("* ");
        }
          System.out.println();
        }
      }
      
    else{
        System.out.println("Escolha um número de 1 a 10");
    }
    
  }
}