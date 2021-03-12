package CTF011038.JAVAP2.L8;

public class JAVAP2_Lesson8 {
public static void main(String[] args) {
	int[][] tdArray= {
			{1,2,3},{4,5},{6,7,8,9}
	};
//1
	for (int[] row : tdArray) {
		for(int element:row) {
			System.out.println(element);
		}
	}
	
//2
	System.out.println("-------------------");
	int sum=0;
	for(int row=0; row<tdArray.length;row++) {
		sum+=tdArray[row][tdArray[row].length-1];
	}
	System.out.println(sum);
		
		
	}
}