public class ArrayOps{
  public static int sum(int[] arr){
    int sumArr = 0;
    for (int i=0; i<arr.length; i++) {
      sumArr += arr[i];
    }
    return sumArr;
  }

}
