package sec10.foreach;

public class Main {

	public static void main(String[] args) {

		Object[] vect = new Object[] {"Maria", true, 1, 3.14};
		
//		Laço for Padrão
//		for (int i = 0; i < vect.length; i++) {
//			System.out.println(vect[i]);
//		}
		
//		Laço For Each
		for (Object obj : vect){
			System.out.println(obj);
		}
//		Para cada objeto 'obj', dentro de vect, faça:
		
	}

}
