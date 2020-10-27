/* Programa que identifica um triangulo e o classifica
 */
package amanda_triangulo.java;

import java.util.Scanner;

public class Amanda_trianguloJava {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C;
        
        System.out.println(" Identificador e Diferenciador de triângulo");
        
        System.out.println("Digite o lado A do seu triângulo:");
        A= entrada.nextDouble();
        
        System.out.println("Digite o lado B do seu triângulo:");
        B= entrada.nextDouble();
        
        System.out.println("Digite o lado C do triângulo:");
        C= entrada.nextDouble();
        
        if (A+B>C && A+C>B && B+C>A){
        System.out.println ("Os valores informados formam um triângulo");
        
        if (A==B && A==C && B==C){
        System.out.println ("Esse triângulo é Equilátero");
        
        }else if (A!=B && A!=C && B!=C){
        System.out.println("Esse triângulo è Escaleno");
        
        }else if (A==B && A!=C || A==C && B!=C || A==C && A!=B){
        System.out.println ("Esse triângulo é Isóceles");
        
        }
        
        }else{ 
         System.out.println("Os valores não formam um triângulo");
         
        }}
        
        
    }
    
    
    
 
        
           
       
        
        
           
   
    


        
         
                
        
        
        
    
