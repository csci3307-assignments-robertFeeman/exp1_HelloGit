/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author Robert
 *
 */
public class Spyro extends Mushu 
{
	private Village village2eat;
	
	public Spyro(Village village2eat)
	{
		this.village2eat = village2eat;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatVillagers(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillagers(Village villager) 
	{
		// TODO Auto-generated method stub
		return true;
	}
}
