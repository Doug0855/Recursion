
public class InsertionSort(int[] x) {
	for (int i=0; i<x.length; i++) {
		int t = x[i];
		int j;
		for (j=i-1; j>=0 && t<x[j]; j--) {
			x[j+1] = x[j];
		}
		
		x[j+1] = t;
	}
}
