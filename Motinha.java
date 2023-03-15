public class Motinha {
        public static void main(String[] args) {
    
            System.out.println("Sistema de vendas");
        
        Moto cgzinha = new Moto();
        cgzinha.ano = 1998;
        cgzinha.cor = "purple";
        cgzinha.marca = "honda";
        cgzinha.modelo = "start";
    
        System.out.println("ta dando certo");
    
        cgzinha.possuidor.nome = "Rafael";
    
        System.out.println(cgzinha.possuidor.nome);
    
        cgzinha.venda(); //função com retorno
        cgzinha.zero();
        // uno.ligar();
    
        System.out.println(cgzinha.resumoMotoca()); // função sem retorno
    
    
    //Se colocar esse uno.ligar duas vezes seguidas, vai executar só uma por já ter ligado
    
        }
    }
    

