package com.example.demo.validation;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alunos")
public class Aluno {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer ra;
		
		@NotBlank(message = "O campo nome é obrigatório.")
		@Size(min = 3, max = 10, message = "O nome deve ter de 3 a 10 caracteres.")
		private String nome;
		
		@Email(message = "Email inválido, exemplo: seuemail@email.com")
		private String email;
		
		@Positive(message = "A mensalidade deve ser maior que zero.")
		private Double mensalidade;
		
		@Past(message = "A data de nascimento não pode ser futura.")
		@Column(name = "data_nascimento")
		private LocalDate data_nascimento;

		public Integer getRa() {
			return ra;
		}

		public void setRa(Integer ra) {
			this.ra = ra;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Double getMensalidade() {
			return mensalidade;
		}

		public void setMensalidade(Double mensalidade) {
			this.mensalidade = mensalidade;
		}

		public LocalDate getData_nascimento() {
			return data_nascimento;
		}

		public void setData_nascimento(LocalDate data_nascimento) {
			this.data_nascimento = data_nascimento;
		}

		public Aluno(Integer ra,
				@NotBlank(message = "O campo nome é obrigatório.") @Size(min = 3, max = 10, message = "O nome deve ter de 3 a 10 caracteres.") String nome,
				@Email(message = "Email inválido, exemplo: seuemail@email.com") String email,
				@Positive(message = "A mensalidade deve ser maior que zero.") Double mensalidade,
				@Past(message = "A data de nascimento não pode ser futura.") LocalDate data_nascimento) {
			super();
			this.ra = ra;
			this.nome = nome;
			this.email = email;
			this.mensalidade = mensalidade;
			this.data_nascimento = data_nascimento;
		}

		public Aluno() {
			super();
		}
		
		
		
		
		
		
		
}
