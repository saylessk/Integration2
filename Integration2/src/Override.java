
public class Override {
	
	public static void main(String args[]) {
		Done a = new Done();
		Done b = new over();
		
		
		a.end();
		b.end();
		
	}
	
	static class Done {
		public void end() {
			System.out.println("Thank you for looking at my program!");
		}
	}
	
	static class over extends Done {
		
		public void end() {
			System.out.println("Hopefully you come back when I submit");
		}
	}

}
