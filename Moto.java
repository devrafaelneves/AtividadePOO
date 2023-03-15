
public class Moto {
    public static final String Dono = null;
    String modelo;
    String marca; 
    String cor;
    int ano;
    boolean vendida;
    boolean nova;


    void venda(){

        if (vendida){
            System.out.println("vendida");
            return;
        }
        else{
            System.out.println("nao vendida");
                        
        }
            
    }

        void zero(){ 
        if (nova){
            System.out.println("zerinha");
            return;
        }
        else{
            System.out.println("usada");
                        
        }

     }
        String resumoMotoca(){
            return modelo +" "+ marca +"  "+ ano;
        } 
        
    Dono possuidor = new Dono();
}
