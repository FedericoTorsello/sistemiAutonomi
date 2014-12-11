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
		double max = 0.0;
		//find max
		for(int i = 0; i < input.length; i++)
			if(input[i] > max)
				max = input[i];
		double scale = maxValue/max;
		for(int i = 0; i < input.length; i++)
			out[i] = scale * input[i];
		return out;
	}
}
