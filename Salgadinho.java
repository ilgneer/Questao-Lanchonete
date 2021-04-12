
package lanchonete;


public class Salgadinho extends Prato{
    
    private String massa;

    public Salgadinho(String massa, String molho, String recheio, double valorfinal, double valorunt) {
        super(molho, recheio, valorfinal, valorunt);
        this.massa = massa;
    }

  
    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

}
