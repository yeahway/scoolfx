package com.scoolfx.desktop.api.convertor;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Partial Word Dictionary that stores the
 * 
 * @author Shekhar Rai
 *
 */
public class PWordDictionary extends HashMap<Integer, String> implements Serializable {

	private static final long serialVersionUID = 2940350525374663876L;

	private static final PWordDictionary dictionary = new PWordDictionary();

	static {
		dictionary.put(1, "One");
	}

}
