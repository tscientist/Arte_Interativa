package ai;


import spark.Request;
import spark.Response;
import spark.Route;

public class ContRoute implements Route {

		private int cont =0;
	@Override
	public Object handle(Request arg0, Response arg1) throws Exception {
		// TODO Auto-generated method stub
		return cont++;
	}

}
