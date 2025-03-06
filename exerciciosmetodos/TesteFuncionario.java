
package exerciciosmetodos;


public class TesteFuncionario {


    public static void main(String[] args) {
        // Instância do primeiro objeto
       Funcionario c1 = new Funcionario();
       
       //Atribuindo valores aos atributos
        //do objeto instanciado
        c1.nome = "Adriano Paz";
        c1.salario = 5000;

        
        
        Funcionario c2 = new Funcionario();
       
       //Atribuindo valores aos atributos
        //do segundo objeto instanciado
        c2.nome = "zeke Aguiar";
        c2.salario = 7000;

        
        //Mostrando o conteudo de acordo
        //com o que foi atribuido
        System.out.println("nome:" + c1.nome);
        System.out.println("Salario atual:" + c1.salario);
        //chamando o metodo aumetarsalario()
        c1.aumentarSalario(100);
        c1.MostrarAumento();
        
        
        
        
        System.out.println("nome:" + c2.nome);
        System.out.println("Salario atual:" + c2.salario);
        //chamando o metodo aumetarsalario()
        c2.aumentarSalario(200);
        c2.MostrarAumento();
        

        

        
    }
    
}
