package java8.vain.dog;

import java.util.Optional;

public class OptionalApp {

	public void probar(String valor) {
		//System.out.println(valor.contains("Value"));
		
		Optional op = Optional.empty();
		op.get();
		
	}
	
	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("predetreminado");
		System.out.println(x);
		
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	
	public void isPresent(String valor) { 
		Optional<String> op = Optional.ofNullable(valor);
		System.out.print(op.isPresent());
	}
	
	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		//app.probar(null);
		app.orElse(null);
		app.orElse("Yanks");
		//app.orElseThrow(null);
		app.orElseThrow("OrElseThrowYanks");
		app.isPresent(null);
	}

}

