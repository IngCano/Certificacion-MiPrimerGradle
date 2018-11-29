// Ubicacion del paquete donde se encuentra la clase:
package com.demoaut.newtours.certificacion.tests;

// Conjunto de metodos que nos ayudara a ejecutar los test:
//import static org.junit.Assert.*;
//Clase necesaria para finalizar el test
import org.junit.After;
//Clase necesaria para inicializar el test
import org.junit.Before;
//Clase necesaria para realizar el test
import org.junit.Test;
//representacion de teclas que no son texto (ej: enter, esc...)
import org.openqa.selenium.Keys;

// Importamos la clase que creamos y donde tenemos todos los metodos
// que usaremos para los test case
import com.demoaut.newtours.certification.pages.BuscarEnGooglePOM;

public class NewtoursLogin {

	private BuscarEnGooglePOM newtoursLoginPOM;
	
	@Before
	public void setUp() throws Exception {
		// Creamos y asignamos la instancia
		newtoursLoginPOM = BuscarEnGooglePOM.crearInstanciaParaIE();
		// Abrimos el navegador
		newtoursLoginPOM.abrirNavegador();
	}

	@After
	public void tearDown() throws Exception {
		// Cerramos el navegador
		newtoursLoginPOM.cerrarNavegador();
	}

	@Test
	public void test() {
		// Nos dirigimos hacia la pagina web https://www.google.com/
		newtoursLoginPOM.navegarHaciaPaginaWeb("https://www.google.com/");
		// Buscamos la caja de texto por id para realizar una busqueda
		newtoursLoginPOM.buscarElementoPorID("lst-ib");
		// Luego escribimos en la caja de texto el texto asignado
		newtoursLoginPOM.escribirTexto(newtoursLoginPOM.obtenerElementoWebReciente(),
				"Test");
		// por ultimo presionamos la tecla enter para realizar la busqueda
		newtoursLoginPOM.presionarTeclaEspecial(newtoursLoginPOM.obtenerElementoWebReciente(),
				Keys.RETURN+"");
	}

}
