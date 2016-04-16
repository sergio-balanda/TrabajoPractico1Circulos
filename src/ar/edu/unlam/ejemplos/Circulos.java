package ar.edu.unlam.ejemplos;

public class Circulos {
	private Integer CirculoConRadioDos = 2;
	private Double CirculoConRadioTresComaSiete = 3.7;
	private Integer CirculoConRadioCinco = 5;
	private Double CirculoConRadioDiezComaNueve = 10.9;
	private Double CirculoConRadioNueveComaOcho = 9.8;
	private Double CirculoConRadioDieciseisComaSeis = 16.6;
	
	public Integer dameCirculoConRadioDos(){
		return CirculoConRadioDos;
	}
	public Double dameCirculoConRadioTresComaSiete(){
		return CirculoConRadioTresComaSiete;
	}
	public Integer dameCirculoConRadioCinco(){
		return CirculoConRadioCinco;
	}
	public Double dameCirculoConRadioDiezComaNueve(){
		return CirculoConRadioDiezComaNueve;
	}
	
	
	public Double dameCirculoConRadioNueveComaOcho(){
		return CirculoConRadioNueveComaOcho;
	}
	public void damePerimetroDelCiculoDeNueveComaOcho(){
		CirculoConRadioNueveComaOcho = CirculoConRadioNueveComaOcho * 2 * 3.14;
	}
	
	public Double dameCirculoConRadioDieciseisComaSeis(){
		return CirculoConRadioDieciseisComaSeis;
	}
	public void damePerimetroDelCirculoDeDieciseisComaSeis(){
		CirculoConRadioDieciseisComaSeis = CirculoConRadioDieciseisComaSeis * 2 * 3.14;
	}
}
