package model;
import java.util.ArrayList;

public class Lista {

		private ArrayList<Resposta> resposta = new ArrayList<Resposta>();
	
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((resposta == null) ? 0 : resposta.hashCode());
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
			Lista other = (Lista) obj;
			if (resposta == null) {
				if (other.resposta != null)
					return false;
			} else if (!resposta.equals(other.resposta))
				return false;
			return true;
		}
		public void addResposta(String ans){
			Resposta m = new Resposta(ans);
			if(resposta.indexOf(m)== -1){
			resposta.add(m);
			}
		}

		public String toString(){
			return resposta.toString();
		}
		public int indexOf(Resposta m){
			return resposta.indexOf(m);
		}
		
		public ArrayList<Resposta> getResposta() {
			return resposta;
		}

	}


