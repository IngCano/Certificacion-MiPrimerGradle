package com.demoaut.newtours.certificacion.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
// @RunWith especifica que el runner debera usar org.junit.runners.Suite
// para ejecutar esta clase en particular 
@RunWith(Suite.class)
// @SuiteClasses especifica que clases de prueba incluir y en que orden
@SuiteClasses({ NewtoursLogin.class })


public class TodasLasPruebas {
	// La clase permanece limpia, usada solo como contenedor de las
	// anotaciones de arriba
}
