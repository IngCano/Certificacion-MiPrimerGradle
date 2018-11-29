package com.demoaut.newtours.certification.pages;

// Importamos el controlador para utilizar el navegador internet explorer
import org.openqa.selenium.ie.InternetExplorerDriver;
// Importamos la clase que nos permite "navegar" por el navegador
import org.openqa.selenium.WebDriver;
// Importamos la clase que nos permite manipular elementos de la web
import org.openqa.selenium.WebElement;
// Importamos el localizador
import org.openqa.selenium.By;

public class BuscarEnGooglePOM {
	
	// Declaramos aqui la referencia de nuestro navegador 
	private WebDriver navegador;
	// Declaramos aqui la referencia de nuestro ultimo elemento web obtenido.
	private WebElement elementoActual;
	
	/**
	 * Método estatico que especifica la ubicacion para internet explorer.
	 * @return La nueva instancia.
	 */
	public static BuscarEnGooglePOM crearInstanciaParaIE() {
		// El controlador para internet explorer se encuentra
		// en la dirección especificada
		System.setProperty("webdriver.ie.driver",
				"S:\\Mis_Proyectos\\Java\\Eclipse AutoTesting\\"
				+ "Complementos\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		return new BuscarEnGooglePOM();
	}
	
	/**
	 * Método estatico que especifica la ubicacion para mozilla firefox.
	 * @return La nueva instancia.
	 */
	public static BuscarEnGooglePOM crearInstanciaParaFirefox() {
		// El controlador para mozilla firefox se encuentra
		// en la dirección especificada
		System.setProperty("webdriver.gecko.driver",
				"S:\\Mis_Proyectos\\Java\\Eclipse AutoTesting\\Complementos"
				+ "\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		return new BuscarEnGooglePOM();
	}
	
	/**
	 * Método estatico que especifica la ubicacion para google chrome.
	 * @return La nueva instancia.
	 */
	public static BuscarEnGooglePOM crearInstanciaParaChrome() {
		// El controlador para google chrome se encuentra en la dirección especificada
		System.setProperty("webdriver.chrome.driver",
				"S:\\Mis_Proyectos\\Java\\Eclipse AutoTesting\\Complementos"
				+ "\\chromedriver_win32\\chromedriver.exe");
		return new BuscarEnGooglePOM();
	}
	
	/**
	 * Constructor de la clase.
	 * Utilizado para crear de una nueva instancia
	 * @see BuscarEnGooglePOM
	 */
	private BuscarEnGooglePOM() {}
	
	/**
	 * El método crea una nueva instancia, al hacerlo abrimos el navegador,
	 * este queda automaticamente asignado a la variable navegador.
	 * @see BuscarEnGooglePOM
	 */
	public void abrirNavegador() {
		// Le asignamos a nuestra referencia una nueva instancia de tipo
		// InternetExplorerDriver
		navegador = new InternetExplorerDriver();
	}
	
	/**
	 * Método utilizado para navegar hacia una pagina web
	 * @param paginaWeb es la url o direccion a especificar
	 * @see BuscarEnGooglePOM
	 */
	public void navegarHaciaPaginaWeb(String paginaWeb) {
		// Obtenemos la pagina web deseada
		navegador.get(paginaWeb);
	}
	
	/**
	 * Método utilizado para cerrar el navegador al momento de terminar nuestro test
	 * @see BuscarEnGooglePOM
	 */
	public void cerrarNavegador() {
		// Cerramos el navegador
		navegador.close();
	}
	
	/**
	 * Método utilizado para buscar un elemento en la pagina web actual por su id.
	 * @param id del elemento.
	 * @return El elemento web encontado.
	 * @see BuscarEnGooglePOM
	 */
	public WebElement buscarElementoPorID(String id) {
		// Retornamos el elemento web encontrado por id
		elementoActual = navegador.findElement(By.id(id));
		return elementoActual;
	}
	
	/**
	 * Método utilizado para buscar un elemento en la pagina web actual por su nombre.
	 * @param name del elemento.
	 * @return El elemento web encontrado.
	 * @see BuscarEnGooglePOM
	 */
	public WebElement buscarElementoPorNombre(String name) {
		// Retornamos el elemento web encontrado por nombre
		elementoActual = navegador.findElement(By.name(name));
		return elementoActual;
	}
	
	/**
	 * Método utilizado para devolver el ultimo elemento web encontrado.
	 * @return El elemento web.
	 */
	public WebElement obtenerElementoWebReciente() {
		return elementoActual;
	}
	
	/**
	 * Método utilizado para escribir un texto sobre un elemento web.
	 * @param elemento web donde vamos a escribir.
	 * @param texto a escribir en el elemento.
	 * @see BuscarEnGooglePOM
	 */
	public void escribirTexto(WebElement elemento, String texto) {
		// Escribimos sobre el elemento el texto asignado.
		elemento.sendKeys(texto);
	}
	
	/**
	 * Método utilizado para pulsar una tecla especial sobre un elemento web.
	 * @param elemento web donde vamos a pulsar la tecla.
	 * @param tecla a pulsar en el elemento
	 * @see BuscarEnGooglePOM
	 */
	public void presionarTeclaEspecial(WebElement elemento, String tecla) {
		// Pulsamos la tecla especificada sobre el elemento.
		elemento.sendKeys(tecla);
	}
	
	/**
	 * Método utilizado para clickear sobre un elemento web.
	 * @param elemento web donde se realizará la acción.
	 * @see BuscarEnGooglePOM
	 */
	public void clickearSobreElemento(WebElement elemento) {
		// Clikeamos sobre el elemento asignado.
		elemento.click();
	}
	
}
