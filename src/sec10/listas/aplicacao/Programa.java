package sec10.listas.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {

//		List<Integer> list;	 -- Somente Wrapper Class são permitidas

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Kauan");
		list.add("Márcia");
		list.add("Ana");
		list.add(2, "Eduarda");		
		
//		list.remove("Kauan");
//		list.remove(1);
		
//		Remover um item da lista, usando um predicado.   ↓↓↓↓↓↓
		list.removeIf(x -> x.charAt(0) == 'A');	//Função LAMBDA
		
		System.out.println("Tamanho da lista: " + list.size());
		
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("-------------");
		
		System.out.println("Local da Eduarda: " + list.indexOf("Eduarda"));	//Retorna o local dentro da lista
		System.out.println("Local do Marco: " + list.indexOf("Marco") + " (não existe)");	//Retorna -1, o que significa que é 'false'

		System.out.println("-------------");
		
//		Filtrar uma lista existente dentro de outra lista, somente por nomes que comecem com "M"
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());	 
//		É necessário utilizar o stream da lista e o collector, por conta do List não aceitar operações de Lamdba, por ser um tipo antigo(List)
		
		for (String s : result) {
			System.out.println(s);
		}
		
		System.out.println("-------------");
		
		//Retorna o primeiro elemento da lista que comece com uma letra x
		String nome = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);	
		
		System.out.println(nome);
				
	}

}
