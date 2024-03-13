package codeWarsStuffs;

public class CatYearDogYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int catYear=15;
		int dogYear=15;
		int cathuman=0;
		int doghuman=0;
		for (int i=1;i<=catYear;i++) {
			if(i==1) {
				cathuman=15;
			}
			else if(i==2) {
				cathuman+=9;
			}
			else {
				cathuman+=4;
			}
		}
		for (int i=1;i<=dogYear;i++) {
			if(i==1) {
				doghuman=15;
			}
			else if(i==2) {
				doghuman+=9;
			}
			else {
				doghuman+=5;
			}
		}
			
		System.out.println(cathuman);
		System.out.println(doghuman);
	}

}
