
package heranca2;


public class Secretaria extends Funcionario{
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
        void imprimeTodosDados (){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Ramal: " + this.getRamal());
        System.out.println("Bonificacao: " + calculaBonificacao());
       
    }
}
