import java.util.Scanner;

public class ClasseMain {
    public static void main(String[] args){
        Carro carro = new Carro (4);
        carro.setNumeroChassis(carro.getNumeroChassis());
        carro.setCorCarro(carro.getCorCarro());    
        carro.setAnoFabricado(carro.getAnoFabricado()); 
        carro.imprimeValores();

    }
}
