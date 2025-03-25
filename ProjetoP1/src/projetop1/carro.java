
package projetop1;


public class carro extends Automovel {
    private String portas;

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }
    
    @Override
    public double calculoDeIPVA (){
     return this.getPreco() * 0.04;
    }
    
    @Override
    public void MostrarTodosOsDados(){
       super.MostrarTodosOsDados();
        System.out.println("Porta: " + getPortas());
        
    }
}
