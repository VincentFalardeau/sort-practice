
public class Main {

	public static void main(String[] args) {
		
		int[] t = {10,16,-7,12,15,10,9,5,6,3,9,5};
		
		int[] t1 = new int[12];
		System.out.println("Quick sort (tri par pivot)");
		System.arraycopy(t, 0, t1, 0, t.length);
		Quicksort.sort(t1);
		System.out.println();
		
		System.out.println("Selection sort");
		System.arraycopy(t, 0, t1, 0, t.length);
		Selectionsort.sort(t1);
		System.out.println();
		
		System.out.println("Selection sort - recursive");
		System.arraycopy(t, 0, t1, 0, t.length);
		Selectionsort.sortRecursive(t1);
		System.out.println();
		
		System.out.println("Insertion sort");
		System.arraycopy(t, 0, t1, 0, t.length);
		Insertionsort.sort(t1);
		System.out.println();
		
		System.out.println("Insertion sort - recursive");
		System.arraycopy(t, 0, t1, 0, t.length);
		Insertionsort.sortRecursive(t1);
		System.out.println();
		
		System.out.println("Merge sort");
		System.arraycopy(t, 0, t1, 0, t.length);
		Mergesort.sort(t1);
		System.out.println();

	}

}
