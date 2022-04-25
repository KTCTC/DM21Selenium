package datepicker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleClass {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = df.format(new Date());
		System.out.println(formatted);

	}

}
