package ai;
import java.util.ArrayList;
import java.util.HashMap;

import persistencia.Avaliar;
import persistencia.AvaliarDAO;
import spark.*;

public class ListController implements TemplateViewRoute{
	private AvaliarDAO dao = new AvaliarDAO();

	public ModelAndView handle(Request req, Response resp) {
		ArrayList<Avaliar> avaliacoes= dao.findAll();
		HashMap dados = new HashMap();
		dados.put("avaliacoes", avaliacoes);
		return new ModelAndView(dados, "Listagem.html");
	}
	


}
