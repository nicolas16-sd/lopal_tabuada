package br.sp.senai.jandira.tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.sp.senai.jandira.tabuada.model.Tabuada;


public class TelaTabuada {
	
	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinMultiplicador;
	private JTextField txtMinMultiplicador;
	private JLabel lblMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];
		
		public void criarTela() {
			JFrame tela = new JFrame();
			tela.setSize(265, 500);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			tela.setTitle("Tabuada");
			tela.setLocationRelativeTo(null);
			tela.setLayout(null);
			tela.setResizable(false);
			
			//Criar um label para inserir no JFrame
			//Multiplicando
			labelMultiplicando = new JLabel();
			labelMultiplicando.setText("Multiplicando: ");
			labelMultiplicando.setBounds(20, 10, 100, 20);
			
			txtMultiplicando = new JTextField();
			txtMultiplicando.setBounds(180, 10, 50, 20);

			
			//Minimo multiplicador
			lblMinMultiplicador = new JLabel();
			lblMinMultiplicador.setText("Minimo multiplicador: ");
			lblMinMultiplicador.setBounds(20, 50, 150, 30);
			
			txtMinMultiplicador = new JTextField();
			txtMinMultiplicador.setBounds(180, 50, 50, 20);
			
			//Máximo multiplicador
			lblMaxMultiplicador = new JLabel();
			lblMaxMultiplicador.setText("Máximo Multiplicador: ");
			lblMaxMultiplicador.setBounds(20, 90, 150, 30);
			
			txtMaxMultiplicador = new JTextField();
			txtMaxMultiplicador.setBounds(180, 90, 50, 20);
			
			//Botão de cálculo
			buttonCalcular = new JButton();
			buttonCalcular.setText("Calcular");
			buttonCalcular.setBounds(20, 140, 100, 20);
			
			//Botão de Limpar
			buttonLimpar = new JButton();
			buttonLimpar.setText("Limpar");
			buttonLimpar.setBounds(130, 140, 100, 20);
			
			//Exibição de lista
			listTabuada = new JList();
			listTabuada.setBounds(20, 180, 210, 300);
			
			//Tela
			tela.getContentPane().add(labelMultiplicando);
			tela.getContentPane().add(buttonCalcular);
			tela.getContentPane().add(txtMultiplicando);
			tela.getContentPane().add(lblMinMultiplicador);
			tela.getContentPane().add(txtMinMultiplicador);
			tela.getContentPane().add(lblMaxMultiplicador);
			tela.getContentPane().add(txtMaxMultiplicador);
			tela.getContentPane().add(buttonCalcular);
			tela.getContentPane().add(buttonLimpar);
			tela.getContentPane().add(listTabuada);
			
			//Configurar os ouvintes (listeners) dos botões
			buttonCalcular.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String multiplicando = txtMultiplicando.getText();
					System.out.println("O valor do multiplicando é " + multiplicando);
					
					String minMultiplicador = txtMinMultiplicador.getText();
					System.out.println("O valor do mínimo multiplicador é " + minMultiplicador);
					
					String maxMultiplicador = txtMaxMultiplicador.getText();
					System.out.println("O valor do máximo multiplicador é " + maxMultiplicador);					
				
					//Casting -> conversão de um tipo para outro
					double multiplicandoDouble = Double.parseDouble(multiplicando);
					double minMultiplicadorDouble = Double.parseDouble(minMultiplicador);
					double maxMultiplicadorDouble = Double.parseDouble(maxMultiplicador);
					
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();
				
				}
			});
			
			
			//Tela visível
			tela.setVisible(true);
	}
}

