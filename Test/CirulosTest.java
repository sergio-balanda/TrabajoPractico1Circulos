import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.ejemplos.Circulos;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CirulosTest {

	@Test
	public void queElRadioDelCirculoSeCreeEnDos() {
		Circulos miCirculo = new Circulos();
		Integer valorEsperado = 2;
		Integer CirculoConRadioDos = miCirculo.dameCirculoConRadioDos();
		Assert.assertEquals(valorEsperado, CirculoConRadioDos);
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnTresComaSiete(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 3.7;
		Double CirculoConRadioTresComaSiete = miCirculo.dameCirculoConRadioTresComaSiete();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoConRadioTresComaSiete.doubleValue());
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnCinco(){
		Circulos miCirculo = new Circulos();
		Integer valorEsperado = 5;
		Integer CirculoConRadioCinco = miCirculo.dameCirculoConRadioCinco();
		Assert.assertEquals(valorEsperado, CirculoConRadioCinco);
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnDiezComaNueve(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 10.9;
		Double CirculoConRadioDiezComaNueve = miCirculo.dameCirculoConRadioDiezComaNueve();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoConRadioDiezComaNueve.doubleValue());
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnNueveComaOcho(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 61.57;
		miCirculo.damePerimetroDelCiculoDeNueveComaOcho();
		
		Double CirculoConRadioNueveComaOcho = miCirculo.dameCirculoConRadioNueveComaOcho();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoConRadioNueveComaOcho.doubleValue(),2);
	}
	@Test
	public void queElRadioDelCirculoSeCreeEnDieciseisComaSeis(){
		Circulos miCirculo = new Circulos();
		Double valorEsperado = 104.24;
		miCirculo.damePerimetroDelCirculoDeDieciseisComaSeis();
		
		Double CirculoDeRadioDieciseisComaSeis = miCirculo.dameCirculoConRadioDieciseisComaSeis();
		Assert.assertEquals(valorEsperado.doubleValue(), CirculoDeRadioDieciseisComaSeis.doubleValue(),2);
	}
}
