package factory;

import Interfaces.IBuildOrder;
import Interfaces.IObjectif;
import bo.BuildOrder;
import objectif.GestObjectif;

public class Facto {

	public static IObjectif createObjectif() {
		return new GestObjectif();
	}

	public static IBuildOrder createBO() {
		return new BuildOrder();
	}

}
