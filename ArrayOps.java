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

  public static int[] sumRows(int[][] matrix){
    int[] sumMatrix = new int[matrix.length];
    for (int i=0; i<matrix.length; i++){
      sumMatrix[i] = ArrayOps.sum(matrix[i]);
    }
    return sumMatrix;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] largestMatrix = new int[matrix.length];
    for (int i=0; i<matrix.length; i++){
      largestMatrix[i] = ArrayOps.largest(matrix[i]);
    }
    return largestMatrix;
  }
}
