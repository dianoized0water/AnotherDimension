public class ArrayOps{
  public static int sum(int[] arr){
    int sumArr = 0;
    for (int i=0; i<arr.length; i++) {
      sumArr += arr[i];
    }
    return sumArr;
  }

  public static int largest(int[] arr) {
    int compare = arr[0];
    for (int i=1; i<arr.length; i++) {
      if (arr[i]>compare){
        compare = arr[i];
      }
    }
    return compare;
  }
  
}
