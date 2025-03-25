
package heranca2;


public class Secretaria extends Funcionario{
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
        @Override
        public void MostrarTodosDados (){
        super.MostrarTodosDados();
        System.out.println("Ramal: " + getRamal());

       
    }
}
