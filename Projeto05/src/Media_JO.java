import java.util.Locale;

import javax.swing.JOptionPane;

public class Media_JO {

	public static void main(String[] args) {
		
			
			String nome;
			double nota1, nota2, nota3, nota4, media;
			int idade;
	 		
			Locale.setDefault(Locale.US);
			
			nome = JOptionPane.showInputDialog("Qual o seu nome?");
			
			idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:"));
			
			nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua primeira nota: "));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua segunda nota: "));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua terceira nota: "));
			nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua quarta nota: "));
			
			media = (nota1 + nota2 + nota3 + nota4)/4;
			
			int resposta = JOptionPane.showConfirmDialog(null, "Voc� confirma sua m�dia? " + media);
			
			if (resposta == JOptionPane.YES_OPTION) {
				
				if(media >= 7) {
					JOptionPane.showMessageDialog(null, "Seu nome �: " + nome + " e voc� foi APROVADO!!");
					JOptionPane.showMessageDialog(null, "Parab�ns!!");
				}else if(media > 5 && media < 7) {
					JOptionPane.showMessageDialog(null, "Voc� esta de RECUPERA��O!!");
				}else {
					JOptionPane.showMessageDialog(null, "Ol� " + nome + " voc� foi REPROVADO");
					JOptionPane.showMessageDialog(null, "At� pr�ximo ano!!");
				}
			}else if(resposta == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Ent�o refar�a!!");
				}
			else {
				JOptionPane.showMessageDialog(null, "TCHAU!!");
			}
	}
	
}
		
		

	
