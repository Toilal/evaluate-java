package q4;

/**
 * A data generator provided by an external library
 * 
 * @author ralvergnat
 *
 */
public interface LibraryDataGenerator {
	public Double getDoubleValue(Interval<? extends Number> interval);
	public String getStringValue();
}
