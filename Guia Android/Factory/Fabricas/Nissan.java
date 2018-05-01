package Fabricas;

import Productos.Carro;
import Productos.Tsuru;
import Productos.Versa;

public class Nissan extends Carros {

	   @Override
	    public Carro createProduct(String productName) {
	        Carro carro = null;

	        if(productName.equalsIgnoreCase("TSURU")){
	            carro = new Tsuru();
	        }else if(productName.equalsIgnoreCase("VERSA")){
	            carro = new Versa();
	        }

	        return carro;
	    }
	
}
