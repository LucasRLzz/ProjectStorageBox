package domain;

public class Project {

	private String linguagem;
	private String nome;
	private String descricao;
	private StatusProjeto status;

	public Project(String nomeProjeto, String nomeLinguagem, StatusProjeto statusProjeto) {
		setNome(nomeProjeto);
		setLinguagem(nomeLinguagem);
		setStatus(statusProjeto);
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		if (linguagem == null || linguagem.trim().isEmpty()) {
			throw new IllegalArgumentException("Linguagem mencionada inválida.");
		} else {
			this.linguagem = linguagem;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome mencionado inválido.");
		} else {
			this.nome = nome;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusProjeto getStatus() {
		return status;
	}

	public void setStatus(StatusProjeto status) {
		if ( status == null) {
			throw new IllegalArgumentException("Status inválido.");
		} else {
			this.status = status;
		}
	}

	
	
}