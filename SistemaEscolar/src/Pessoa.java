public abstract class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){return nome;}
    public int getIdade(){return idade;}

    public boolean setNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("Nome vazio.");
            return false;
        }else{
            this.nome = nome;
            return true;
        }
    }
    public boolean setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade invalida.");
            return false;
        }else{
            this.idade = idade;
            return true;
        }
    }

    public Pessoa(String nome, int idade){
        if(!setNome(nome)){
            this.nome = "sem nome";
        }
        if(!setIdade(idade)){
            this.idade = 0;
        }
    }

    public abstract String apresentar();
}