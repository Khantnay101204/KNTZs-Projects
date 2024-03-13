package dataType;

public class Commandline_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum=Integer.parseInt(args[0]);
		int snum=Integer.parseInt(args[1]);
		int sum=fnum+snum;
		System.out.println("the sum number "+ sum);
	}

}
