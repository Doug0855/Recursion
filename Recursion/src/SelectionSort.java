public static void selectionSort(int[] x) {
    for (int i=0; i<x.length-1; i++) {
        for (int j=i+1; j<x.length; j++) {
            if (x[i] > x[j]) {
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;
            }
        }
    }
}