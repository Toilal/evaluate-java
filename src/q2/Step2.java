package q2;

import java.io.Reader;

public interface Step2 {
	/**
	 * Generates a random string.<br>
	 * <br>
	 * 
	 * Possible strings must be loaded from resource "/q2/data.txt" (one string
	 * per line)<br>
	 * <br>
	 * 
	 * 
	 * @see Class#getResource(String)
	 * @see Class#getResourceAsStream(String)
	 * 
	 * @see Reader
	 * 
	 * @return
	 */
	public String generateString();
}
