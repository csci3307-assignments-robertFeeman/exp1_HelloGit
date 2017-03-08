/**
 * 
 */
package com.mycompany.exp1.village;

/**
 * @author Robert
 *
 */
public class Village implements HasVillagers, GrowingVillage
{
	private int numberOfVillagers;
	
	public Village(int numberOfVillagers)
	{
		this.numberOfVillagers = numberOfVillagers;
	}
	
	@Override
	public int countOfVillagers() {
		// TODO Auto-generated method stub
		return numberOfVillagers;
	}

	@Override
	public int addVillagers(int addedVillagers) {
		numberOfVillagers += addedVillagers;
		return numberOfVillagers;
	}
	
	
	
}
