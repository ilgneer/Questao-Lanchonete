
package lanchonete;


public class Prato {
    private String molho;
    private String recheio;
    private double valorfinal;
    private double valorunt;

    public Prato(String molho, String recheio, double valorfinal, double valorunt) {
        this.molho = molho;
        this.recheio = recheio;
        this.valorfinal = valorfinal;
        this.valorunt = valorunt;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    public void calcularPreco(int quantidade){
        valorfinal = quantidade * valorunt;
        System.out.println("O valor total do seu pedido é: R$ " + valorfinal);
        System.out.println("");
    }
}
