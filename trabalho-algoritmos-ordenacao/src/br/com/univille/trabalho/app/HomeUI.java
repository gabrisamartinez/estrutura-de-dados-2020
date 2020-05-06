package br.com.univille.trabalho.app;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HomeUI extends JFrame {

	private JButton btRefresh;
	private JComboBox<String> cbOrdernarPor;
	private List<String> listaOrdenarPor;
	private List<Produto> listaDeProdutos;
	private String criterioDeOrdenacaoAtual;
	private JLabel statusBar;
	private DefaultTableModel dataModel;

	public HomeUI() {
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Lista de produtos");
		setDataBase();
		setLayout();
	}

	public void setDataBase() {
		listaOrdenarPor = new ArrayList<String>();
		listaOrdenarPor.add("Mais populares");
		//listaOrdenarPor.add("Mais vendidos");
		listaOrdenarPor.add("Menor preço");
		listaOrdenarPor.add("Maior preço");
		listaOrdenarPor.add("Melhor avaliado");
		listaOrdenarPor.add("Produtos mais novos");

		listaDeProdutos = ProdutoDataBase.obterTodosOsProdutos();

	}

	public void setLayout() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		statusBar = new JLabel("...");
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		cbOrdernarPor = new JComboBox<String>();
		for(String s: listaOrdenarPor) {
			cbOrdernarPor.addItem(s);
		}
		cbOrdernarPor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selecionadoNovoCriterioDeOrdenacao();

			}
		});
		cbOrdernarPor.setSelectedIndex(0);

		buttonsPanel.add(new JLabel("Ordernar por:"));
		buttonsPanel.add(cbOrdernarPor);

		btRefresh = new JButton("Atualizar");
		btRefresh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ordernarLista();
			}
		});
		buttonsPanel.add(btRefresh);

		panel.add(buttonsPanel,BorderLayout.NORTH);


		//JTable

		dataModel = new DefaultTableModel() {
			public int getColumnCount() { return 5; }
			public int getRowCount() { return listaDeProdutos.size();}
			public Object getValueAt(int row, int col) { 
				
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

				
				
				Produto p = listaDeProdutos.get(row);
				Object o = null;
				
				switch(col) {
				case 0:
					o = p.getNome();
					break;
				case 1:
					o = p.getPreco();
					break;
				case 2:
					o = p.getAvaliacao();
					break;
				case 3:
					o = p.getQuantidadeDeVendas();
					break;
				case 4:
					o =  simpleDateFormat.format(p.getDataDeLancamento());
					break;
				}
				
				return o; 
				}
			
			public String getColumnName(int columnIndex) {
				String v[] = {"Nome", "Preço", "Avaliaçao", "Qtde de Vendas", "Data de Lançamento"};
				return v[columnIndex];
			}
		};
		JTable table = new JTable(dataModel);
		JScrollPane scrollpane = new JScrollPane(table);
		JPanel p = new JPanel();
		//p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//p.add(scrollpane);
		
		
		panel.add(scrollpane,BorderLayout.CENTER);
		
		JPanel statusBarPanel = new JPanel();
		statusBar .setText("Selecione uma forma de ordenaçao.");
		statusBarPanel.add(statusBar);
		
		panel.add(statusBarPanel,BorderLayout.SOUTH);
		

		add(panel);

	}

	private void selecionadoNovoCriterioDeOrdenacao() {
		criterioDeOrdenacaoAtual = (String )cbOrdernarPor.getSelectedItem();
		System.out.println("Selecionado novo criterio de Ordenacao :: "+criterioDeOrdenacaoAtual);
		statusBar.setText("Selecionado novo criterio de Ordenacao :: "+criterioDeOrdenacaoAtual+". Pressione o botao atualizar para reordernar a lista.");
	}

	private void ordernarLista() {
		System.out.println("Realize a ordenacao da lista");
		
		ServicoOrdenacao servico;
		if(criterioDeOrdenacaoAtual.equals("Mais populares")) {
			//não está certo!
			servico = new ImplementacaoPopulares();
			listaDeProdutos = servico.quicksort(listaDeProdutos, 0, listaDeProdutos.size() -1);
		} else if(criterioDeOrdenacaoAtual.equals("Menor preço")) {
			servico = new ImplementacaoMenorPreco();
			listaDeProdutos = servico.quicksort(listaDeProdutos, 0, listaDeProdutos.size() -1);
		} else if(criterioDeOrdenacaoAtual.equals("Produtos mais novos")) {
			servico = new ImplementacaoMaisNovo();
			listaDeProdutos = servico.quicksort(listaDeProdutos, 0, listaDeProdutos.size() -1);
		}
		// Criterio => criterioDeOrdenacaoAtual
		// lista => listaDeProdutosc
		//-----------------------------------------------------------------//
		// EDITE O CODIGO NESTE PONTO. 
		// FACA O MELHOR USO DAS TECNICAS DE ENGENHARIA DE SOFTWARE
		// E ORIENTACAO A OBJETOS
		//-----------------------------------------------------------------//
		// ORDENE A LISTA DE PRODUTOS CONFORME O CRITERIO SELECIONADO
		//-----------------------------------------------------------------//
		
		
		//-----------------------------------------------------------------//
		dataModel.fireTableDataChanged();
		statusBar.setText("Lista reordenada. Analise o resultado");
	}



}
