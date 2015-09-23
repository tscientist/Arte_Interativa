
package ai;


import ai.ListController;
import spark.Route;
import spark.Spark;
import spark.TemplateViewRoute;
import spark.template.mustache.MustacheTemplateEngine;


public class Main {	
	public static void main(String[] args) {
	
		MustacheTemplateEngine engine = new MustacheTemplateEngine("views");
		Spark.staticFileLocation("/pub");
		
		Route cont = new ContRoute();
		
		Spark.get("/cont", cont);
		
		AnswerController answerController = new AnswerController();
		Route NovaResposta = answerController.novaresposta;
		NewController novoControlador = new NewController();
		SaveNewController salvaControlador = new SaveNewController();
		NewDeleteController novodeletaControlador = new NewDeleteController();
		RemoveController deletaControlador = new RemoveController();
		
		
		TemplateViewRoute MostraResposta = answerController.mostraresposta;
		TemplateViewRoute Respondendo = answerController.mostraresposta;
		
		
		Spark.post("/home", NovaResposta);
	
		Spark.get("/home", MostraResposta, engine);
		Spark.get("/home", Respondendo, engine);
		
		Spark.get("/novo", novoControlador, engine);
		
		Spark.post("/salva", salvaControlador, engine);
		
		ListController listaControlador = new ListController();

		Spark.get("/lista", listaControlador, engine);
		Spark.get("/novodeleta", novodeletaControlador, engine);
		Spark.post("/deleta", deletaControlador, engine);
	
	
	}
	
	}
