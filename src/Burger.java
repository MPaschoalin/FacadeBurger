public class Burger extends Produto {

    private int gramas;

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public Burger(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }
}
