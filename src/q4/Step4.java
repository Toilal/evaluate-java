package q4;

import q1.Step1;
import q2.Step2;
import q3.DataGeneratorStrategyImpl;
import q3.Step3;
import q3.Response;

/**
 * Implementation MUST internally use <br/>
 * 
 * - {@link Step2} Implementation (response.StringGeneratorImpl)<br/>
 * 
 * - {@link LibraryDataGeneratoryStrategy} to generate data<br/>
 * 
 */
public interface Step4 {
	/**
	 * Builds a {@link Response} object using {@link LibraryDataGeneratoryStrategy},
	 * {@link Step2} Implementation (response.StringGeneratorImpl) and any
	 * {@link Step1} passed as parameter .<br/>
	 * <br/>
	 * 
	 * Returned object must be the same as {@link Step3}, but using
	 * {@link LibraryDataGeneratoryStrategy} instead of
	 * {@link DataGeneratorStrategyImpl}.<br/>
	 * <br/>
	 * 
	 * TIP: An adapter should be use to implement {@link LibraryDataGenerator}
	 * using passed {@link Step1} and {@link Step2}.<br/>
	 * <br/>
	 * 
	 * TIP2: LibraryDataGenerator used by {@link LibraryDataGeneratoryStrategy}
	 * is configurable with a java properties file, but this is not documented.
	 * You have to read source code to understand how to set your own
	 * {@link LibraryDataGenerator} implementation.<br/>
	 * <br/>
	 * 
	 * TIP3: {@link LibraryDataGenerator} implementation used by
	 * {@link LibraryDataGeneratoryStrategy} MUST use doubleGenerator parameter
	 * and<br/>
	 * 
	 * 
	 * @param doubleGenerator
	 *            random generator for doubles. Implementation MUST use this
	 *            generator.
	 * 
	 * 
	 * @return A {@link Response} with 5 Doubles and 5 Strings<br/>
	 */
	public Response getResponse(Step1 doubleGenerator);
}
