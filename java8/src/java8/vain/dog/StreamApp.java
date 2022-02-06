package java8.vain.dog;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	private List<String> lista;
	private List<String> numeros;
	
	public StreamApp () {
		lista = new ArrayList<>();
		lista.add("Ivan");
		lista.add("Yannick");
		lista.add("Avila");
		lista.add("Mendoza");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
	}
	
	public void filtrar() {
		lista.stream().filter(x -> x.contains("n")).forEach(System.out::println);
	}
	
	public void ordernar(boolean inverso) {
		if (inverso) {
			lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
			return;
		}
			
		lista.stream().sorted().forEach(System.out::println);
	}
	
	public void transformar() {
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		System.out.println(lista.stream().count());
	}
	
	public static void main (String args []) {
		StreamApp app = new StreamApp();
		System.out.println("==FILTRO==");
		app.filtrar();
		System.out.println();
		System.out.println("==ORDEN==");
		app.ordernar(false);
		
		System.out.println();
		System.out.println("==INVERSO==");
		app.ordernar(true);
		
		System.out.println();
		System.out.println("==MAYUS==");
		app.transformar();
		
		System.out.println();
		System.out.println("==LIMIT==");
		app.limitar();
		
		System.out.println();
		System.out.println("==CONTAR==");
		app.contar();
	}
}
