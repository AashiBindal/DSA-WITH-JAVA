class basics {
    static void main() {
        // decalaration
        // int[][] arr;
        // allocation
        // arr = new int[3][4];
        // init
        int[][] brr = {
                { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }
        };
        // System.out.println(brr[0][0]);
        int rowLength = brr.length;
        int colLength = brr[0].length; // only if all col are same

        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex]);
            }
            System.out.println();
        }

        System.out.println("jagged array : col length are not same in each row");
        int[][] arr = {
                { 1, 2, 4, 7 }, { 2, 3, 9, 0, 4 }, { 3, 4 }, { 4 }
        };
        // System.out.println(brr[0][0]);
        int rowlength = arr.length;

        for (int rowindex = 0; rowindex <= rowlength - 1; rowindex++) {
            // jaise hi main kisi new row pr aungi
            // vaise hi same point p maine uss row ka col length find krlia
            // current row-> arr[rowindex]
            // isme kitne col haii -> arr[rowindex].length
            int collength = arr[rowindex].length;
            for (int colindex = 0; colindex <= collength - 1; colindex++) {
                System.out.print(arr[rowindex][colindex] + " ");
            }
            System.out.println();
        }
    }
}