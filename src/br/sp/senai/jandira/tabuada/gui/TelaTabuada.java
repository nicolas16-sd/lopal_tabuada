package br.sp.senai.jandira.tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
		
		public void criarTela() {
			JFrame tela = new JFrame();
			tela.setSize(500, 700);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			tela.setTitle("Tabuada");
			tela.setLocationRelativeTo(null);
			tela.setLayout(null);
			
			JButton buttonCalcular = new JButton();
			buttonCalcular.setText("Calcular");
			
			
			//Criar um label para inserir no JFrame
			//Multiplicando
			JLabel labelMultiplicando = new JLabel();
			labelMultiplicando.setText("Multiplicando: ");
			labelMultiplicando.setBounds(20, 10, 100, 20);
			
			JTextField txtMultiplicando = new JTextField();
			txtMultiplicando.setBounds(180, 10, 50, 20);
			
			//Minimo multiplicador
			JLabel lblMinMultiplicador = new JLabel();
			lblMinMultiplicador.setText("Minimo multiplicador: ");
			lblMinMultiplicador.setBounds(20, 50, 150, 30);
			
			JTextField txtMinMultiplicador = new JTextField();
			txtMinMultiplicador.setBounds(180, 50, 50, 20);
			
			//Tela
			tela.getContentPane().add(labelMultiplicando);
			tela.getContentPane().add(buttonCalcular);
			tela.getContentPane().add(txtMultiplicando);
			tela.getContentPane().add(lblMinMultiplicador);
			tela.getContentPane().add(txtMinMultiplicador);
			
			tela.setVisible(true);
	}

}

