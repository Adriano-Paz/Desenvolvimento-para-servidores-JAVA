
package exerciciosmetodos;


public class Funcionario {
    String nome;
    double salario;
    
    
    
    void aumentarSalario(double valor){
        this.salario += valor;
    }
    
    void MostrarAumento (){
        System.out.println("Aumento do salario:" + this.salario);
    }
    
    

}
