
package colores.aleatorios;

import java.util.ArrayList;
import java.util.Scanner;


public class ColoresAleatorios {

   
    public static void main(String[] args) {
        int n1; 
        int res;
    Scanner ca=new Scanner(System.in);   
    ArrayList Lista=new ArrayList();
    Generar_Colores n2= new Generar_Colores  (); 
    
    n1=n2.Crear_Numero();
    
    do{
        for (int i = 1; i <= 8; i++) //el <=10 son el numero de veces que te imprimira hnumeros aleatorios
        {n1=n2.Crear_Numero();
        
         if(n1%2==0){
          System.out.println("El numero generado es "+n1);  
          n2.validarColor();
        }
         else
         {
           Lista.add(n1);  
           n2.validarColor();
         }}
     System.out.println("desea continuar 1, 0 para salir");
      res=ca.nextInt();
        }while(res!=0); 
      for (int i=1; i<Lista.size();i--)
      {
          System.out.println(Lista.get(i));
      }
}}
    

