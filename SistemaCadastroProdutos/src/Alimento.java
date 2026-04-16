public class Alimento extends Produto{
    public Alimento(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    @Override
    public double calcularDesconto(){
        double desconto = 0.98;
        return getPreco() * desconto;
    }
}
