package ai;

import java.util.*;
import ai.Foto;

import model.Lista;
import model.Resposta;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.TemplateViewRoute;

public class AnswerController {
		public static final String respostas = null;
		
		private Lista lista = new Lista();
		public final Route novaresposta = new NovaResposta();
		public final TemplateViewRoute mostraresposta = new MostraResposta();

		public class NovaResposta implements Route {

				@Override
				public Object handle(Request req, Response res) throws Exception {
				String resposta = req.queryParams("resposta");

				lista.addResposta(resposta);
				res.redirect("/fim.html");
	
				return null;
				}
				
			}
			
			public class MostraResposta implements TemplateViewRoute {

				@Override
				public ModelAndView handle(Request req, Response res) {
					return new ModelAndView(lista, "home.html"); 
				}

			}
		public class Respondendo implements Route {

				public Object handle(Request req, Response res){
				String resposta = req.queryParams("resposta");
				Resposta m = new Resposta(resposta);
					res.redirect("/fim.html");

				return null;
				}
			}


	}




