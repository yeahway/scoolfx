package com.scoolfx.desktop.api.convertor;

import java.io.Serializable;

/**
 * This class converts the number into Nepalese words.
 * 
 * @author Shekhar Rai
 * @since SCoolFX 0.0.1
 *
 */
public class NepaleseNumbering implements Serializable {

	private static final long serialVersionUID = -6228680457510328166L;

	/**
	 * 
	 * 
	 * @param number
	 * @return number Neplase number
	 */
	private static String getWord(int number) {
		switch (String.valueOf(number).length()) {
		case 1:
		case 2:
			return getOneTwoLengthWord(number);

		case 3:
			return getThreeLengthWord(number);

		case 4:
			return getFourLengthWord(number);

		case 5:
			return getFiveLengthWord(number);

		case 6:
			return getSixLengthWord(number);

		case 7:
			return getSevenLengthWord(number);

		default:
			return null;
		}

	}

	/**
	 * Converts an integer with the range of 1 to 99 value into Nepalese number in
	 * words. system.
	 * 
	 * @param number
	 *            - an integer value(1-99)
	 * @return a Nepalese numbering value in words.
	 */
	private static String getOneTwoLengthWord(int number) {

		switch (number) {
		case 1:
			return "One";

		case 2:
			return "Two";

		case 3:
			return "Three";

		case 4:
			return "Four";

		case 5:
			return "Five";

		case 6:
			return "Six";

		case 7:
			return "Seven";

		case 8:
			return "Eight";

		case 9:
			return "Nine";

		case 10:
			return "Ten";

		case 11:
			return "Elevan";

		case 12:
			return "Twelve";

		case 13:
			return "Thirteen";

		case 14:
			return "Fourteen";

		case 15:
			return "Fifteen";

		case 16:
			return "Sixteen";

		case 17:
			return "Seventeen";

		case 18:
			return "Eighteen";

		case 19:
			return "Nineteen";

		case 20:
			return "Twenty";

		case 21:
			return "Twenty-One";

		case 22:
			return "Twenty-Two";

		case 23:
			return "Twenty-Three";

		case 24:
			return "Twenty-Four";

		case 25:
			return "Twenty-Five";

		case 26:
			return "Twenty-Six";

		case 27:
			return "Twenty-Seven";

		case 28:
			return "Twenty-Eight";

		case 29:
			return "Twenty-Nine";

		case 30:
			return "Thirty";

		case 31:
			return "Thirty-One";

		case 32:
			return "Thirty-Two";

		case 33:
			return "Thirty-Three";

		case 34:
			return "Thirty-Four";

		case 35:
			return "Thirty-Five";

		case 36:
			return "Thirty-Six";

		case 37:
			return "Thirty-Seven";

		case 38:
			return "Thirty-Eight";

		case 39:
			return "Thirty-Nine";

		case 40:
			return "Fourty";

		case 41:
			return "Fourty-One";

		case 42:
			return "Fourty-Two";

		case 43:
			return "Fourty-Three";

		case 44:
			return "Fourty-Four";

		case 45:
			return "Fourty-Five";

		case 46:
			return "Fourty-Six";

		case 47:
			return "Fourty-Seven";

		case 48:
			return "Fourty-Eight";

		case 49:
			return "Fourty-Nine";

		case 50:
			return "Fifty";

		case 51:
			return "Fifty-One";

		case 52:
			return "Fifty-Two";

		case 53:
			return "Fifty-Three";

		case 54:
			return "Fifty-Four";

		case 55:
			return "Fifty-Five";

		case 56:
			return "Fifty-Six";

		case 57:
			return "Fifty-Seven";

		case 58:
			return "Fifty-Eight";

		case 59:
			return "Fifty-Nine";

		case 60:
			return "Sixty";

		case 61:
			return "Sixty-One";

		case 62:
			return "Sixty-Two";

		case 63:
			return "Sixty-Three";

		case 64:
			return "Sixty-Four";

		case 65:
			return "Sixty-Five";

		case 66:
			return "Sixty-Six";

		case 67:
			return "Sixty-Seven";

		case 68:
			return "Sixty-Eight";

		case 69:
			return "Sixty-Nine";

		case 70:
			return "Seventy";

		case 71:
			return "Seventy-One";

		case 72:
			return "Seventy-Two";

		case 73:
			return "Seventy-Three";

		case 74:
			return "Seventy-Four";

		case 75:
			return "Seventy-Five";

		case 76:
			return "Seventy-Six";

		case 77:
			return "Seventy-Seven";

		case 78:
			return "Seventy-Eight";

		case 79:
			return "Seventy-Nine";

		case 80:
			return "Eighty";

		case 81:
			return "Eighty-One";

		case 82:
			return "Eighty-Two";

		case 83:
			return "Eighty-Three";

		case 84:
			return "Eighty-Four";

		case 85:
			return "Eighty-Five";

		case 86:
			return "Eighty-Six";

		case 87:
			return "Eighty-Seven";

		case 88:
			return "Eighty-Eight";

		case 89:
			return "Eighty-Nine";

		case 90:
			return "Nintey";

		case 91:
			return "Nintey-One";

		case 92:
			return "Nintey-Two";

		case 93:
			return "Nintey-Three";

		case 94:
			return "Nintey-Four";

		case 95:
			return "Nintey-Five";

		case 96:
			return "Nintey-Six";

		case 97:
			return "Nintey-Seven";

		case 98:
			return "Nintey-Eight";

		case 99:
			return "Nintey-Nine";
		}
		return "None";
	}

	/**
	 * Converts the provided integer value with the range of 100 to 999 into the
	 * Nepalese numbering words.
	 * 
	 * @param number
	 *            an integer value(100-999)
	 * @return a Nepalese numbering in words
	 */
	private static String getThreeLengthWord(int number) {
		StringBuilder tensAndOnes = new StringBuilder();
		switch (number) {
		case 100:
			return "Hundred";
		default:
			int tensones = Integer.parseInt(String.valueOf(number).substring(1, 3));
			if (tensones > 0) {
				tensAndOnes.append(getOneTwoLengthWord(tensones)).toString();
			}
			return new StringBuilder(getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 1))))
					.append("-Hundred").append(" ").append(tensAndOnes).toString();
		}

	}

	/**
	 * Converts the provided integer value into the Nepalese numbering in words.
	 * 
	 * @param number
	 *            an integer value(1000-9999)
	 * @return a Nepalese numbering in words
	 */
	private static String getFourLengthWord(int number) {
		StringBuilder hundred = new StringBuilder();
		StringBuilder tensAndOnes = new StringBuilder();
		switch (number) {
		case 1000:
			return "Ten-Thousand";
		default:
			int hundreds = Integer.parseInt(String.valueOf(number).substring(1, 2));
			int tensones = Integer.parseInt(String.valueOf(number).substring(2, 4));
			if (hundreds > 0) {
				hundred.append(", ").append(getOneTwoLengthWord(hundreds)).append("-Hundred").toString();
			}
			if (tensones > 0) {
				tensAndOnes.append(" ").append(getOneTwoLengthWord(tensones)).toString();
			}
			return new StringBuilder(getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 1))))
					.append("-Thousand").append(hundred).append(tensAndOnes).toString();
		}

	}

	/**
	 * Converts the provided integer value with the range of 10000 to 99999 in the
	 * Nepalese numbering in words.
	 * 
	 * @param number
	 *            an integer value(10000-99999)
	 * @return a Nepalese numbering in words
	 */
	private static String getFiveLengthWord(int number) {
		StringBuilder hundred = new StringBuilder();
		StringBuilder tensAndOnes = new StringBuilder();
		switch (number) {
		case 10000:
			return "Ten-Thousand";
		default:
			int hundreds = Integer.parseInt(String.valueOf(number).substring(2, 3));
			int tensones = Integer.parseInt(String.valueOf(number).substring(3, 5));
			if (hundreds > 0) {
				hundred.append(", ").append(getOneTwoLengthWord(hundreds)).append("-Hundred").toString();
			}
			if (tensones > 0) {
				tensAndOnes.append(" ").append(getOneTwoLengthWord(tensones)).toString();
			}
			return new StringBuilder(getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 2))))
					.append("-Thousand").append(hundred).append(tensAndOnes).toString();
		}

	}

	/**
	 * Converts the provided integer value with the range of 100000 to 999999 into
	 * the Nepalese numbering in words.
	 * 
	 * @param number
	 *            an integer value(100000-999999)
	 * @return a Nepalese numbering value in words.
	 */
	private static String getSixLengthWord(int number) {
		StringBuilder thousand = new StringBuilder();
		StringBuilder hundred = new StringBuilder();
		StringBuilder tensAndOnes = new StringBuilder();
		switch (number) {
		case 100000:
			return "One-Lakh";
		default:
			int thousands = Integer.parseInt(String.valueOf(number).substring(1, 3));
			int hundreds = Integer.parseInt(String.valueOf(number).substring(3, 4));
			int tensones = Integer.parseInt(String.valueOf(number).substring(4, 6));
			if (thousands > 0) {
				thousand.append(", ").append(getOneTwoLengthWord(thousands)).append("-Thousand").toString();
			}
			if (hundreds > 0) {
				hundred.append(", ").append(getOneTwoLengthWord(hundreds)).append("-Hundred").toString();
			}
			if (tensones > 0) {
				tensAndOnes.append(" ").append(getOneTwoLengthWord(tensones)).toString();
			}
			return new StringBuilder(getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 1))))
					.append("-Lakh").append(thousand).append(hundred).append(tensAndOnes).toString();
		}

	}

	/**
	 * Converts the provided integer value with the range of 1000000 to 9999999 into
	 * the Nepalese numbering value in words.
	 * 
	 * @param number
	 *            an integer value(1000000-9999999)
	 * @return a Nepalese numbering value in words.
	 */
	private static String getSevenLengthWord(int number) {
		StringBuilder thousand = new StringBuilder();
		StringBuilder hundred = new StringBuilder();
		StringBuilder tensAndOnes = new StringBuilder();
		switch (number) {
		case 1000000:
			return "Ten-Lakh";
		default:
			int thousands = Integer.parseInt((String.valueOf(number)).substring(2, 4));
			int hundreds = Integer.parseInt((String.valueOf(number)).substring(4, 5));
			int tenones = Integer.parseInt((String.valueOf(number)).substring(5, 7));
			if (thousands > 0) {
				thousand.append(", ").append(getOneTwoLengthWord(thousands)).append("-Thousand").toString();
			}
			if (hundreds > 0) {
				hundred.append(", ").append(getOneTwoLengthWord(hundreds)).append("-Hundred").toString();
			}
			if (tenones > 0) {
				tensAndOnes.append(" ").append(getOneTwoLengthWord(tenones)).toString();
			}
			return new StringBuilder(getOneTwoLengthWord(Integer.parseInt((number + "").substring(0, 2))))
					.append("-Lakh").append(thousand).append(hundred).append(tensAndOnes).toString();
		}

	}

	/**
	 * Converts the provided the number into an equivalent Nepalese numbering in
	 * words.
	 * 
	 * @param number
	 *            an String that holds the integer value
	 * @return a Nepalese numbering value in words.
	 */
	public static String conversion(String number) {
		String theWord = "";
		String helper = number;
		String breaking[] = helper.split("\\.");
		if (breaking.length > 1 && (Integer.parseInt(breaking[1])) > 0) {
			String rupeesHolder = getWord(Integer.parseInt(breaking[1])).trim();
			String paisaReform = "";
			if (breaking[1].trim().length() == 1) {
				paisaReform = new StringBuilder(breaking[1].trim()).append("0").toString();
			} else {
				paisaReform = breaking[1].trim().substring(0, 2);
			}
			StringBuilder rupees = new StringBuilder();
			String breakingSpace[] = rupeesHolder.split("\\ ");
			for (int j = 0; j < breakingSpace.length; j++) {
				if ((breakingSpace.length - 1) == j) {
					if (breakingSpace.length > 1) {
						rupees.append(", ").append(breakingSpace[j]);
					} else {
						rupees.append(breakingSpace[j]);
					}
				} else {
					rupees.append(breakingSpace[j]).append(" ");
				}
			}
			theWord = new StringBuilder(rupees.toString()).append(" Rupees and ")
					.append(getWord(Integer.parseInt(paisaReform))).append(" Paisa Only/-").toString();
		} else {
			String word = getWord(Integer.parseInt(breaking[0])).trim();
			String breakingSpace[] = word.split("\\ ");
			StringBuilder reWording = new StringBuilder();
			for (int j = 0; j < breakingSpace.length; j++) {
				if ((breakingSpace.length - 1) == j) {
					if (word.equals("")) {
					} else if (breakingSpace.length == 1) {
						reWording.append(breakingSpace[j]).append(" only/-");
					} else {
						reWording.append("and ").append(breakingSpace[j]).append(" only/-");
					}
					break;
				} else {
					reWording.append(breakingSpace[j]).append(" ");
				}
			}
			theWord = reWording.toString();
		}
		if (theWord.length() == 0) {
			theWord = "zero";
		}
		return theWord;
	}

}
