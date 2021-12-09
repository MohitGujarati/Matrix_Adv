package B3_Matrix_Adv;

/*
class main{
    public static void main(String[] args) {
        int m=3;
        int a[][]=new int [4][];

        for (int i=0;i<a.length;i++){
            a[i]=new int[i+1];

            for (int j=0;j<a[i].length;j++){
                a[i][j]=i;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

 */ //jagged Array of a user specific size

/*
class test{
    private static void fun(int[][] a) {
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++)

            System.out.print(a[i][j]+" ");

        }

    }

    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6}};

        fun(a);

}}

 */ //printing of 2D array

               /* IMP  */

/*
class snake{
    private static void funsnake(int[][] a, int r, int c) {

        {
            // Traverse through all rows
            for (int i = 0; i < a.length; i++) {

                // If current row is even, print from
                // left to right
                if (i % 2 == 0) {
                    for (int j = 0; j < a[0].length; j++)
                        System.out.print(a[i][j] + " ");


                    // If current row is odd, print from
                    // right to left
                } else {
                    for (int j = a[0].length - 1; j >= 0; j--)
                        System.out.println(a[i][j] + " ");
                }
            }
        }
    }


        public static void main(String[] args)
        {
        int a[][]=
                {
                        { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 }
                };


        int R=a.length;
       int C=a.length-1;

        funsnake(a,R,C);


    }
}

 *///print Matrix in snake pattern

/*
class main{
    private static void Print_Boundry(int[][] a, int r, int c) {
        if (r==1){
            for (int i=0;i<c;i++)
                System.out.println((a[0][i]+" "));
        }
        else if (c==1){
            for (int i=0;i<r;i++)
                System.out.println(a[i][0]+" ");
        }
        else {

        //prints the first row(10,20,30,40)
            for (int i=0;i<c;i++)
                System.out.println(a[0][i]+" ");

        //we print the last column(45,48)
        for (int i=0;i<r;i++)
                System.out.println(a[i][c-1]+" ");

        //printing (50,39,33,32)
        for (int i=c-2;i>=0;i--)
                System.out.println(a[r-1][i]+" ");

        //first column(15,27)
        for (int i=r*2;i>=1;i--)
                System.out.println(a[i][0]+" ");

    }
    }


    public static void main(String[] args) {
        {
            int a[][]=
                    {
                            { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 }
                    };


            int R=a.length;
            int C=a.length-1;

            Print_Boundry(a,R,C);


        }
}}

 */ //Print boundary element sof matrix





