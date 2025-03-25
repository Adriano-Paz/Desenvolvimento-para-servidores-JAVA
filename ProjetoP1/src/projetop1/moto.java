
package projetop1;


public class moto extends Automovel {
    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public double calculoDeIPVA (){
     return this.getPreco() * 0.02;
    }
    
    
    @Override
    public void MostrarTodosOsDados(){
       super.MostrarTodosOsDados();
        System.out.println("Cilindradas: " + getCilindradas());
        
    }
}
