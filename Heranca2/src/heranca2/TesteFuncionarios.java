
package heranca2;


public class TesteFuncionarios {


    public static void main(String[] args) {
        Gerente g = new Gerente();
        // classe Funcionario(mãe)
        
        g.setNome("Adriano Paz");
        g.setSalario(8000.50);
        
        
        //classe filha (funcionario)
        g.setUsuario("AGP");
        g.setSenha("FrangoFrito");
        
        
        Telefonista t = new Telefonista();
        // classe telefonista(mãe)
        t.setNome("Eliane Prado");
        t.setSalario(10780.23);
                
        //classe filha (telefonista)
        t.setEstacaoDeTrabalho(12);
        
        
        Secretaria s = new Secretaria();
        //classe Funcionario(mãe)
        s.setNome("Nilva Prado");
        s.setSalario(6550.99);
        
        //classe filha (Secretaria)
        s.setRamal(6677);
        
        //mostrar os dados Gerente
        // System.out.println("=================================");
        //System.out.println("GERENTE");
        //System.out.println("NOME: " + g.getNome());
        //System.out.println("SALARIO: " + g.getSalario());
        //System.out.println("USUARIO: " + g.getUsuario());
        //System.out.println("SENHA: " + g.getSenha());
        //System.out.println("BONIFICACAO:" + g.calculaBonificacao());
        
        //mostrar o dados telefonica
        //System.out.println("=================================");
        //System.out.println("TELEFONISTA");
        //System.out.println("NOME: " + t.getNome());
        //System.out.println("SALARIO: " + t.getSalario());
        //System.out.println("ESTACAO DE  TRABALHO" + t.getEstacaoDeTrabalho());
       // System.out.println("BONIFICACAO:" + t.calculaBonificacao());
        
        //mostrar o dados secretaria
        //System.out.println("=================================");
        //System.out.println("SECRETARIA");
        //System.out.println("NOME: " + s.getNome());
        //System.out.println("SALARIO: " + s.getSalario());
        //System.out.println("RAMAL:" + s.getRamal());
        //System.out.println("BONIFICACAO:" + s.calculaBonificacao());        
        
                //Mostrar dados de todos os funcionarios
        //Gerente
        g.imprimeTodosDados();
        System.out.println("===========");
        
        //Telefonista
        t.imprimeTodosDados();
        System.out.println("===========");
        
        //Secretaria
        s.imprimeTodosDados();
        System.out.println("===========");
    }
    
}
