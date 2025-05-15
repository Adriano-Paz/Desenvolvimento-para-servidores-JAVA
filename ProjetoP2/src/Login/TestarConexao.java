package Login;

public class TestarConexao {

    public static void main(String[] args) {
        Conexao c = new Conexao(); //Instanciamos o objeto c de conexão
        c.abrirConexao(); //Chamamos o método de abertura da conexão do BD

        try {
            Thread.sleep(4000); //Fazemos uma pausa de 4 segundos
            c.fecharConexao(); //Fechamos a conexão
        } catch (InterruptedException ex) {
            //Mensagem de saída caso haja erro
            System.out.println("Houve algum problema no teste de conexão. " + ex.getMessage());
        }
    }

}
