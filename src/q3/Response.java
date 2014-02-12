package q3;

import java.util.Collection;

/**
 * Response for question 3 and 4, containing doubles and strings.
 * 
 * @author ralvergnat
 * 
 */
public class Response {
	private Collection<Double> doubles;
	private Collection<String> strings;

	public Response(Collection<Double> doubles, Collection<String> strings) {
		super();
		this.doubles = doubles;
		this.strings = strings;
	}

	@Override
	public String toString() {
		return "[doubles=" + doubles + ", strings=" + strings + "]";
	}
	
	

}
