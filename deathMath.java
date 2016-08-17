package deathMath;

import javax.swing.JTextField;

import java.util.Random;




public class deathMath {
		
		static int dia;
		static int mes;
		static int ano;
		static String nome;
		

		JTextField	textField = new JTextField();


		public String data(){
			
			Random gerador = new Random();
			dia = gerador.nextInt(32) + 1;
			mes = gerador.nextInt(13) + 1;
			ano = gerador.nextInt(55) + 2015;

			String diaStr = String.valueOf(dia);
			String mesStr = String.valueOf(mes);
			String anoStr = String.valueOf(ano);


		StringBuilder builder = new StringBuilder();
		builder.append(" falecerá em ");
		builder.append(diaStr);
		builder.append("/");
		builder.append(mesStr);
		builder.append("/");
		builder.append(anoStr);
		builder.append(".");
						
				return builder.toString();
		
		}
		
		//Quando eu fornecer um nome, um cáluclo aleatório se faz e aparece o número de um dos dias.

	 		
	 		
		
	
}
	
 	

