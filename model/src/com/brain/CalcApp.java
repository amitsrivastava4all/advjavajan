package com.brain;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalcApp
 */
@Stateless
//@Stateful
//@Singleton
public class CalcApp implements CalcAppRemote, CalcAppLocal {

    /**
     * Default constructor. 
     */
    public CalcApp() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

}
