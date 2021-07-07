/* 	Creator: 			Raavin Ashwath Sundar Rajan
 	Date Created:		9/04/2018	
 	Date Last Updated:	22/04/2018
 	Input:				User Input
 	Output:				Output given in an GUI
 	
 This program is used to calculate the growth rate of fish population.
*/
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIStage2 {

	private JFrame frame;
	private JTextField JTextField_species;
	private JTextField JTextField_startingpop;
	private JTextField JTextField_generations;
	private JTextField JTextField_habitat;
	private JTextField JTextField_fixed_rate;
	private JTextField JTextField_array0;
	private JTextField JTextField_array1;
	private JTextField JTextField_array2;
	private JTextField JTextField_array3;
	private JTextField JTextField_array4;
	private JTextField JTextField_array5;
	private JTextField JTextField_array6;
	private JTextField JTextField_array7;
	private JTextField JTextField_array8;
	private JTextField JTextField_array9;
	private JTextField JTextField_finalpop;
	private ButtonGroup rates = new ButtonGroup();
	private JTextField JTextField_diedfish;
	private JLabel lblValueMustBe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIStage2 window = new GUIStage2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the application.
	 */
	public GUIStage2() {
		initialize();
	}

	/* Auto coding when different constructors are added manually in the Design View.*/
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPECIES:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(21, 65, 51, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JTextField_species = new JTextField();
		JTextField_species.setBounds(160, 62, 96, 19);
		frame.getContentPane().add(JTextField_species);
		JTextField_species.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("STARTING POPULATION:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(21, 103, 155, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextField_startingpop = new JTextField();
		JTextField_startingpop.setBounds(160, 100, 96, 19);
		frame.getContentPane().add(JTextField_startingpop);
		JTextField_startingpop.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("GENERATIONS:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(21, 144, 85, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextField_generations = new JTextField();
		JTextField_generations.setBounds(160, 141, 96, 19);
		frame.getContentPane().add(JTextField_generations);
		JTextField_generations.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("GROWTH RATE (%):");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(21, 183, 114, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("HABITAT:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(326, 65, 58, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextField_habitat = new JTextField();
		JTextField_habitat.setBounds(443, 61, 96, 19);
		frame.getContentPane().add(JTextField_habitat);
		JTextField_habitat.setColumns(10);
		
		JRadioButton JRadioButton_Fixed = new JRadioButton("FIXED RATE");
		JRadioButton_Fixed.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		JRadioButton_Fixed.setForeground(Color.BLUE);
		JRadioButton_Fixed.setBounds(17, 220, 103, 21);
		frame.getContentPane().add(JRadioButton_Fixed);
		
		JTextField_fixed_rate = new JTextField();
		JTextField_fixed_rate.setToolTipText("Value must be 0 when selecting Variable Rate");
		JTextField_fixed_rate.setText("0");
		JTextField_fixed_rate.setBounds(160, 221, 66, 19);
		frame.getContentPane().add(JTextField_fixed_rate);
		JTextField_fixed_rate.setColumns(10);
		
		JRadioButton JRadioButton_Variable = new JRadioButton("VARIABLE RATE");
		JRadioButton_Variable.setForeground(Color.MAGENTA);
		JRadioButton_Variable.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		JRadioButton_Variable.setBounds(17, 256, 119, 21);
		frame.getContentPane().add(JRadioButton_Variable);
		
		rates.add(JRadioButton_Fixed);
		rates.add(JRadioButton_Variable);
		
		JTextField_array0 = new JTextField();
		JTextField_array0.setBounds(80, 302, 30, 19);
		frame.getContentPane().add(JTextField_array0);
		JTextField_array0.setColumns(10);
		
		JTextField_array1 = new JTextField();
		JTextField_array1.setColumns(10);
		JTextField_array1.setBounds(120, 302, 30, 19);
		frame.getContentPane().add(JTextField_array1);
		
		JTextField_array2 = new JTextField();
		JTextField_array2.setColumns(10);
		JTextField_array2.setBounds(160, 302, 30, 19);
		frame.getContentPane().add(JTextField_array2);
		
		JTextField_array3 = new JTextField();
		JTextField_array3.setColumns(10);
		JTextField_array3.setBounds(200, 302, 30, 19);
		frame.getContentPane().add(JTextField_array3);
		
		JTextField_array4 = new JTextField();
		JTextField_array4.setColumns(10);
		JTextField_array4.setBounds(241, 302, 30, 19);
		frame.getContentPane().add(JTextField_array4);
		
		JTextField_array5 = new JTextField();
		JTextField_array5.setColumns(10);
		JTextField_array5.setBounds(281, 302, 30, 19);
		frame.getContentPane().add(JTextField_array5);
		
		JTextField_array6 = new JTextField();
		JTextField_array6.setColumns(10);
		JTextField_array6.setBounds(321, 302, 30, 19);
		frame.getContentPane().add(JTextField_array6);
		
		JTextField_array7 = new JTextField();
		JTextField_array7.setColumns(10);
		JTextField_array7.setBounds(361, 302, 30, 19);
		frame.getContentPane().add(JTextField_array7);
		
		JTextField_array8 = new JTextField();
		JTextField_array8.setColumns(10);
		JTextField_array8.setBounds(403, 302, 30, 19);
		frame.getContentPane().add(JTextField_array8);
		
		JTextField_array9 = new JTextField();
		JTextField_array9.setColumns(10);
		JTextField_array9.setBounds(443, 302, 30, 19);
		frame.getContentPane().add(JTextField_array9);
		
		/* This where the calculation operation for the fixed growth rate and variable growth rate takes place when the "Calculate" JButton in the GUI is clicked.*/
		
		JButton JButton_Calculate = new JButton("Calculate");
		JButton_Calculate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				int startingPopulation=0;
				int numberofGenerations=0;	
				int  gRateFixed=0;
				int [] gaRateVariable;
				gaRateVariable=new int[10];
				final int pondCapacity=5000;
				int finalPopulation=0;
				int died=0;
				int gRateVariable;
				
				
				gRateFixed = Integer.parseInt(JTextField_fixed_rate.getText());
				
				
				try
				{
					startingPopulation=Integer.parseInt(JTextField_startingpop.getText());
					numberofGenerations=Integer.parseInt(JTextField_generations.getText());
					
					if (gRateFixed !=0)
					{
						
						for(int i=0;i<numberofGenerations;i++)
							
						{
							finalPopulation=startingPopulation+((startingPopulation*gRateFixed)/100);
							startingPopulation = finalPopulation;
						}
						
						if(finalPopulation<pondCapacity)
						{
							died=finalPopulation-pondCapacity;
							JTextField_finalpop.setText(Integer.toString(finalPopulation));
							
						}
						else 
						{
						    died=finalPopulation-pondCapacity;
							JTextField_finalpop.setText(Integer.toString(finalPopulation)); 
							JTextField_diedfish.setText(Integer.toString(died));
							}
					}
						else if (gRateFixed <=0) /* Enter arrays */
						{
							JRadioButton_Fixed.setEnabled(false);
							JTextField_fixed_rate.setText("0");
							JTextField_fixed_rate.setEnabled(false);

							
							gaRateVariable[0] = Integer.parseInt(JTextField_array0.getText());
							gaRateVariable[1] = Integer.parseInt(JTextField_array1.getText());
							gaRateVariable[2] = Integer.parseInt(JTextField_array2.getText());
							gaRateVariable[3] = Integer.parseInt(JTextField_array3.getText());
							gaRateVariable[4] = Integer.parseInt(JTextField_array4.getText());
							gaRateVariable[5] = Integer.parseInt(JTextField_array5.getText());
							gaRateVariable[6] = Integer.parseInt(JTextField_array6.getText());
							gaRateVariable[7] = Integer.parseInt(JTextField_array7.getText());
							gaRateVariable[8] = Integer.parseInt(JTextField_array8.getText());
							gaRateVariable[9] = Integer.parseInt(JTextField_array9.getText());
						
						     
                            finalPopulation=startingPopulation;
                            for(int i=0; i<gaRateVariable.length; i++)
                                           
                            {
            gRateVariable= (finalPopulation*gaRateVariable[i])/100;
            finalPopulation=(finalPopulation+gRateVariable);               
                            }
                            if (finalPopulation<=pondCapacity)
                            {
                                            died = 0;
                            JTextField_finalpop.setText(Integer.toString(finalPopulation));
                            JTextField_diedfish.setText(Integer.toString(died));
                            }
                            else
                            {
                            	died = finalPopulation - pondCapacity;
                            	JTextField_finalpop.setText(Integer.toString(finalPopulation));
                                            JTextField_diedfish.setText(Integer.toString(died));
                            }
                            }
                            }
                            catch(Exception a)
                            {
                                            JOptionPane.showMessageDialog(null,"Please enter a valid number");
                            }
                                            }
                            })
                            ;
		JButton_Calculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		JButton_Calculate.setBounds(21, 388, 114, 21);
		frame.getContentPane().add(JButton_Calculate);
		
		JLabel lblPopulationGrowthCalculator = new JLabel("POPULATION GROWTH CALCULATOR");
		lblPopulationGrowthCalculator.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblPopulationGrowthCalculator.setForeground(Color.RED);
		lblPopulationGrowthCalculator.setBounds(156, 10, 263, 13);
		frame.getContentPane().add(lblPopulationGrowthCalculator);
		
		JLabel lblFinalPopulation = new JLabel("FINAL POPULATION:");
		lblFinalPopulation.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblFinalPopulation.setBounds(326, 103, 119, 13);
		frame.getContentPane().add(lblFinalPopulation);
		
		/* This where the exit operation takes place when the "Exit" JButton in the GUI is clicked.*/
		
		JButton JButton_Exit = new JButton("Exit");
		JButton_Exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		
		JButton_Exit.setFont(new Font("Tahoma", Font.BOLD, 11));
		JButton_Exit.setBounds(469, 387, 114, 21);
		frame.getContentPane().add(JButton_Exit);
		
		JTextField_finalpop = new JTextField();
		JTextField_finalpop.setEditable(false);
		JTextField_finalpop.setBounds(445, 99, 96, 20);
		frame.getContentPane().add(JTextField_finalpop);
		JTextField_finalpop.setColumns(10);
		
		JLabel lblDied = new JLabel("DIED:");
		lblDied.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDied.setBounds(326, 143, 48, 14);
		frame.getContentPane().add(lblDied);
		
		JTextField_diedfish = new JTextField();
		JTextField_diedfish.setEditable(false);
		JTextField_diedfish.setBounds(443, 140, 96, 20);
		frame.getContentPane().add(JTextField_diedfish);
		JTextField_diedfish.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JTextField_species.setText("");
				JTextField_habitat.setText("");
				JTextField_generations.setText("");
				JTextField_startingpop.setText("");
				JRadioButton_Fixed.setEnabled(true);
				JTextField_fixed_rate.setEnabled(true);
				JTextField_fixed_rate.setText("");
				JTextField_array0.setText("");
				JTextField_array1.setText("");
				JTextField_array2.setText("");
				JTextField_array3.setText("");
				JTextField_array4.setText("");
				JTextField_array5.setText("");
				JTextField_array6.setText("");
				JTextField_array7.setText("");
				JTextField_array8.setText("");
				JTextField_array9.setText("");
				JTextField_finalpop.setText("");
				JTextField_diedfish.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(248, 387, 89, 23);
		frame.getContentPane().add(btnClear);
		
		lblValueMustBe = new JLabel("[ Value must be 0 when selecting Variable rate ]");
		lblValueMustBe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblValueMustBe.setBounds(239, 223, 300, 14);
		frame.getContentPane().add(lblValueMustBe);

	}
}

