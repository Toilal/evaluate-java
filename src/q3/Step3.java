package q3;

import q1.Step1;
import q2.Step2;

/**
 * Implementation MUST internally use <br/>
 * 
 * - {@link Step1} Implementation (response.DoubleGeneratorImpl)<br/>
 * 
 * - {@link Step2} Implementation (response.StringGeneratorImpl)<br/>
 * 
 * - {@link DataGeneratorStrategyImpl} to generate data<br/>
 */
public interface Step3 {
	/**
	 * Builds a {@link Response} object using
	 * {@link DataGeneratorStrategyImpl}, {@link Step2}
	 * Implementation (response.StringGeneratorImpl) and {@link Step1} Implementation (response.DoubleGeneratorImpl) <br/>
	 * <br/>
	 * 
	 * @return A {@link Response} with 5 Doubles and 5 Strings<br/>
	 */
	public Response getResponse();
}
