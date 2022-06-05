package yosmeri;

import java.util.Scanner;


public class Yosmeri {

    public static void main(String[] args) {
        
        Clasel v = new Clasel();
        Clasev meto=new Clasev();
        int ele;
        int elec;
        Scanner ingresar= new Scanner(System.in);
       int opcion;
         System.out.println("\nBIENVENIDO AL REGISTRO DE DEPARTAMENTO\n");
    System.out.println("\nEscriba el tipo de registro que desea usar, 1 vectores, 2 listas");
    ele = ingresar.nextInt();
      switch(ele) {
            
            case 1:{

               do{
               System.out.println("\n1-Registrar departamento");
               System.out.println("\n2-Resultados");  
               System.out.println("\n3-Posicion");
               System.out.println("\n4-Buscar por inicial");
               System.out.println("\n5-Departamento en opcion par");
               System.out.println("\n6-Salir");
               System.out.println("\nEscriba la opcion a ejecutar correspondiente al numero en la lista");
               elec = ingresar.nextInt();
               
                switch(elec){
               
         case 1: { 
              System.out.println("\nDepartamento");
              String departamento= ingresar.next();
             System.out.println("\nNumero de municipios");
             String municipios= ingresar.next();
             System.out.println("\nCabecera ");
             String cabecera= ingresar.next();
             System.out.print(meto.metodo(departamento,municipios,cabecera));
               break;
         }
                
                case 2: {
            meto.mostrarTransacciones();
                  break;
                }
                
                case 3: {
            meto.comprobar();
    
            break;}}
                
                }  while (elec !=6); 
           
           break;
            }
            case 2:{
    do{

               System.out.println("\n1-Registrar departamento\n");
               System.out.println("\n2-Resultados\n");  
               System.out.println("\n3-Borrar datos\n");
               System.out.println("\n4-Comprobar la existencia de un departamento\n");
               System.out.println("\nEscriba la opcion a ejecutar correspondiente al numero en la lista");
               System.out.println("\n5-Salir");
               opcion = ingresar.nextInt();
               
                switch(opcion){
           
          case 1:
              v.Departamento();
             break;

              case 2:
             v.mostrarTransacciones();
             break; 
               
             case 3:
             v.borrarlista();
             System.out.println("\nLos datos de la lista fueron borrados");
             break;
             
             case 4:
                 
             v.comprobar();

             break;
        
          default:
              System.out.println("\nIngresa una eleccion valida");
             break;
             
       }
                
                 }while(opcion!=5);
    
           break;
           
           }

        default: 
              
              System.out.println("Ingresa una eleccion valida");
       
    }
    
    }}