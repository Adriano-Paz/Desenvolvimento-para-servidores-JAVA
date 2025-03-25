
package projetop1;


public class Automovel {
    private String modelo;
    
    private String marca;
    
    private String ano;

    private double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calculoDeIPVA (){
     return this.preco * 00.4;
}
    
    
    public void MostrarTodosOsDados(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano:  " + getAno());
        System.out.println("Preço: " + getPreco());
        System.out.println("IPVA: " + calculoDeIPVA());
    }



        
    
            
}
