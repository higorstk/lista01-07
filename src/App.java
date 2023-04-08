import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável
  double lado;
  double area;

//Passo2:Entrada de dados

Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o tamanho do quadrado");
lado = teclado.nextDouble();
  area = (lado * lado)*2;
  
//Passo3:Mostrar resultado
  
System.out.println("O dobro da área do quadrado é:" + area);
 }
}
