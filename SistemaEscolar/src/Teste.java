import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Aluno("Guilherme", 20, 98392);
        Pessoa p2 = new Aluno("Murilo", 23, 213123);
        Pessoa p3 = new Professor("Rafael", 30, "Matematica");
        Pessoa p4 = new Professor("Gustavo", 32, "Portugues");
        Pessoa p5 = new Diretor("Raimundo", 66, 10);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        for(Pessoa p:pessoas){
            System.out.println(p.apresentar());
        }
    }
}
