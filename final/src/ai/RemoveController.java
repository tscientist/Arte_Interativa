package ai;

import persistencia.Avaliar;
import persistencia.AvaliarDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.TemplateViewRoute;

public class RemoveController implements TemplateViewRoute{
	private AvaliarDAO dao = new AvaliarDAO();
		
	public ModelAndView handle(Request req, Response resp) {
		Avaliar avaliacao = new Avaliar();
		avaliacao.setNumero(req.queryMap("numero").integerValue());
		dao.delete(avaliacao);
		resp.redirect("/lista");
		return null;
	}

	

}
