
package heranca2;


public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    @Override
    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    }
        @Override
        public void MostrarTodosDados (){
        super.MostrarTodosDados();
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Senha: " + getSenha());
        
       
    }
}
