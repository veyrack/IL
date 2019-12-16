package factory;

import java.util.HashMap;

import Interfaces.IBuildOrder;
import Interfaces.IObjectif;
import simulation.BuildOrder;
import simulation.Objectif;

public class Facto {

	public static IObjectif createObjectif() {
		return new Objectif(10, 10, new HashMap<>());
	}

	public static IBuildOrder createBO() {
		return new BuildOrder();
	}

}
