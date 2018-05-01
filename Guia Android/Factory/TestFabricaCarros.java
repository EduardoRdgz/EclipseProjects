import Fabricas.Carros;
import Fabricas.Nissan;
import Fabricas.Toyota;
import Productos.Carro;

public class TestFabricaCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Carros factory;
	        Carro carCreated;

	        factory = new Nissan();

	        System.out.println(" Tsuru:");
	        carCreated = factory.createProduct("tsuru");
	        if(carCreated != null){
	            System.out.println(carCreated.getInformation());
	        }else{
	            System.out.println("No product created.");
	        }

	        System.out.println(" Versa:");
	        carCreated = factory.createProduct("versa");
	        if(carCreated != null){
	            System.out.println(carCreated.getInformation());
	        }else{
	            System.out.println("No product created.");
	        }

	        factory = new Toyota();

	        System.out.println(" Corolla:");
	        carCreated = factory.createProduct("corolla");
	        if(carCreated != null){
	            System.out.println(carCreated.getInformation());
	        }else{
	            System.out.println("No product created.");
	        }

	        System.out.println(" Prius:");
	        carCreated = factory.createProduct("prius");
	        if(carCreated != null){
	            System.out.println(carCreated.getInformation());
	        }else{
	            System.out.println("No product created.");
	        }

	        System.out.println(" Sentra:");
	        carCreated = factory.createProduct("sentra");
	        if(carCreated != null){
	            System.out.println(carCreated.getInformation());
	        }else{
	            System.out.println("No product created.");
	        }

	    }
		
	}
