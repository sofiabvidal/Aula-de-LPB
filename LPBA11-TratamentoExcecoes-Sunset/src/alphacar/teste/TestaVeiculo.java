package alphacar.teste;

import alphacar.entidades.Veiculo;
import alphacar.entidades.PessoaFisica;
import alphacar.exception.ExcecaoCPFInvalido;

public class TestaVeiculo {
    public static void main(String[] args) throws ExcecaoCPFInvalido {
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        
        veiculo1.setMarca("Ford");
        veiculo1.setModelo("EcoSport");
        veiculo1.setPlaca("BBBB2222");
        veiculo1.setAno(2021);
        veiculo1.setPreco(40000);
        veiculo1.setObservacoes("Semi Novo");
        veiculo1.setStatus(0);
        
        veiculo1.mostrar();
        
        System.out.println("* ---- *\n");
        
        veiculo2.setMarca("Jeep");
        veiculo2.setModelo("Renegade");
        veiculo2.setPlaca("AAAA1111");
        veiculo2.setAno(2020);
        veiculo2.setPreco(69999);
        veiculo2.setObservacoes("Novo");
        veiculo2.setStatus(1);
        
        veiculo2.mostrar();
        
//        PessoaFisica pessoa = new PessoaFisica();
//        
//        pessoa.setNome("Sofia");
//        pessoa.setCpf("491.428.218-60");
//        pessoa.setApelido("Soso");
//        pessoa.setEndereco("Rua Vitorio Della Rovere, 262");
//        pessoa.setSexo('F');
//        
//        System.out.println(pessoa.getNome());
        
    }
}
