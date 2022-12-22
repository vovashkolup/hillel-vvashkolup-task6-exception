public class Main {
    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
//        arrayValueCalculator.doCalc(new String[][]{
//                        {"1", "2", "3", "4"},
//                        {"5", "6", "7", "8"},
//                        {"9", "10", "11", "12"},
//                        {"13", "14", "15", "16"},
//                }
//        );
//
//        arrayValueCalculator.doCalc(new String[][]{
//                        {"Young", "masters", "if", "you"},
//                        {"only", "knew", "How", "people"},
//                        {"weep", "there", "all", "life"},
//                        {"through", "You’d not", "compose", "your rhapsodies"},
//                }
//        );

//        arrayValueCalculator.doCalc(new String[][]{
//                        {"1", "2", "3", "4"},
//                        {"5", "6", "c", "8"},
//                        {"9", "10", "11", "12"},
//                        {"13", "14", "15", "16"},
//                }
//        );

        arrayValueCalculator.doCalc(new String[][]{
                        {"1", "2", "3", "4"},
                        {"5", "6",  "8"},
                        {"9", "11", "12"},
                        { "14", "15", "16"},
                }
        );
    }
}
