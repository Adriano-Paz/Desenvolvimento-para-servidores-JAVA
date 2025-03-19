
package heranca2;


public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

        void imprimeTodosDados (){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Estação de Trabalho: " + this.getEstacaoDeTrabalho());
        System.out.println("Bonificacao: " + calculaBonificacao());
       
    }

}
