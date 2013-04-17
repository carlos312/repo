/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package correcciónexamen;

/**
 *
 * @author Carlos
 */
public class CorrecciónExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pintor pintor1=new Pintor(" ", " ");
        Copia copia1=new Copia(" ", " ", " ", pintor1);
        copia1.vyb("enbidia");
        //hola mundo!
    }
}
class Pintor{
    
    private String nombreCompleto;
    private String lugarNacimiento;

    public Pintor(String nombreCompleto, String lugarNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.lugarNacimiento = lugarNacimiento;
    }
    
    
    
    
    public boolean compruebaApellido(String nape){
        
        //nombreCompleto.indexOf(' ');
        String apellido = "";
        
        for(int i=nombreCompleto.indexOf(' ')+1; nombreCompleto.charAt(i)!=' ';i++){
            
            apellido=apellido+nombreCompleto.charAt(i);
            //System.out.print(nombreCompleto.charAt(i));
        }
        
        
        
        if(nape.equals(apellido)){
            
            return true;
        }
        else{
            return false;
        }
        
        }
    
        public void mostrar(){

            System.out.println("Nombre del pintor "+nombreCompleto+". Su lugar de nacimiento es: "+lugarNacimiento);
                }
    }
    
    
    
class Obra{
    
    protected String nombreObra;
    protected String año;
    protected Pintor p;
    protected static int numObra=0;

    public Obra(String nombreObra, String año, Pintor p) {
        this.nombreObra = nombreObra;
        this.año = año;
        this.p=p;
        numObra++;
    }
   
     /*public Obra(String nombreObra, String año, String nc,String ln) {
        this.nombreObra = nombreObra;
        this.año = año;
        this.p=new Pintor(nc,ln);
    }*/
    
    public void estilo(String estilo){
        switch(estilo){
            case "Renacimiento": 
                System.out.println("Pertenece al siglo XV");
                break;
            case "Manierismo":
                System.out.println("Pertenece al siglo XVI");
                break;
            case "Barroco":
                System.out.println("Pertenece a los siglos XVII o XVIII");
                break;
            case"Romanticismo":
                System.out.println("Pertenece al siglo XIX");
                break;
            case "Realismo":
                System.out.println("Pertenece al siglo XIX");
                break;
            case "Impresionismo":
                System.out.println("Pertenece al siglo XIX");
                break;
            default:
                System.out.println("No catalogado");
                
                
        }
        
        
        
        
       /* if(estilo=="Renacimiento"){
            System.out.println("Pertenece al siglo XV");
        }
        else{
            if(estilo=="Manierismo"){
                System.out.println("Pertenece al siglo XVI");
            }
            else{
                if(estilo=="Barroco"){
                    System.out.println("Pertenece a los siglos XVII o XVIII");
                }
                else{
                    if((estilo=="Romanticismo")||(estilo=="Realismo")||(estilo=="Impresionimo")){
                        System.out.println("Pertenece al siglo XIX");
                    }
                    else{
                        System.out.println("No catalogado");
                    }
                }
            }
        }*/
        
    }
    
    public void mostrar()
    {
        System.out.println("Nombre de la obra: "+nombreObra+" Año de finalización: "
                +año+" Autor: "+p+" Número total de obras de la galería"+numObra);
        
    }
    
}
class Copia extends Obra{

    public String codigoCopia;
    public String expli;
    public Copia(String codigoCopia, String nombreObra, String año, Pintor p) {
        super(nombreObra, año, p);
        Integer.toString(numObra);
        codigoCopia =año.concat("numObra");
    }

   public static int getNumObra() {
        return numObra;
    } 
   
   
   public void vyb(String expli){
       String cad2=" ";
       for(int i=0;i<expli.length();i++){
           
           
           cad2=cad2+expli.charAt(i);
            
           
           if ( (expli.charAt(i)=='m')&&(expli.charAt(i+1)=='v') ){
               
              
               
               cad2=cad2+'b';
             
                 
             i++;
           }
           else{
               if((expli.charAt(i)=='n')&& (expli.charAt(i+1)=='b')){
                   
                   
                   cad2=cad2+'v';
                   i++;
                   
                 
               }
                              
                   
               
           }
           
           
           
           //for(int i=0;i<cad2.length()-1;i++){
                
           }
           System.out.println(" "+cad2);
           
           
       }
     public void mostrar(){
       
       
       System.out.println("Nombre de la obra: "+nombreObra+" Año de finalización: "
                          +año+" Autor: "+p+" Número total de obras de la galería"+numObra+
                            " Código de la copia es:"+codigoCopia+" Expliación");
               
       
                
        
   }
  
   }
   



    
    
    


