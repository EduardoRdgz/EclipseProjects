package Fabricas;

import Productos.Carro;
import Productos.Prius;
import Productos.Sentra;

public class Toyota extends Carros{

	   @Override
	    public Carro createProduct(String productName) {
	        Carro carro = null;

	        if(productName.equalsIgnoreCase("CAMRY")){
	            carro = new Prius();
	        }else if(productName.equalsIgnoreCase("COROLLA")){
	            carro = new Sentra();
	        }

	        return carro;
	    }
}
