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

  public static int sum(int[][] arr){
    return ArrayOps.sum(ArrayOps.sumRows(arr));
  }
  
  public static int[] sumCols(int[][] matrix){
    int[] colsArray = new int[matrix[0].length];
    for (int i=0; i<matrix[0].length; i++){
      for (int j=0; j<matrix.length; j++){
        colsArray[i] += matrix[j][i];
      }
    }
    return colsArray;
  }
  
  public static boolean isRowMagic(int[][] matrix){
    boolean check = true;
    int[] summedMatrix = ArrayOps.sumRows(matrix);
    for (int i=1; i<summedMatrix.length; i++){
      if (summedMatrix[i] != summedMatrix[i-1]){
        check = false;
      }
    }
    return check;
  }
  
  public static boolean isColMagic(int[][] matrix){
    boolean check = true;
    int[] summedMatrix = ArrayOps.sumCols(matrix);
    for (int i=1; i<summedMatrix.length; i++){
      if (summedMatrix[i] != summedMatrix[i-1]){
        check = false;
      }
    }
    return check;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int[] colSum = ArrayOps.sumCols(matrix);
    int[] rowSum = ArrayOps.sumRows(matrix);
    return (boolean) (colSum[col] == rowSum[row]);
  }
}
