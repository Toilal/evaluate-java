package q3;

/**
 * A strategy to generate series of numbers and strings.
 * 
 * @author ralvergnat
 * 
 */
public interface DataGeneratorStrategy {
	/**
	 * Generates numbers
	 * 
	 * @param count
	 * @return generated numbers
	 */
	public Iterable<Double> getDoubles(int count);

	/**
	 * Generates string
	 * 
	 * @param count
	 * @return generated strings
	 */
	public Iterable<String> getStrings(int count);
}
