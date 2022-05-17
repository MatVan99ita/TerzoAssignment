package Vertx;

import io.vertx.core.Vertx;
import Vertx.DataService;
/*
 * Data Service as a vertx event-loop 
 */
public class RunService {
	
	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		DataService service = new DataService(8080);
		vertx.deployVerticle(service);
	}
}