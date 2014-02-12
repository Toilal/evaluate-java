package q4;

/**
 * Represents an interval for numbers, with a min and a max value
 * 
 * @author ralvergnat
 *
 * @param <T> type of number
 */
public interface Interval<T extends Number> {
	public T getMin();
	public T getMax();
}
