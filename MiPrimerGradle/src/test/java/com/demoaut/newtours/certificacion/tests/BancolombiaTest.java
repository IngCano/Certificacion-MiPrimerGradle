package com.demoaut.newtours.certificacion.tests;

// Importamos el metodo estatico assertThat()
import static org.junit.Assert.assertThat;

// Clase necesaria para finalizar el test
import org.junit.After;
// Clase necesaria para inicializar el test
import org.junit.Before;
// Clase necesaria para realizar el test
import org.junit.Test;
// Representacion de teclas que no son texto (ej: enter, esc...)
import org.openqa.selenium.Keys;

// Importamos los metodos basicos de hamcrest
import static org.hamcrest.CoreMatchers.*;
// Importamos nuestro POM
import com.demoaut.newtours.certification.pages.BancolombiaPOM;

public class BancolombiaTest {
	// Variable final que representa la ruta hacia el portal web de bancolombia
	private final String URL_PORTAL_BANCOLOMBIA = "https://www."
			+ "grupobancolombia.com/wps/portal/personas";
	// Variable final que representa el titulo del portal web de bancolombia
	private final String TITULO_PORTAL_BANCOLOMBIA = 
			"Personas: Soluciones Financieras para Ti";
	// Declaramos nuestro POM
	private BancolombiaPOM navegadorWebBancolombia;

	@Before
	public void armarPrueba() throws Exception {
		// Creamos y asignamos la instancia
		navegadorWebBancolombia = BancolombiaPOM.crearInstanciaParaChrome();
		// Abrimos el navegador
		navegadorWebBancolombia.abrirNavegadorUtilizandoChrome();
	}

	@After
	public void terminarPrueba() throws Exception {
		// Cerramos el navegador
		navegadorWebBancolombia.cerrarNavegador();
	}
	
	@Test
	public void probarPaginaBancolombia() {
		// Navegamos hacia el portal de bancolombia
		navegadorWebBancolombia.navegarHaciaPaginaWeb(URL_PORTAL_BANCOLOMBIA);
		// Afirmamos que el titulo de la pagina coincide
		// con el titulo ingresado
		assertThat(navegadorWebBancolombia.obtenerTituloDeLaPaginaWeb(),
				is(TITULO_PORTAL_BANCOLOMBIA));
		// Oprimimos el boton "Conoce Mas"
		navegadorWebBancolombia.presionarTeclaEspecial(
				navegadorWebBancolombia.buscarElementoPorLocalizador(
				navegadorWebBancolombia.obtenerBotonConoceMas()), Keys.RETURN+"");
		// Realizamos un cambio de ventana
		navegadorWebBancolombia.cambiarAVentana(2);
		/* Verificamos que nos desplazamos a la otra ventana
		 * afirmando que el titulo de la pagina coincide
		 * con el titulo especificado
		 */
		assertThat(navegadorWebBancolombia.obtenerTituloDeLaPaginaWeb(),
				is("Bolsa de Regalos Bancolombia"));
		// Volvemos a realizar un cambio de pagina
		navegadorWebBancolombia.cambiarAVentana(1);
		// Tomamos una foto para guardarla como resultado de la prueba
		navegadorWebBancolombia.tomarFoto();
		/* Volvemos a verificar que nos desplazamos a la pagina principal
		 * afirmando que el titulo de la pagina coincide
		 * con el titulo especificado
		 */
		assertThat(navegadorWebBancolombia.obtenerTituloDeLaPaginaWeb(),
				is(TITULO_PORTAL_BANCOLOMBIA));
	}

}
