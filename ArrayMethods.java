public class ArrayMethods {
     /*
     public String toString(int[][] ary) {
          String result = "[";
          if (ary[0][0] == 0) {
               result = result + "]";
          }
          else {
               for (int a = 0; i < ary.length)
          }
          return result;
     }
     */
     //PART 1
     public static int rowSum(int[][] ary, int x){
          int sum = 0;
          if (! (x > ary.length || x < 0) ) {
               for (int i = 0; i < (ary[x]).length; i++) {
                   sum = sum + ary[x][i];
               }
          }
          return sum;
     }
     public static int columnSum(int[][] ary, int x) {
          int sum = 0;
          if (! (x > ary[0].length || x < 0) ) {
               for (int i = 0; i < (ary.length); i++) {
                    sum = sum + ary[i][x];
               }
          }
          return sum;
     }
      //returns the sum of the elements in Row x of ary.
      //When x is past the last row count it as a zero. (NO indexOutOfBounds should ever occur)
      /*
        public static int columnSum(int[][] ary, int x){}
         //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
         //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)

        *PART 2 - use prior methods where appropriate
        public static int[] allRowSums(int[][] ary){}
         //returns an array of the row sums for each row of ary.
         //Index i of the return array contains the sum of elements in row i.

         public static int[] allColSums(int[][] ary){}
         //Returns an array with the column sum of each column of ary.
         //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
         //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
         //The length of the returned array should be the length of the LONGEST array in ary.
        *PART 3 - use prior methods where appropriate
        public static boolean isRowMagic(int[][] ary){}
          //checks if the array is row-magic (this means that every row has the same row sum).

        public static boolean isColumnMagic(int[][] ary){}
         //checks if the array is column-magic (this means that every column has the same column sum).
         */
     }
