package alphacar.entidades;

import alphacar.exception.ExcecaoCPFInvalido;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private char sexo;

    public PessoaFisica() {
        cpf = "Indefinido";
        sexo = 'I';
    }

    public PessoaFisica(String nome, String apelido, String endereco) throws ExcecaoCPFInvalido {
        super(nome, apelido, endereco);
        setCpf(cpf);
        setSexo(sexo);
    }

    public PessoaFisica(String cpf, char sexo) {
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ExcecaoCPFInvalido {
        if (cpfValido(cpf)) {
            this.cpf = cpf; 
        } else {
            throw new ExcecaoCPFInvalido("CPF Inválido!");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    private boolean cpfValido(String cpf) {
        String novoCPF = cpf.replaceAll("[.-]","");
        
        if (
            cpf == "11111111111" || cpf == "111.111.111-11" ||
            cpf == "22222222222" || cpf == "222.222.222-22" ||
            cpf == "33333333333" || cpf == "333.333.333-33" ||
            cpf == "44444444444" || cpf == "444.444.444-44" ||
            cpf == "55555555555" || cpf == "555.555.555-55" ||
            cpf == "66666666666" || cpf == "666.666.666-66" ||
            cpf == "77777777777" || cpf == "777.777.777-77" ||
            cpf == "88888888888" || cpf == "888.888.888-88" ||
            cpf == "99999999999" || cpf == "999.999.999-99" ||
            cpf == "00000000000" || cpf == "000.000.000-00" 
           ){
            return false;
        }

	//Testa se o CPF é válido ou não 
	int d1,d4,xx,nCount,resto,digito1,digito2; 
	String Check; 
	String Separadores = "/-."; 
	d1 = 0; d4 = 0; xx = 1; 
	for (nCount = 0; nCount < cpf.length() -2; nCount++) { 
		String s_aux = cpf.substring(nCount, nCount+1); 

		if (Separadores.indexOf(s_aux) == -1) { 
                    d1 = d1 + ( 11 - xx ) * Integer.valueOf (s_aux).intValue(); 
                    d4 = d4 + ( 12 - xx ) * Integer.valueOf (s_aux).intValue(); 
                    xx++; 
		}; 
	}; 
	resto = (d1 % 11); 
	if (resto < 2) { 
            digito1 = 0; 
	} else { 
            digito1 = 11 - resto; 
	} 

	d4 = d4 + 2 * digito1; 
	resto = (d4 % 11); 
	if (resto < 2) { 
            digito2 = 0; 
	} else { 
            digito2 = 11 - resto; 
	} 

	Check = String.valueOf(digito1) + String.valueOf(digito2); 

	String s_aux2 = cpf.substring (cpf.length()-2, cpf.length()); 

	if (s_aux2.compareTo (Check) != 0) { 
            return false;
	} else {
            return true; 
	}
    }
}
