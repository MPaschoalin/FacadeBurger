public class Combo {

    private int tipo;
    Burger burger = new Burger("",0.0, 0);
    Bebida bebida = new Bebida("", 0.0, 0);
    Sobremesa sobremesa = new Sobremesa("", 0.0, "");

    @Override
    public String toString() {return Combos(tipo);}
    public String Combos(int tipo){
        if (tipo == 1){
            burger = new Burger("Cria Burger", 15.00, 150 );
            bebida = new Bebida("Refrigerante", 5.00, 500);
            sobremesa = new Sobremesa("MilkShake", 7.00, "medio");
        }
        else if(tipo == 2) {
            burger = new Burger("GigaChad Burger", 20.00, 190 );
            bebida = new Bebida("Refrigerante", 7.00, 700);
            sobremesa = new Sobremesa("MilkShake", 10.00, "grande");
        }

    double Valor = burger.getPreco() + sobremesa.getPreco() + bebida.getPreco();

        return "Voce escolheu:\n"
                +"\nHamburguer: " + burger.getDescricao()
                +"\nValor: R$ " + burger.getPreco()
                +"\nPeso: " + burger.getGramas() + "g\n"

                +"\nBebida: " + bebida.getDescricao()
                +"\nValor: R$ " + bebida.getPreco()
                +"\nTamanho: " + bebida.getMl() + "ml\n"

                +"\nSobremesa: " + sobremesa.getDescricao()
                +"\nValor: R$ " + sobremesa.getPreco()
                +"\nTamanho: " + sobremesa.getTamanho()

                +"\nValor do Combo: R$ " + Valor;
    }


}
