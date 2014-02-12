package q4;

public class DoubleIntervalImpl implements Interval<Double> {
	private Double min;
	private Double max;
		
	public DoubleIntervalImpl(double min, double max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public Double getMin() {
		return min;
	}
	
	public Double getMax() {
		return max;
	}	
	
}
