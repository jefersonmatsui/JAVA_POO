package aula04;
public class Aula04 {
    public static void main(String[] args) {
     Caneta c1 = new Caneta("Bic", "Amarelo", 0.4f);
     c1.setModelo("BIC");
     //c1.modelo = "BIC";
             
     //c1.setPonta(0.5f);
     //c1.ponta = 0.5f
             
     c1.status();
     //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    
    
     Caneta c2;
        c2 = new Caneta("Pentel", "Laranja", 1.5f);
     c2.status();
    }
}
