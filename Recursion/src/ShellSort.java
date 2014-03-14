
public class ShellSort(int[] a) {
	int i1 = new int;
	int i;
	int j;
	int increment;
	int l = a.length;
}
    for (increment = l / 2; increment > 0; increment /= 2)
    {
           for (i = increment; i < l; i++)
        {
               int temp = a[i];
                   for (j = i; j >= increment; j -= increment) 
               {
                       if (temp < a[j - increment]) {
                           a[j] = a[j - increment];
                       } else {
                           break;
                       }
                   }
                  a[j] = temp;
       }
}
