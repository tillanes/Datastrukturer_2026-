public class bigO {
    int[] data = new int[100];
    int ops;
        public bigO(){

            System.out.println("Data size: "+data.length);



            // 0(n)
            for (int i = 0; i < data.length; i++) {
                ops++;
            }
            System.out.println("0(n): "+ops+" operationer");




            //0(n^2)

            int ops = 0;
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    ops++;
                }
            }
            System.out.println("data storlek 0(n^2): "+ ops);





            //0(log n )

            ops = 0;
            int len = data.length;
            while(len > 0 ){
                len = len / 2;
                ops++;
            }
            System.out.println("data storlek 0(log n ): "+ ops);



            //0( n log n )

            ops = 0;
            len = data.length;
            while(len > 0 ){
                len = len / 2;
                for (int i = 0; i <data.length; i++) {
                    ops++;
                }
            }
            System.out.println("data storlek 0( n log n ): "+ ops);





        }








}
