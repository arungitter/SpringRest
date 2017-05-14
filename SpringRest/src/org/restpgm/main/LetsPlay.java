package org.restpgm.main;

import java.util.HashMap;
import java.util.Map;

public class LetsPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Local, String> map = new HashMap<Local, String>();

		map.put(new Local(), "Arun");
		map.put(new Local(), "value");
		System.out.println(map);
	}

}

class Local {

}
