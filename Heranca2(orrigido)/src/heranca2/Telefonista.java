
package heranca2;


public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

        @Override
        public void MostrarTodosDados (){
        super.MostrarTodosDados();
        System.out.println("Estação de Trabalho: " + getEstacaoDeTrabalho());

       
    }

}
