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
			
			int resposta = JOptionPane.showConfirmDialog(null, "Você confirma sua média? " + media);
			
			if (resposta == JOptionPane.YES_OPTION) {
				
				if(media >= 7) {
					JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + " e você foi APROVADO!!");
					JOptionPane.showMessageDialog(null, "Parabéns!!");
				}else if(media > 5 && media < 7) {
					JOptionPane.showMessageDialog(null, "Você esta de RECUPERAÇÃO!!");
				}else {
					JOptionPane.showMessageDialog(null, "Olá " + nome + " você foi REPROVADO");
					JOptionPane.showMessageDialog(null, "Até próximo ano!!");
				}
			}else if(resposta == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Então refarça!!");
				}
			else {
				JOptionPane.showMessageDialog(null, "TCHAU!!");
			}
	}
	
}
		
		

	
