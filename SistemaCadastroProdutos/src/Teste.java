import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Produto> estoque = new ArrayList<>();

        Produto p1 = new Livro("Metamorfose", 49.99, "Ficcao Cientifica");
        Produto p2 = new Eletronico("Carregador", 30, "Celular");
        Produto p3 = new Alimento("Macarrao", 6.99, "Massa");
        Produto p4 = new Livro("Admiravel Mundo Novo", 79.99, "Ficcao Cientifica");
        Produto p5 = new Eletronico("Notebook Dell Latitude E5451", 2000, "Notebook");

        estoque.add(p1);
        estoque.add(p2);
        estoque.add(p3);
        estoque.add(p4);
        estoque.add(p5);

        for(Produto p:estoque){
            System.out.println(p.exibirInformacoes());
        }
    }
}
