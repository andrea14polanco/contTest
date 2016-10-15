

public class Calculadora {
	
	public static void main(String[] args) {
		System.out.println("Hello cal");
	}
	

	public long dif(int n, int m){
		return n-m;
		
	}

	public long mult(int n, int m){
		return m*n;
		
	}

	public long div(int n, int m){
		if(n!=0 && m != 0)
			return n/m;
		return -1;
		
	}

	public long sum(int n, int m) {
		return n+m;
	}

	


}
