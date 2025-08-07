public class Usuario {



		private Long id;
		private String nome;
		private String sobrenome;
		private String senha;
		private String email;


		public Usuario(Long id) {
			setId(id);
		}

		public Usuario(String nome, String sobrenome, String email, String senha, Long id) {
			setId(id);
			setNome(nome);
			setSobrenome(sobrenome);
			setEmail(email);
			setSenha(senha);
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	}



