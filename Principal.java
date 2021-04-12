package lanchonete;

public class Principal {

    public static void main(String[] args) {
        //Lanche 1
        Lanche l1 = new Lanche("Pão", "Sem Molho", "Ovo", 0, 4.00);
        l1.calcularPreco(1);

        //Lanche 2
        Lanche l2 = new Lanche("Pão frânces", "Ketchup", "Presunto", 0, 4.00);
        l2.calcularPreco(2);

        //Lanche 3
        Lanche l3 = new Lanche("Pão fina", "Maionese", "Queijo", 0, 4.00);
        l3.calcularPreco(4);

        //Pizza 1
        Pizza p1 = new Pizza("Catupiry", "Maionese", "Calabresa", 0, 20.00);
        p1.calcularPreco(1);

        //Pizza 2
        Pizza p2 = new Pizza("Requeijão", "Maionese", "Mussarela", 0, 20.00);
        p2.calcularPreco(2);

        //Pizza 3
        Pizza p3 = new Pizza("Catupiry", "Ketchup", "Carne de Sol", 0, 20.00);
        p3.calcularPreco(1);

        //Salgadinho 1
        Salgadinho s1 = new Salgadinho("Trigo", "Maionese", "Queijo", 0, 2.00);
        s1.calcularPreco(1);
        
        //Salgadinho 2
        Salgadinho s2 = new Salgadinho("Trigo", "Maionese", "Presunto", 0, 2.00);
        s2.calcularPreco(2);
        
        //Salgadinho 3
       Salgadinho s3 = new Salgadinho("Trigo", "Maionese", "Queijo & Presunto", 0, 2.00);
       s3.calcularPreco(1);

    }

}
