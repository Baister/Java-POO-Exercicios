public class Livro extends Produto {
    public Livro(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    public double calcularDesconto(){
        double desconto = 0.9; //Desconto de 10%
        return getPreco() * desconto;
    }
}
