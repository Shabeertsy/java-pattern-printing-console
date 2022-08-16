package random_pattern;

import java.util.Random;

public class RandomPattern {
	
public void triPattern() {
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void reverseTriPattern() {
	int size=5;
	for (int i=size;i>=0;i--) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void hollowREctangle() {
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=1;j<=size;j++) {
			if(j==1||i==size||i==1||j==size) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
		System.out.println();
		}
		
	}

public void rectanglePattern() {
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=0;j<=size;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void butterFlyPattern() {
	int size=8;
	for (int i=1;i<=size;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		for(int j=size;j>i;j--) {
			System.out.print("  ");
		}
		for (int k=0;k<i;k++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	for (int i=size-1;i>0;i--) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		for(int j=size;j>i;j--) {
			System.out.print("  ");
		}
		for (int k=0;k<i;k++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	}
	
public void pyramidPattern() {
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=size;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print(" *");
		}
		
		System.out.println();
	}
}

public void revPyramidPattern() {
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=size;j>=i;j--) {
			System.out.print(" *");
		}
		
		System.out.println();
	}
}
public static void main(String[] args) {
	RandomPattern rnd=new RandomPattern();
	
	Random random=new Random();
	int number=random.nextInt(7);
	
}
}

