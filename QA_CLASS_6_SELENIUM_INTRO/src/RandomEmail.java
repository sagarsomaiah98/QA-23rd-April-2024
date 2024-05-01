
public class RandomEmail {
	
	
	public void randomId() {
		
	int id=(int) (Math.random()*10000);
	System.out.println(id);
		
	}

	public static void main(String[] args) {
		
		RandomEmail random = new RandomEmail();
		random.randomId();
	}

}
