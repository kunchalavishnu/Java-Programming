import java.util.Arrays;

public class Reversearrya {
  public static void main(String[] args) {
    int[] a = {10, 20, 30, 40, 50};

for (int i = 0, j = a.length - 1; i < j; i++, j--) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

System.out.println(Arrays.toString(a));

  }     
}
