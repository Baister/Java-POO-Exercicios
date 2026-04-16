public abstract class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public String getCategoria(){
        return categoria;
    }

    public boolean setNome(String nome){
        if(nome == null || nome.isEmpty()){
            return false;
        }else{
            this.nome = nome;
            return true;
        }
    }

    public boolean setPreco(double preco){
        if(preco < 0){
            return false;
        }else{
            this.preco = preco;
            return true;
        }
    }

    public boolean setCategoria(String categoria){
        if(categoria == null || categoria.isEmpty()){
            return false;
        }else{
            this.categoria = categoria;
            return true;
        }
    }

    public Produto(String nome, double preco, String categoria){
        if(!setNome(nome)){
            this.nome = "nome vazio";
        }
        if(!setPreco(preco)){
            this.preco = 0;
        }
        if(!setCategoria(categoria)){
            this.categoria = "categoria vazio";
        }
    }

    public abstract double calcularDesconto();
}
