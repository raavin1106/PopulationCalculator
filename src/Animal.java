/* 	Creator: 			Raavin Ashwath Sundar Rajan
 	Date Created:		9/04/2018	
 	Date Last Updated:	22/04/2018

Data Structure to hold the growth rate of the animal from a file
*/
import java.util.ArrayList;
import java.util.List;


public class Animal {
	
	private String name;
	
	private String habitat;
	
	private int intialPopulation;
	
	private List<Integer> growthRate = new ArrayList<Integer>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getIntialPopulation() {
		return intialPopulation;
	}

	public void setIntialPopulation(int intialPopulation) {
		this.intialPopulation = intialPopulation;
	}

	public List<Integer> getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(List<Integer> growthRate) {
		this.growthRate.addAll(growthRate);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", habitat=" + habitat + ", intialPopulation=" + intialPopulation
				+ ", growthRate=" + growthRate + "]";
	}
	
	
	
}
