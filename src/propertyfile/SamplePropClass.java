package propertyfile;

public class SamplePropClass {

	public static void main(String[] args) {
		PropertyHelper prop = new PropertyHelper("DM21Prop.properties");		
		
		System.out.println(prop.getPropertyValue("baseURL"));
		
		PropertyHelper prop1 = new PropertyHelper("Env.properties");
		System.out.println(prop1.getPropertyValue("baseURL"));
		
		

	}

}
