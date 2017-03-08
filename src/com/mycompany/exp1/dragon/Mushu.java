/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author Robert
 *
 */
public class Mushu implements Dragon 
{

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#breatheFire()
	 */
	@Override
	public boolean breatheFire() 
	{
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() 
	{
		// TODO Auto-generated method stub
		return new Boolean(false);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatVillagers(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatVillagers(Village villager) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
