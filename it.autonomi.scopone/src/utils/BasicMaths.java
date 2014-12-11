package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicMaths {

	/**
	 * @param input
	 * @param maxValue
	 * @return Array normalizzato secondo il valore maxValue
	 */
	public static double[] normalizeArray(double[] input, double maxValue)
	{
		double[] out = new double[input.length];
		List arrayAsList = Arrays.asList(input);
		double max = Collections.max(arrayAsList);
		double scale = maxValue/max;
		for(int i = 0; i < input.length; i++)
			out[i] = scale * input[i];
		return out;
	}
}
