package sec12.enumeracao.ex02.aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import sec12.enumeracao.ex02.entidades.Comentario;
import sec12.enumeracao.ex02.entidades.Postagem;

public class Programa {
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow! That's awesome!");
		
		Postagem p1 = new Postagem(LocalDateTime.parse("21/06/2018 13:05:44", fmt1), "Traveling to New Zealand!", "I'm going to visit this beautiful country!", 12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
		
		Comentario c3 = new Comentario("Good Night!");
		Comentario c4 = new Comentario("May the force be with you!");		
		
		Postagem p2 = new Postagem(LocalDateTime.parse("28/07/2018 23:14:19", fmt1), "Good night guys", "See you tomorrow", 5);
		
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p2);
		
		
	}

}
