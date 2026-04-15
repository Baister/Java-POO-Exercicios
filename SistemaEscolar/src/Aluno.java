class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula(){
        return matricula;
    }
    public boolean setMatricula(int matricula){
        if(matricula < 0){
            return false;
        }else{
            this.matricula = matricula;
            return true;
        }
    }

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        if(!setMatricula(matricula)){
            this.matricula = 0;
        }
    }

    @Override
    public String apresentar(){
        return "Sou o aluno "+ getNome()+", tenho "+ getIdade() + " anos, matricula " + getMatricula();
    }

}
