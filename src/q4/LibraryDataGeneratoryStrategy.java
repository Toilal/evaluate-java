package q4;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

import q1.Step1;
import q3.DataGeneratorStrategy;

/**
 * A library class implementing {@link DataGeneratorStrategy}.
 * 
 * @author ralvergnat
 * 
 */
public class LibraryDataGeneratoryStrategy implements DataGeneratorStrategy {
	private LibraryDataGenerator externalGenerator;

	public LibraryDataGeneratoryStrategy(Step1 doubleGenerator) {
		this.externalGenerator = getConfigurationLibraryDataGenerator(doubleGenerator);
	}
	
	/**
	 * Loads {@link LibraryDataGenerator} from configuration file.
	 * 
	 * @return
	 */
	public static LibraryDataGenerator getConfigurationLibraryDataGenerator(Step1 doubleGenerator) {
		String generatorClassName = System.getProperty("generator.class");

		Class<? extends LibraryDataGenerator> generatorClass;
		try {
			generatorClass = (Class<? extends LibraryDataGenerator>) Class.forName(generatorClassName);
			return generatorClass.getConstructor(Step1.class).newInstance(doubleGenerator);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return new DefaultLibraryDataGenerator(doubleGenerator);
	}

	@Override
	public final Collection<Double> getDoubles(int count) {
		ArrayList<Double> ret = new ArrayList<Double>();
		for (int i = 0; i < count; i++) {
			ret.add(externalGenerator.getDoubleValue(new DoubleIntervalImpl(-i * 2, i * 4)));
		}
		return ret;
	}

	@Override
	public final Collection<String> getStrings(int count) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < count; i++) {
			ret.add(externalGenerator.getStringValue());
		}
		return ret;
	}
}
