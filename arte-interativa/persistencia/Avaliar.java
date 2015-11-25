package persistencia;

public class Avaliar {
	private String nome;
	private int nota;
	private int numero;
	public int getNumero() {
		return numero;
	}
	public  void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "avaliar [nome=" + nome + ", nota=" + nota + ", numero=" + numero + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + nota;
		result = prime * result + numero;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avaliar other = (Avaliar) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nota != other.nota)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	public Avaliar(String nome, int nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	public Avaliar() {
		super();
		this.nome = "";
		this.nota = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}


}
