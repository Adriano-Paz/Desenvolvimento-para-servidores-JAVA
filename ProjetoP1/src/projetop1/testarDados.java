
package projetop1;


public class testarDados {

   
    public static void main(String[] args) {
        carro c = new carro ();
        
        //classe Automovel (mãe)
        c.setModelo("Toyota");
        c.setMarca("Corolla");
        c.setAno("2020");
        c.setPreco (800000);
        
        
        //classe automovel (filha)
        c.setPortas("4");
        
        
        caminhao t = new caminhao ();
        
        //classe Automovel (mãe)
        t.setModelo("C-816");
        t.setMarca("Ford");
        t.setAno("2018");
        t.setPreco(200000);
        
        
        //classe automovel (filha)
       t.setCapacidadeEmToneladas("3 toneladas");
       
       moto m = new moto ();
       
       
       m.setModelo("CB 500F");
       m.setMarca("Honda");
       m.setAno("2006");
       m.setPreco(2000000);
       
       
       //classe automovel (filha)
       m.setCilindradas("471 cc");
       
        //Mostrar dados
       
        //carro
        //System.out.println("Carro");
        //System.out.println("Modelo: " + c.getModelo());
        //System.out.println("Marca: " + c.getMarca());
        //System.out.println("Ano: " + c.getAno());
        //System.out.println("Preço: " + c.getPreco());      
        //System.out.println("Portas: " + c.getPortas());
        //System.out.println("Valor do Ipva: "  + c.calculoDeIPVA());
         
        //caminhão
        //System.out.println("---------------------------------");
        //System.out.println("Caminhão");
        //System.out.println("Modelo: " + t.getModelo());
        //System.out.println("Marca: " + t.getMarca());
        //System.out.println("Ano: " + t.getAno());
        //System.out.println("Preço: " + t.getPreco());
        //System.out.println("Capacidade em Toneladas: " + t.getCapacidadeEmToneladas());
        //System.out.println("Valor do Ipva: "  + t.calculoDeIPVA());
        
        //moto
        //System.out.println("---------------------------------");
        //System.out.println("Moto");
        //System.out.println("Modelo:" + m.getModelo());
        //System.out.println("Marca:" + m.getMarca());
        //System.out.println("Ano: " + m.getAno());
        //System.out.println("Preço: " + m.getPreco());
        //System.out.println("Cilindradas: " + m.getCilindradas());
        //System.out.println("Valor do Ipva: "  + m.calculoDeIPVA());
        
        System.out.println("Carro");
        c.MostrarTodosOsDados();
        System.out.println("----------------------");
        
        System.out.println("Caminhão");
        t.MostrarTodosOsDados();
        System.out.println("----------------------");
        
        System.out.println("Moto");
        m.MostrarTodosOsDados();
        System.out.println("----------------------");
    }
    
}
