
public class bubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] {15,65,74,21,98,23,45,62,41};
		System.out.println("The bubble sort process is: ");
		for (int i=1; i<array.length; i++) {
			for(int j=0; j<array.length-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				System.out.print(array[j] + " ");
			}
			System.out.print("¡¶");
			for(int j = array.length-i; j<array.length; j++) {
				System.out.print(array[j]+ " ");
			}
			System.out.println("¡·");
		}

	}

}
