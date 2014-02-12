import q1.Step1;
import q3.Response;
import response.Step1Impl;
import response.Step2Impl;
import response.Step3Impl;
import response.Step4Impl;


public class Main {
	public static void main(String[] args) {
		Step1Impl q1 = new Step1Impl();
	
		double generateDouble = q1.generateDouble(-10, 10);
		System.out.println("Q1: " + generateDouble);
		Step2Impl q2 = new Step2Impl();
		
		String generateString = q2.generateString();
		System.out.println("Q2: " + generateString);
		
		Step3Impl question3Impl = new Step3Impl();
		Response responseQ3 = question3Impl.getResponse();
		System.out.println("Q3: " + responseQ3);
		
		Step1 allwaysMaxGenerator = new Step1() {
			@Override
			public double generateDouble(double min, double max) {
				return max;
			}
		};
		
		Step4Impl question4Impl = new Step4Impl();
		Response responseQ4 = question4Impl.getResponse(allwaysMaxGenerator);
		System.out.println("Q4: " + responseQ4);
	}
}
