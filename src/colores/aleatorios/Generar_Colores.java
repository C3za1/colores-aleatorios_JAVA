
package colores.aleatorios;
import java.util.ArrayList;
import java.util.Random;

public class Generar_Colores 
{
    Random ca=new Random();
     //declaracion de variables
     int numero;
    
    
    public int Crear_Numero()
    { 
        numero=1+(ca.nextInt(7)+1);//el 20 controla el rango de nunmeros de los que apracera
        return numero;   
    }
    
    
     public void validarColor()
     {
        if(numero==1)
        {
            System.out.println("azul");
        }
        if(numero==2)
        {
            System.out.println("verde");
        }
        if(numero==3)
        {
            System.out.println("morado");
        }
        if(numero==4)
        {
            System.out.println("gris");
        }
        if(numero==5){
            System.out.println("rojo");
        }
        if(numero==6)
        {
            System.out.println("rosa");
        }
        if(numero==7)
        {
            System.out.println("blanco");
        }
        if(numero==8)
        {
            System.out.println("negro");
        }
    }
     
}


