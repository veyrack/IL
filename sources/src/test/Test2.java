package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Interfaces.IBuildOrder;
import Interfaces.IObjectif;
import factory.Facto;

public class Test2 {

	@Test
	public void test() {
		IObjectif obj = Facto.createObjectif();
		
		
		IBuildOrder bo = Facto.createBO();
		
	}

}
