
package heranca2;


public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public double calculaBonificacao(){
        return this.salario * 0.1;
    }
    
    public void MostrarTodosDados (){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bonificacao: " + calculaBonificacao());
       
    }
    
    
}
