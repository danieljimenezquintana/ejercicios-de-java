public class Ejercicio23 {
	public static void main(String[] args){
		int baseImponible;
		System.out.print("Introduzca la base imponible: ");
		baseImponible = Integer.parseInt(System.console().readLine());
		String tipoIva;
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		tipoIva = System.console().readLine();
		int codigoPromocional;
		System.out.print("Introduzca el código promocional(nopro, mitad, meno5, 5porc): ");
		codigoPromocional = Integer.parseInt(System.console().readLine());
		int tipoIVANumerico = 0;
		switch(tipoIva) {
			 case "general": 
			 tipoIVANumerico = 21; 
			  break; 
			 case "reducido": 
			 tipoIVANumerico = 10;
			  break; 
			  case "superreducido":
			   tipoIVANumerico = 4;
			  break; 
		}

	double iva = baseImponible * tipoIVANumerico / 100;
	double precioSinDescuento = baseImponible + iva;
	double descuento = 0;
	 switch(codigoPromocional) {
		  case "nopro":
		  break; 
		  case "mitad":  
		  descuento = precioSinDescuento / 2; 
		  break;
		  case "meno5":
		  descuento = 5; 
		  break; 
		  case "5porc": 
		  descuento = precioSinDescuento * 0.05;
		   break;
		   double total = precioSinDescuento - descuento;
		   System.out.println("Base imponible     " + baseImponible);
		   System.out.println("IVA                " + tipoIVANumerico, iva);
		   System.out.println("Precio con IVA     " + precioSinDescuento);
		   System.out.println("Código promocional " + codigoPromocional + descuento);
		   System.out.println("TOTAL              " + total);
		}
	}
}
