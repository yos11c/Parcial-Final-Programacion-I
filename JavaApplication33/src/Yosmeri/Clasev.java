package yosmeri;



import java.util.Scanner;


public class Clasev  {
    private String[] vectorTransacciones;  
    private int indiceVector;
    private String[] vectorTransacciones2;  
    private int indiceVector2;
    Scanner leer = new Scanner(System.in);

     public Clasev(){
        vectorTransacciones= new String[10000];
        this.indiceVector=0;
        vectorTransacciones2= new String[10000];
        this.indiceVector2=0;

     }
 
    public String metodo (String departamento, String municipios, String cabecera){
        
        this.registrarTransaccion("", departamento, municipios, cabecera);
        return "";
    }
    
       private void registrarTransaccion(String x,String departamento, String municipio, String cabecera) {
       
           indiceVector= indiceVector+1;
           indiceVector2= indiceVector2+1;
        vectorTransacciones[indiceVector]="\n"+departamento+" tiene "+municipio+" municipios y la cabecera es "+cabecera+"\n";
    vectorTransacciones2[indiceVector2]=departamento;
       }

    public void mostrarTransacciones(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
    
    void comprobar() {

                   int conta=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngresa el departamento a buscar"); 
        String n=sc.next();
        for (int i=0; i<vectorTransacciones2.length;i++){
            if(vectorTransacciones2[i] == null ? n == null : vectorTransacciones2[i].equals(n)){
            conta=i;}
        }
        if(conta==-1){
        System.out.println("\nIngresa un departamento que exista en la lista");
        
        }else{
        System.out.println("\nEl departamento esta en la posicion "+conta);} 
            
         
            }

   
}