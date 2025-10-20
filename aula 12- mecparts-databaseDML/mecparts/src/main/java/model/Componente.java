package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Componente {
	@EqualsAndHashCode.Include
	private int id;
	private String nome;
	private String descricao;
	private String preco;
	private String quantidade;

}
