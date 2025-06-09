package Login;

import java.sql.SQLException; //Tratar as exceções no banco de dados

/**
 *
 * @author adria
 */
public class Usuario {

    //Criação dos atributos privados da classe
    private String usuario;
    private String nome;
    private String senha;

    //Atributo que armazenará o retorno do banco de dados
    private boolean resultUsuario;
    private boolean resultCadastro;

    private boolean resultAlteracao;
    private boolean resultExclusao;
    
    //Atributos Estaticos do sistema
    static String nomeUsuario;
    static String usuarioSistema;
    
    //Criação dos getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //método de verificação da autenticidade do usuario
    public boolean verificaUsuario(String usuario, String senha) {
        //fazer a instância da conexão com o banco de dados
        Conexao banco = new Conexao();

        try {
            //Abro a conexão com o banco de dados
            banco.abrirConexao();

            //criando parâmetro de retorno
            banco.stmt = banco.con.createStatement();

            //Executando a consulta no banco de dados
            banco.resultset
                    = banco.stmt.executeQuery("SELECT * FROM usuario "
                            + "WHERE usuario = '" + usuario + "'"
                            + " AND senha = md5('" + senha + "')");
            //Verificando se existe retorno de dados no banco
            if(banco.resultset.next()) {
                //Caso tenha
                resultUsuario = true;
                
                //Setters em Nome e Usuario
                setUsuario (banco.resultset.getString(1));
                setNome (banco.resultset.getString(2));
                
                //Nos atributos estáticos, realizo as atribuições
                nomeUsuario = getNome();
                usuarioSistema = getUsuario();
                
            }else {
                //caso não tenha
                resultUsuario = false;
            }

            banco.fecharConexao(); // fecha nossa conexão com o banco de dados

        }catch (SQLException ec) {
            System.out.println("Erro ao consultar usuário " + ec.getMessage());
        }

        return resultUsuario;
    }
    
    //Método de verificação do usuario, estamos aqui fazendo uma
    //sobrecarga de método
    public boolean verificaUsuario(String usuario){
        //fazer a instância da conexão com o banco de dados
        Conexao banco = new Conexao();
        
        try{
            //Abro a conexão com o banco de dados
            banco.abrirConexao();
            
            //Criando parâmetro de retorno
            banco.stmt = banco.con.createStatement();
            
            //Exeutando a consulta no banco de dados
            banco.resultset =
                    banco.stmt.executeQuery("SELECT * FROM usuario "
                                             + "WHERE usuario = '" + usuario + "'");
            
            //Verificando se existe retorno de dados no banco
            if (banco.resultset.next()){
                //caso tenha
                resultUsuario = true;
            }else{
                //caso não tenha
                resultUsuario = false;
            }
            
            banco.fecharConexao(); //fecha nossa conexão com o banco de dados
            
        }catch (SQLException ec) {
            System.out.print("Erro ao consultar usuário " + ec.getMessage());
        }
        
        return resultUsuario;
        }   
         
    
    //Método pra cadastro de usuário em nosso sistema
    public boolean cadastraUsuario(String nome, String usuario, String senha){
        //fazer a instancia da conexão com o banco de dados
        Conexao banco = new Conexao();
        
        try{
            //Abertura da conexão com o banco de dados
            banco.abrirConexao();
            
            //criando parâmetro de retorno
            banco.stmt = banco.con.createStatement();
            
            //executando a inserção dos dados
            banco.stmt.execute("INSERT INTO usuario (nome, usuario, senha)"
                    + " VALUES ('" + nome + "','" + usuario + "', md5('"
                    + senha + "'))");
            
            resultCadastro = true;
            
        }catch(SQLException ec){
            System.out.println("Erro ao inserir o usuario " + ec.getMessage());
            resultCadastro = false;
        }
        
        return resultCadastro;
    }

    public boolean alteraUsuario(String nome, String usuario, String senha){
        //Fazer a Instância da conexão com o banco de dados
        
        Conexao banco = new Conexao();
        
        try{
            //abro a conexão com banco de dados
            banco.abrirConexao();
            
            //Criando o parâmetro de retorno
            banco.stmt = banco.con.createStatement();
            
            //Executando a alteraçÂo no banco de dados
            banco.stmt.execute("UPDATE usuario SET nome = '" + nome +
                               "', senha = md5('" + senha + "') WHERE usuario = '" +
                               usuario + "'");
            resultAlteracao = true;
        }catch (SQLException ec) {
            System.out.println("Erro ao atualizar usuário " + ec.getMessage());
            resultAlteracao = false;
        }
        
        banco.fecharConexao();
        
        return resultAlteracao;
    }
    
    public boolean excluiUsuario (String usuario){
        //Fazer a instância da conexão com o banco de dados
        
        Conexao banco = new Conexao();
        
        try{
            //Abro a conexão com banco de dados
            banco.abrirConexao();
            
            //Criando o parâmetro de retorno
            banco.stmt = banco.con.createStatement();
            
            //Executando a alteração no banco de dados
            banco.stmt.execute("DELETE FROM usuario WHERE usuario = '"
                    + usuario + "'");
            
            //Caso exclua
            resultExclusao = true;
                       
        }catch (SQLException ec){
            System.out.println("Erro ao excluir usuario " + ec.getMessage());
            resultExclusao = false;
           
        }
        banco.fecharConexao();
        
        return resultExclusao;
    }
    
    
}


