
public class Adocao {

	private Long id;
	private String nomeAdotante;
	private Contato contatoAdotante;

	public Adocao(Long id, String nomeAdocao) {

		setId(id);
		setNomeAdotante(nomeAdotante);
		setNomeAdotante(nomeAdotante);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAdotante() {
		return nomeAdotante;
	}

	public void setNomeAdotante(String nomeAdotante) {
		this.nomeAdotante = nomeAdotante;
	}

	public Contato getContatoAdocante() {
		return contatoAdotante;
	}

	public void setContatoAdocante(Contato contatoAdocante) {
		this.contatoAdotante = contatoAdocante;
	}

}
