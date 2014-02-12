package q4;

import java.util.Random;

import q1.Step1;

/**
 * Really dumb generator implementation for our fake library.
 * 
 * @author ralvergnat
 *
 */
public class DefaultLibraryDataGenerator implements LibraryDataGenerator {
	private Random random = new Random();
	
	
	private String[] strings = new String[] {"one", "two", "three"};


	private Step1 m_doubleGenerator;

	public DefaultLibraryDataGenerator(Step1 doubleGenerator) {
		m_doubleGenerator = doubleGenerator;
	}

	@Override
	public Double getDoubleValue(Interval<? extends Number> interval) {
		Number min = interval.getMin();
		Number max = interval.getMax();
		return m_doubleGenerator.generateDouble(min.doubleValue(), max.doubleValue());
	}

	@Override
	public String getStringValue() {
		return strings[random.nextInt(strings.length)];
	}

}
