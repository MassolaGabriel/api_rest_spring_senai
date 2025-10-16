package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Fornecedores {
	private String nome_fornecedor;
	private String cnpj;
	private String endereco;
	private String telefone;
	
}
