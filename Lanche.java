
package lanchonete;


public class Lanche extends Prato {
    private String pão;

    public Lanche(String pão, String molho, String recheio, double valorfinal, double valorunt) {
        super(molho, recheio, valorfinal, valorunt);
        this.pão = pão;
    }

    public String getPão() {
        return pão;
    }

    public void setPão(String pão) {
        this.pão = pão;
    }
}
