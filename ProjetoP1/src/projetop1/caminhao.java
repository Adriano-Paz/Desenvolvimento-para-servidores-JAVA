
package projetop1;


public class caminhao extends Automovel {
    private String capacidadeEmToneladas;

    public String getCapacidadeEmToneladas() {
        return capacidadeEmToneladas;
    }

    public void setCapacidadeEmToneladas(String capacidadeEmToneladas) {
        this.capacidadeEmToneladas = capacidadeEmToneladas;
    }
    
    @Override
    public double calculoDeIPVA (){
     return this.getPreco() * 1.5/100;
    }
    
    @Override
    public void MostrarTodosOsDados(){
       super.MostrarTodosOsDados();
        System.out.println("capacidade Em Toneladas: " + getCapacidadeEmToneladas());
        
    }
}
