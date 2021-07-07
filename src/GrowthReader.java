/* 	Creator: 			Raavin Ashwath Sundar Rajan
 	Date Created:		9/04/2018	
 	Date Last Updated:	22/04/2018
 	Input:				Animal.java, growth.text
 	Output:				Output given in an GUI along with a bar graph.
 	
 This program is used to calculate the growth rate a given set of species and provides a GUI as well.
*/
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.DefaultListModel;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;

/* This class is intended to read the growth rate of animals from a file and store it in List of Animal object. */

public class GrowthReader extends JApplet {

/* Coding for the GUI */
	
	public static JList<String> listSpecies;
	private static final long serialVersionUID = 1L;
	public static String temp1;
	public static String temp2;
	public static JList<Animal> speciesList;
	public static DefaultListModel<String> sModel;
	public static JPanel panel;
	public static int counter = 15;
	public static List<Animal> animalsGrowthRates;
	private static JTextField tfSpeciesName;
	private static JTextField tfIntPopulation;
	private static JLabel lblInitialPopulation;
	private static JTextField tfHabitat;
	private static JTextField tfGen1;
	private static JTextField tfGen2;
	private static JTextField tfGen3;
	private static JTextField tfGen4;
	private static JTextField tfGen5;
	private static JTextField tfGen6;
	private static JTextField tfGen7;
	private static JTextField tfGen8;
	private static JTextField tfGen9;
	private static JTextField tfGen10;
	private static JTextField tfTotPopulation;
	private static JTextField tfDied;
	public static int gR1;
	public static int gR2;
	public static int gR3;
	public static int gR4;
	public static int gR5;
	public static int gR6;
	public static int gR7;
	public static int gR8;
	public static int gR9;
	public static int gR10;
	public int totPopulation;
	public int initPopulation;
	public int diedPopulation;
	static final int capacity = 5000;
	private static final Object GR4 = null;
	private static final Object GR2 = null;
	private static final Object GR5 = null;
	private static final Object GR1 = null;
	private static final Object GR3 = null;
	private static JFXPanel chartFxPanel;
	private Chart chart;
	private List<Integer> selectedGrowthRates = new ArrayList<Integer>();

	public GrowthReader(List<Animal> animals) {
		this.animalsGrowthRates = animals;
	}

	public JPanel getGrowthRatePanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(10, 11, 840, 334);
		mainPanel.setLayout(null);

		JLabel lblName = new JLabel("Species Name");
		lblName.setBounds(5, 10, 105, 18);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Arial", Font.PLAIN, 14));
		mainPanel.add(lblName);

		tfSpeciesName = new JTextField();
		tfSpeciesName.setBounds(132, 10, 96, 20);
		tfSpeciesName.setFont(new Font("Arial", Font.PLAIN, 14));
		mainPanel.add(tfSpeciesName);
		tfSpeciesName.setColumns(20);

		JLabel lblHabitat = new JLabel("Habitat");
		lblHabitat.setBounds(5, 60, 47, 18);
		lblHabitat.setFont(new Font("Arial", Font.PLAIN, 14));
		mainPanel.add(lblHabitat);
		
		tfHabitat = new JTextField();
		tfHabitat.setBounds(132, 60, 96, 20);
		tfHabitat.setFont(new Font("Arial", Font.PLAIN, 14));
		tfHabitat.setHorizontalAlignment(SwingConstants.LEFT);
		tfHabitat.setColumns(20);
		mainPanel.add(tfHabitat);

		lblInitialPopulation = new JLabel("Initial Population");
		lblInitialPopulation.setBounds(5, 110, 127, 18);
		lblInitialPopulation.setFont(new Font("Arial", Font.PLAIN, 14));
		mainPanel.add(lblInitialPopulation);

		tfIntPopulation = new JTextField();
		tfIntPopulation.setBounds(132, 110,96, 20);
		tfIntPopulation.setFont(new Font("Arial", Font.PLAIN, 14));
		tfIntPopulation.setHorizontalAlignment(SwingConstants.LEFT);
		tfIntPopulation.setColumns(20);
		mainPanel.add(tfIntPopulation);
		
		JLabel lblTotalPopulation = new JLabel("Total Population");
		lblTotalPopulation.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTotalPopulation.setBounds(5, 160, 103, 14);
		mainPanel.add(lblTotalPopulation);
		
		tfTotPopulation = new JTextField();
		tfTotPopulation.setBounds(132, 160, 96, 20);
		tfTotPopulation.setFont(new Font("Arial", Font.PLAIN, 14));
		mainPanel.add(tfTotPopulation);
		tfTotPopulation.setColumns(10);
		
		JLabel lblDied = new JLabel("Died");
		lblDied.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDied.setBounds(5, 210, 48, 14);
		mainPanel.add(lblDied);
		
		tfDied = new JTextField();
		tfDied.setBounds(132, 210, 96, 20);
		mainPanel.add(tfDied);
		tfDied.setColumns(10);
		
		JLabel lblGen1 = new JLabel("GR1");
		lblGen1.setBounds(5, 275, 48, 14);
		lblGen1.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen1);
		
		tfGen1 = new JTextField();
		tfGen1.setColumns(10);
		tfGen1.setBounds(5, 300, 40, 20);
		mainPanel.add(tfGen1);
		
		JLabel lblGen2 = new JLabel("GR2");
		lblGen2.setBounds(85, 275, 48, 14);
		lblGen2.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen2);
		
		tfGen2 = new JTextField();
		tfGen2.setColumns(10);
		tfGen2.setBounds(85, 300, 40, 20);
		mainPanel.add(tfGen2);
		
		JLabel lblGen3 = new JLabel("GR3");
		lblGen3.setBounds(165, 275, 48, 14);
		lblGen3.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen3);
		
		tfGen3 = new JTextField();
		tfGen3.setColumns(10);
		tfGen3.setBounds(165, 300, 40, 20);
		mainPanel.add(tfGen3);
		
		JLabel lblGen4 = new JLabel("GR4");
		lblGen4.setBounds(245, 276, 48, 14);
		lblGen4.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen4);
		
		tfGen4 = new JTextField();
		tfGen4.setColumns(10);
		tfGen4.setBounds(245, 300, 40, 20);
		mainPanel.add(tfGen4);
		
		JLabel lblGen5 = new JLabel("GR5");
		lblGen5.setBounds(325, 275, 48, 14);
		lblGen5.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen5);
		
		tfGen5 = new JTextField();
		tfGen5.setColumns(10);
		tfGen5.setBounds(325, 300, 40, 20);
		mainPanel.add(tfGen5);
		
		JLabel lblGen6 = new JLabel("GR6");
		lblGen6.setBounds(405, 276, 48, 14);
		lblGen6.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen6);
		
		tfGen6 = new JTextField();
		tfGen6.setColumns(10);
		tfGen6.setBounds(405, 300, 40, 20);
		mainPanel.add(tfGen6);
		
		JLabel lblGen7 = new JLabel("GR7");
		lblGen7.setBounds(485, 275, 48, 14);
		lblGen7.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen7);
		
		tfGen7 = new JTextField();
		tfGen7.setColumns(10);
		tfGen7.setBounds(485, 300, 40, 20);
		mainPanel.add(tfGen7);
		
		JLabel lblGen8 = new JLabel("GR8");
		lblGen8.setBounds(565, 275, 48, 14);
		lblGen8.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen8);
		
		tfGen8 = new JTextField();
		tfGen8.setColumns(10);
		tfGen8.setBounds(565, 300, 40, 20);
		mainPanel.add(tfGen8);
		
		JLabel lblGen9 = new JLabel("GR9");
		lblGen9.setBounds(645, 275, 48, 14);
		lblGen9.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen9);
		
		tfGen9 = new JTextField();
		tfGen9.setColumns(10);
		tfGen9.setBounds(645, 300, 40, 20);
		lblGen9.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(tfGen9);
		
		JLabel lblGen10 = new JLabel("GR10");
		lblGen10.setBounds(725, 276, 40, 14);
		lblGen10.setFont(new Font("Arial", Font.PLAIN, 12));
		mainPanel.add(lblGen10);
		
		tfGen10 = new JTextField();
		tfGen10.setColumns(10);
		tfGen10.setBounds(725, 300, 40, 20);
		mainPanel.add(tfGen10);
		


		sModel = new DefaultListModel<String>();
		listSpecies = new JList<String>(sModel);

		this.animalsGrowthRates.forEach(animal -> {
			sModel.addElement(animal.getName());
		});


		listSpecies.setBounds(510, 8, 250, 200);
		listSpecies.setVisibleRowCount(10);
		listSpecies.setToolTipText("Select the Species");
		listSpecies.setFont(new Font("Arial", Font.PLAIN, 14));
		listSpecies.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mainPanel.add(listSpecies);


		/* Add actionListener to JList */
		listSpecies.getSelectionModel().addListSelectionListener(e -> {

			String selectedName = listSpecies.getSelectedValue();
			Optional<Animal> optionalSelectedAnimal = this.animalsGrowthRates.stream()
					.filter(s -> s.getName().equalsIgnoreCase(selectedName)).findFirst();
			tfSpeciesName.setText(selectedName);

			optionalSelectedAnimal.ifPresent(selectedAnimal -> {
				tfHabitat.setText(selectedAnimal.getHabitat());
				tfIntPopulation.setText(String.valueOf(selectedAnimal.getIntialPopulation()));
				initPopulation = Integer.parseInt(String.valueOf(selectedAnimal.getIntialPopulation()));
				selectedGrowthRates = selectedAnimal.getGrowthRate();


				tfGen1.setText(String.valueOf(selectedAnimal.getGrowthRate().get(0)));
				tfGen1.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen2.setText(String.valueOf(selectedAnimal.getGrowthRate().get(1)));
				tfGen2.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen3.setText(String.valueOf(selectedAnimal.getGrowthRate().get(2)));
				tfGen3.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen4.setText(String.valueOf(selectedAnimal.getGrowthRate().get(3)));
				tfGen4.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen5.setText(String.valueOf(selectedAnimal.getGrowthRate().get(4)));
				tfGen5.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen6.setText(String.valueOf(selectedAnimal.getGrowthRate().get(5)));
				tfGen6.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen7.setText(String.valueOf(selectedAnimal.getGrowthRate().get(6)));
				tfGen7.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen8.setText(String.valueOf(selectedAnimal.getGrowthRate().get(7)));
				tfGen8.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen9.setText(String.valueOf(selectedAnimal.getGrowthRate().get(8)));
				tfGen9.setFont(new Font("Arial", Font.PLAIN, 12));
				tfGen10.setText(String.valueOf(selectedAnimal.getGrowthRate().get(9)));
				tfGen10.setFont(new Font("Arial", Font.PLAIN, 12));
				
				 gR1 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(0)));
				 gR2 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(1)));
				 gR3 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(2)));
				 gR4 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(3)));
				 gR5 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(4)));
				 gR6 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(5)));
				 gR7 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(6)));
				 gR8 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(7)));
				 gR9 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(8)));
				 gR10 = Integer.parseInt(String.valueOf(selectedAnimal.getGrowthRate().get(9)));
				 				
				 totPopulation = initPopulation+(initPopulation*gR1/100);
				 totPopulation = totPopulation+(totPopulation*gR2/100);
				 totPopulation = totPopulation+(totPopulation*gR3/100);
				 totPopulation = totPopulation+(totPopulation*gR4/100);
				 totPopulation = totPopulation+(totPopulation*gR5/100);
				 totPopulation = totPopulation+(totPopulation*gR6/100);
				 totPopulation = totPopulation+(totPopulation*gR7/100);
				 totPopulation = totPopulation+(totPopulation*gR8/100);
				 totPopulation = totPopulation+(totPopulation*gR9/100);
				 totPopulation = totPopulation+(totPopulation*gR10/100);
				 tfTotPopulation.setText(String.valueOf(totPopulation));
				 tfTotPopulation.setFont(new Font("Arial", Font.PLAIN, 14));
				 
				 /* Calculations */
				 
				 if (totPopulation <= capacity) {
					 diedPopulation = 0;
				 }else {
					 diedPopulation = (totPopulation - capacity);
				 };
				 tfDied.setText(String.valueOf(diedPopulation));
				 tfDied.setFont(new Font("Arial", Font.PLAIN, 14));
				
				
				Platform.runLater(new Runnable() {
		            @Override
		            public void run() {
		                createScene(selectedAnimal);
		                
		            }
		        });

			});

		});
		return mainPanel;
	}

	/* The Bar graph coding begins here. */
	
	private void createScene(Animal selectedAnimal) {
		chart = createBarChart(selectedAnimal);
		chartFxPanel.setScene(new Scene(chart));
	}
	
	public ObservableList<BarChart.Series> getBarChartData(List<Integer> growthRates) {
        	ObservableList<BarChart.Series> bcData = FXCollections.<BarChart.Series>observableArrayList();
            for (int row = 0; row < growthRates.size(); row++) {
                ObservableList<BarChart.Data> series = FXCollections.<BarChart.Data>observableArrayList();
                for (int column = 0; column < growthRates.size(); column++) {
                    BarChart.Data data = new BarChart.Data("", Double.valueOf(100));
					series.add(data);
                }
                bcData.add(new BarChart.Series(series));
            }
        
        return bcData;
    }
	
	
	private BarChart createBarChart(Animal selectedAnimal) {
		
		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis   = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Species Generations vs Growth Rates");
 		xAxis.setLabel("Species Generations");   
        yAxis.setLabel("Growth Rates");

        for(int i=0; i < selectedAnimal.getGrowthRate().size();i++) {
        	XYChart.Series series1 = new XYChart.Series();
            series1.getData().add(new XYChart.Data(selectedAnimal.getName(), selectedAnimal.getGrowthRate().get(i)));
            bc.getData().addAll(series1);
        }
        return bc;
    }
	

	/**
	 * 
	 */

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				JFrame frame = new JFrame("Population Growth Calculator");
				frame.setSize(800,800);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				List<Animal> animals = getAnimalListFromFile();
				GrowthReader applet = new GrowthReader(animals);
				JPanel growthRatePanel = applet.getGrowthRatePanel();
				frame.setContentPane(applet.getContentPane());

				chartFxPanel = new JFXPanel();



				JPanel chartTablePanel = new JPanel();
				chartTablePanel.setLayout(new BorderLayout());

				JSplitPane jsplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
				jsplitPane.setTopComponent(growthRatePanel);
				jsplitPane.setBottomComponent(chartTablePanel);
				//jsplitPane.setDividerLocation(250);
				jsplitPane.setDividerLocation(320);
				chartTablePanel.add(chartFxPanel, BorderLayout.CENTER);

				applet.add(jsplitPane, BorderLayout.CENTER);
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);

			}
		});

	}

	private static List<Animal> getAnimalListFromFile() {
		List<Animal> animals = new ArrayList<Animal>();
		BufferedReader br = null;
		/* After downloading this file you must change the file path in order for the programme to run and display the output. */
		try {
			br = new BufferedReader(
					new FileReader("C:\\\\Ashwath School Work\\\\University\\\\Canberra Uni\\\\JAVA POPULATION CALC\\\\growth.txt"));
				

			String line = br.readLine();
			while (line != null) {
				// Fish;Pond;10;100,100,80,70,160,75,80,100,50,67

				String temp1 = line.substring(0, line.lastIndexOf(";")); // Output of this line --> Fish;Pond;10
				String temp2 = line.substring(line.lastIndexOf(";") + 1, line.length()); // Output of this line -->
																							// 100,100,80,70,160,75,80,100,50,67
				String[] temp1Array = temp1.split(";");
				Animal animal = new Animal();
				animal.setName(temp1Array[0]);
				animal.setHabitat(temp1Array[1]);
				animal.setIntialPopulation(Integer.valueOf(temp1Array[2]));

				// Below line converts comma seperated string 100,100,80,70,160,75,80,100,50,67
				// to List of Integer. Used Java 8 Streams to achieve this.
				List<Integer> growthRates = Arrays.stream(temp2.split("\\s*,\\s*")).map(Integer::parseInt)
						.collect(Collectors.toList());
				animal.setGrowthRate(growthRates);

				animals.add(animal);

				line = br.readLine();
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return animals;
	}
}
