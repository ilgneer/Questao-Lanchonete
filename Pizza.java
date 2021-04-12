//
package lanchonete;


public class Pizza extends Prato {
    
    private String borda;

    public Pizza(String borda, String molho, String recheio, double valorfinal, double valorunt) {
        super(molho, recheio, valorfinal, valorunt);
        this.borda = borda;
    }

  
    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

}
