import java.util.Arrays;

public class Tester{
  public static void main(String args[]){
    int[][]  A  =  {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
  }
}
