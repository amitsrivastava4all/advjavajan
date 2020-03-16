package com.brain;

import javax.ejb.Remote;

@Remote
public interface CalcAppRemote {
	
	public int add(int x, int y);

}
