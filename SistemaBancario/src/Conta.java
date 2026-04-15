public abstract class Conta {
    private int numero;
    private double saldo;

    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    public boolean setNumero(int numero){
        if(numero < 0){
            return false;
        }else{
            this.numero = numero;
            return true;
        }
    }
    public boolean setSaldo(double saldo){
        if(saldo < 0){
            return false;
        }else{
            this.saldo = saldo;
            return true;
        }
    }

    public boolean depositar(double valor){
        if(valor < 0){

            System.out.println("Valor inválido");
            return false;
        }else{
            this.saldo += valor;
            return true;
        }
    }

    public abstract boolean sacar(double valor);
    public abstract double calcularRendimento();

}
