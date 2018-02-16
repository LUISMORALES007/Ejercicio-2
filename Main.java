
import java.util.Scanner;

public class Main{


          public static void main(String[] arg){


                 System.out.println("Calcula  el Area y Perimetro");
	int opcion;
	float lado1;
	float resultadoArea;
	float resultadoPerimetro;
	Scanner teclado=new Scanner(System.in);
 
 
 
                    do{
                    
                   
                    System.out.println("1.-Cuadrado");    	
                    System.out.println("2.-Circulo");
                    System.out.println("3.-Salir");
                    opcion=teclado.nextInt();
 
                         if(opcion==1){
                             System.out.println("Ingrese la medida de una lado");
                             lado1=teclado.nextFloat();
                             resultadoArea=(lado1*lado1);
                             resultadoPerimetro=(lado1*4);
                             System.out.println("El area es: "+resultadoArea+" "+ " El perimetro : "+resultadoPerimetro);
                            }

                             if(opcion==2){
                             float pi=(float) 3.1416;
                             float diametro;
                             float radio;
                             System.out.println("Ingrese el diametro del circulo");
                             diametro=teclado.nextFloat();
                             System.out.println("Ingrese el radio del circulo");
                             radio=teclado.nextFloat();
 
                       resultadoPerimetro=(pi*diametro);
                       resultadoArea=(pi*(radio*radio));
 
                              System.out.println("El Area es: "+resultadoArea + " El Periemtro es: "+resultadoPerimetro);
                              System.out.println("");
}
 
 
}while(opcion!=3);

 
               
                 





           }



}