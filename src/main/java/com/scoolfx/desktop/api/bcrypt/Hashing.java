package com.scoolfx.desktop.api.bcrypt;

import java.io.Serializable;
import java.util.function.Function;

public class Hashing implements Serializable {

	private static final long serialVersionUID = 1040688731167866274L;

	// This should be updated every year or two.
	private static final UpdatableBCrypt bcrypt = new UpdatableBCrypt(11);

	public static String hash(String password) {
		return bcrypt.hash(password);
	}

	public static boolean verifyAndUpdateHash(String password, String hash, Function<String, Boolean> updateFunc) {
		return bcrypt.verifyAndUpdateHash(password, hash, updateFunc);
	}
}
