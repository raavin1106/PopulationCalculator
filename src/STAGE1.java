/* 	Creator: 			Raavin Ashwath Sundar Rajan
 	Date Created:		9/04/2018	
 	Date Last Updated:	22/04/2018
 	Input:				User Input
 	Output:				Output given in console
 	
 This program is used to calculate the growth rate of fish population.
*/




import java.util.Scanner;


public class STAGE1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
				String growthType;
				int startingPopulation=0;
				int numberofGenerations=0;	
				int gRateFixed=0;
				int[] gaRateVariable=new int[10];
				final int pondCapacity=5000;
				int finalPopulation=0;
				int died=0;
				Scanner sc=new Scanner(System.in);
			
				
			System.out.println("Type F for Fixed rate and V for Variable rate:");
			growthType=sc.next();
			
			/* This the code for Fixed Rate*/
			
			if(growthType.equalsIgnoreCase("F"))
			{
				System.out.println("Input starting population of fish:");
				startingPopulation=sc.nextInt();
				
				System.out.println("Input number of generations:");
				numberofGenerations=sc.nextInt();
			
				System.out.println("Input fixed growth rate:");
				gRateFixed=sc.nextInt();
				
				for(int i=0;i<numberofGenerations;i++)
				
				{
					finalPopulation=startingPopulation+((startingPopulation*gRateFixed)/100);
					startingPopulation=finalPopulation;
				}
			}
			
			/* This the code for Variable Rate*/
			
			else if(growthType.equalsIgnoreCase("V"))
			{
				System.out.println("Input starting population of fish:");
				startingPopulation=sc.nextInt();
				
				System.out.println("Input number of generations:");
				numberofGenerations=sc.nextInt();
			
				
				System.out.println("Input 10 rates of growth for successive generations:");
				
				for(int i=0; i<10;i++)
				{
					gaRateVariable[i]=sc.nextInt();
				
				
					System.out.println("gRateVariable"+ i +":"+gaRateVariable[i]);
					finalPopulation=startingPopulation+((startingPopulation*gaRateVariable[i])/100);
					startingPopulation=finalPopulation;
				}
			}
			
			else
			{
				System.out.println("Invalid Input!!!");
				System.exit(-1);
			}
			
			if(finalPopulation>pondCapacity)
			{
				died=finalPopulation-pondCapacity;
			}
			System.out.println("FinalPopulation:"+finalPopulation);
			System.out.println("Died:"+died);
			}

	{


	}

}
