package ai;

import persistencia.Avaliar;
import persistencia.AvaliarDAO;
import spark.*;


public class SaveNewController implements TemplateViewRoute {
	private AvaliarDAO dao = new AvaliarDAO();
	
	public ModelAndView handle(Request req, Response resp) {
		Avaliar avaliacao = new Avaliar();
		avaliacao.setNome(req.queryMap("nome").value());
		avaliacao.setNota(req.queryMap("nota").integerValue());
		dao.save(avaliacao);
		resp.redirect("/lista");
		return null;
	}

}
