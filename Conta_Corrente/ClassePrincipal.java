package Conta_Corrente;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {
   public static void main(String args[]) throws IOException {
	   Estatistica[] estatistica = new Estatistica[10];
	   Metodos m = new Metodos();
	   int opc=0;
	   int i;
	   
	   for(i=0; i<10; i++) {
		   estatistica[i] = new Estatistica();
	   }
	   
	   while(opc != 9) {
		   opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Cadastro de Estatisticas \n 2 - Consulta por quantidade de acidentes"
		   		+ " \n 3 - Consulta por estatistica de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Fim programa"));
		   
		   switch(opc) {
		   case 1: estatistica = m.FCadastraEstatistica(estatistica);
		           break;
		   case 2: m.PQtdAcidentes(estatistica);
		           break;
		   case 3: m.PMaiorMenor(estatistica);
		           break;
		   case 4: m.PAcima(estatistica);
		           break;
		   case 9: JOptionPane.showMessageDialog(null, "Finaliza programa");
		           break;
		   default: JOptionPane.showMessageDialog(null, "Opção Inválida, digite novamente: ");
		   }
	   }
	   
   }
}
