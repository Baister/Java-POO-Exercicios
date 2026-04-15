class Professor extends Pessoa{
    private String disciplina;

    public String getDisciplina(){
        return disciplina;
    }
    public boolean setDisciplina(String disciplina){
        if(disciplina == null || disciplina.isEmpty()){
            return false;
        }else{
            this.disciplina = disciplina;
            return true;
        }
    }

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);

        if(!setDisciplina(disciplina)){
            this.disciplina = "disciplina vazia";
        }
    }

    @Override
    public String apresentar(){
        return "Sou o professor "+ getNome() + ", leciono " + getDisciplina();
    }
}
