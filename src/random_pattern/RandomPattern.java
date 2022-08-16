package random_pattern;

import java.util.Random;
import java.util.Scanner;

public class RandomPattern {
	
public void triPattern() {
	System.out.println("tripattern!\n");
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void reverseTriPattern() {
	System.out.println("reverseTripattern!\n");
	int size=5;
	for (int i=size;i>=0;i--) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void hollowREctangle() {
	System.out.println("hollow rectangle!\n");
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
	System.out.println("rectangle!\n");
	int size=5;
	for (int i=1;i<=size;i++) {
		for(int j=0;j<=size;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void butterFlyPattern() {
	System.out.println("buttrfly!\n");
	int size=5;
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
	System.out.println("Pyramid!\n");
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
	System.out.println("revPyramid!\n");
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
	Scanner scan=new Scanner(System.in);
	Random random=new Random();  
	
	
	System.out.println("\n random pattern printing console programme  \n");
	System.out.println("!!  enter 'U' for your choice or enter any other letter for random pattern : \n ");

    char ch=scan.next().charAt(0);
	int number=random.nextInt(7-1+1)+1;
if(ch=='U') {	
	
	    System.out.println("\n please select a choice for pattern  (1 to 7): \n");
	    int choice=0;
	    choice=scan.nextInt();
	
	
   if(choice>=1&&choice<8) {
	  switch(choice) {
	     case 1:
		    rnd.triPattern();
		    break;
	     case 2:
		    rnd.reverseTriPattern();
		    break;
	     case 3:
	     	rnd.hollowREctangle();
	     	break;
	     case 4:
	    	 rnd.rectanglePattern();
	    	 break;
	     case 5:
	    	 rnd.butterFlyPattern();
	    	 break;
	     case 6:
	    	 rnd.pyramidPattern();
	    	 break;
	     case 7:
	    	 rnd.revPyramidPattern();
	    	 break;
	  }
   }else if(choice>7||choice<1){
	   System.out.println("enter a valid option!!!");
	
   }
  }

else{
	System.out.println("\nthe random pattern is \n");
	switch(number) {
	case 1:
		rnd.triPattern();
		break;
	case 2:
		rnd.reverseTriPattern();
		break;
	case 3:
		rnd.hollowREctangle();
		break;
	case 4:
		rnd.rectanglePattern();
		break;
	case 5:
		rnd.butterFlyPattern();
		break;
	case 6:
		rnd.pyramidPattern();
		break;
	case 7:
		rnd.revPyramidPattern();
		break;
	}
}
System.out.println("\n programme end!!!");
}
}

