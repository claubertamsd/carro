import java.util.Scanner;

public class Carro {

    private Integer anoFabricado;
    private Long numeroChassis;
    public String corCarro;
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private Integer quantidadePortas;
    
   

    public Carro(Integer quantidadePneus) {
         setQuantidadePneus(quantidadePneus);
        
    }
    public Integer getAnoFabricado(){
        return anoFabricado;
    }

    public Integer getQuantidadePneus(){
        return quantidadePneus + 1 ;
    } 

    public String getCorCarro() {
        return corCarro;
    }
    public Integer getQuantidadeParafusosPneus() {
        return quantidadeParafusosPneus;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public Long getNumeroChassis(){
        return numeroChassis;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setAnoFabricado(Integer anoFabricado){
        Scanner ano = new Scanner(System.in);
        System.out.println("Digite o ano de fabricação");
        anoFabricado = ano.nextInt();
        this.anoFabricado = anoFabricado;
    }

    public void setCorCarro(String corCarro){
        Scanner cores = new Scanner(System.in);
        System.out.println("Qual a cor do Carro?");
        corCarro = cores.nextLine(); 
        this.corCarro =  corCarro;                           
    }

    public void setNumeroChassis(Long numeroChassis){
        Scanner chassi = new Scanner(System.in);
        System.out.println("Qual o numero do chassi?");
        numeroChassis = chassi.nextLong();        
        this.numeroChassis = numeroChassis;
    }

    public void  setQuantidadePneus(Integer quantidadePneus){
        Scanner pneus = new Scanner(System.in);
        System.out.println("Quantos pneus o carro tem ?");
        quantidadePneus = pneus.nextInt();
        
        quantidadeParafusosPneus = quantidadePneus * 4;
        Scanner portas = new Scanner(System.in);
        System.out.println("Quantas portas tem?");
        quantidadePortas = portas.nextInt();

        quantidadeCalotas = quantidadePneus;
        this.quantidadePneus = quantidadePneus;

    }

    public void imprimeValores() {
       System.out.println("-----------------------------------------------");
       System.out.println("Quantidade Pneus: " + getQuantidadePneus());
       System.out.println("Quantidade de calotas: " + getQuantidadeCalotas());
       System.out.println("Quantidade de parafusos pneu: " + getQuantidadeParafusosPneus());
       System.out.println("Quantidade de portas: " + getQuantidadePortas());
       System.out.println("Numero de chassis: " + getNumeroChassis());
       System.out.println("Cor do seu carro: "+ getCorCarro());
       System.out.println("Ano fabricado: " + getAnoFabricado());
       System.out.println("--------------------------------------------------");
     }

}
