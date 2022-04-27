package wait;

public class StaticWait {

	public static void main(String[] args) {

     System.out.println("Before wait");
     
     try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     System.out.println("After wait");

	}

}
