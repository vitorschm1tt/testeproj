
public class Contato {

	private Long id;
	
	private String telefone;
	
	private String instagram;
	
	public Contato() {
		
		
	}
	
	public Contato (Long id, String telefone, String instragram) {
		
		this.id = id;
		
		this.telefone = telefone;
		
		this.instagram = instragram;
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTelefone() {
		return telefone;
	
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getInstragam() {
		return instragram;
	}
	
	public void setInstragram(String instragram) {
		this.instragram = instragram;
	}
	
	
}


