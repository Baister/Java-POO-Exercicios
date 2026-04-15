class Diretor extends Pessoa {
    private int tempoDeGestao;

    public int getTempoDeGestao(){
        return tempoDeGestao;
    }

    public boolean setTempoDeGestao(int tempoDeGestao){
        if(tempoDeGestao < 0) {
            return false;
        }else{
            this.tempoDeGestao = tempoDeGestao;
            return true;
        }
    }

    public Diretor(String nome, int idade, int tempoDeGestao){
        super(nome, idade);

        if(!setTempoDeGestao(tempoDeGestao)){
            this.tempoDeGestao = 0;
        }

    }
    @Override
    public String apresentar(){
        return "Sou o diretor " + getNome() + ", ha " + getTempoDeGestao() + " anos na gestao.";

    }
}
