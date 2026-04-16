public class Eletronico  extends Produto{
    public Eletronico(String nome, double preco, String categoria){
        super(nome, preco, categoria);
    }

    public double calcularDesconto(){
        double desconto = 0.95;
        return getPreco() * desconto;
    }
}
