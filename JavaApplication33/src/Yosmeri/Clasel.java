package yosmeri;

import java.util.ArrayList;
import java.util.Scanner;

public class Clasel {
 

   ArrayList<Claselh> lista = new ArrayList();
   Scanner ingresar= new Scanner(System.in);
   
   public void Departamento(){
  System.out.println("Nombre del departamento");
  String nombre = ingresar.next();
     System.out.println("Numero de municipios");
      String municipios = ingresar.next();
     System.out.println("Cabecera");
      String cabecera = ingresar.next();
     Claselh clase = new Claselh();
     clase.setNombre(nombre);
     clase.setMunicipios(municipios);
     clase.setCabecera(cabecera);

     lista.add(clase);
     
   }
   
    public void mostrarTransacciones(){
   
      for(int i=0;i<lista.size();i++){
          System.out.println("DATOS DE LOS DEPARTAMENTOS GUARDADOS\n");
      
          System.out.println("Nombre: "+lista.get(i).getNombre()+"\n");
          System.out.println("Aleas: "+lista.get(i).getMunicipios()+"\n");
          System.out.println("Codigo: "+lista.get(i).getCabecera()+"\n");

      }
      

   }
    
  
   public void borrarlista(){
      lista.clear();
   }

    void comprobar() {
         
      
      for(int i=0;i<lista.size();i++){
          
          System.out.println("Ingrese la busqueda "); 
          String busqueda = ingresar.next();
          boolean existe = lista.get(i).getNombre().contains(busqueda); 
          if (existe){
        System.out.println("El elemento SI existe");
        }else{
        System.out.println("El elemento NO existe");}
      }

     }
   
}