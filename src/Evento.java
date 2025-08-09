import java.time.LocalDate;

public class Evento {

	private Long id;
//	private Animal animal;
	private LocalDate dataEvento;
	private Usuario usuario;
	private Endereco endereco;
//	private Comentario comentario;
//	private Foto foto;
//	private Avaliacao avaliacao;

	public Evento(Long id, LocalDate dataEvento, Usuario usuario, Endereco endereco) {

		setId(id);
		setDataEvento(dataEvento);
		setUsuario(usuario);
		setEndereco(endereco);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
//	public Comentario getComentario() {
	// return comentario;
	// }

//	public void comentario(Comentario comentario) {
	// this.comentario = comentario;
//	}

//	public Animal getAnimal() {
	// return animal;
	// }

//	public void animal(Animal animal) {
	// this.animal = animal;
//	}

//	public Foto getFoto() {
	// return foto;
	// }

//	public void foto(Foto foto) {
	// this.foto = foto;
//	}

//	public Avaliacao getAvaliacao() {
	// return avaliacao;
	// }

//	public void avaliacao(Avaliacao avaliacao) {
	// this.avaliacao = avaliacao;
//	}

}
