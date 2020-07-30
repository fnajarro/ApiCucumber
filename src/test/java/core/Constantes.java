package core;

import io.restassured.http.ContentType;

public interface Constantes {
	
	String APP_BASE_URL = "http://barrigarest.wcaquino.me";
	Integer APP_PORT = 80;
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON; //Definicao do content type (formato de dado) a ser utilizado
	
	Long MAX_TIMEOUT = 5000L;

}
