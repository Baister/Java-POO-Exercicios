class ContaCorrente extends Conta{
    public ContaCorrente(int numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public boolean sacar(double valor){
        if(valor < 0 || valor > getSaldo()){
            return false;
        }else{
            int taxa = 2;
            this.setSaldo(this.getSaldo() - (valor + taxa));
            return true;
        }
    };

    @Override
    public double calcularRendimento() {
        return getSaldo();
    }
}
