
public class Emblema {

	private Long id;
	private String nomeEmblema;

	public Emblema(Long id, String nomeEmblema) {

		setId(id);
		setNomeEmblema(nomeEmblema);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEmblema() {
		return nomeEmblema;
	}

	public void setNomeEmblema(String nomeEmblema) {
		this.nomeEmblema = nomeEmblema;
	}
}
