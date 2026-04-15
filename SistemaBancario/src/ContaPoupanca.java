class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }
    @Override
    public boolean sacar(double valor){
        if(valor < 0 || valor > getSaldo()){
            return false;
        }else{
            int taxa = 0;
            this.setSaldo(this.getSaldo() - (valor + taxa));
            return true;
        }
    };
    @Override
    public double calcularRendimento() {
        double rendimento = 1.05;
        setSaldo(getSaldo()*rendimento);
        return getSaldo();
    }
}
