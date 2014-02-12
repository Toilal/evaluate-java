package q3;

import java.util.ArrayList;

/**
 * Implementation for {@link DataGeneratorStrategy}, using a {@link DataGenerator}
 * 
 * @author ralvergnat
 * 
 */
public class DataGeneratorStrategyImpl implements DataGeneratorStrategy {
	private DataGenerator generator;

	public DataGeneratorStrategyImpl(DataGenerator generator) {
		this.generator = generator;
	}

	@Override
	public Iterable<Double> getDoubles(int count) {
		ArrayList<Double> ret = new ArrayList<Double>();
		for (int i = 0; i < count; i++) {
			ret.add(generator.generateDouble(-i*10, i*20));
		}
		return ret;
	}

	@Override
	public Iterable<String> getStrings(int count) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			ret.add(generator.generateString());
		}
		return ret;
	}
}
