public class ArrayValueCalculator {

    public int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        if (4 != arr.length) {
            throw new ArraySizeException("Array Size Exception called! Array has not proper size");
        }
        for (int i = 0; i < arr.length; i++) {
            if (4 != arr[i].length) {
                throw new ArraySizeException("Array Size Exception called! Array has not proper size");
            }

            for (int j = 0; j < arr.length; j++) {
                try {
                    validate(arr[i][j]);
                } catch (ArrayDataException e) {
                    throw new ArrayDataException("Array Data Exception called! " + arr[i][j] + " is not a number");
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }


    public void validate(String str) throws ArrayDataException {
        char c='y';
        for(int i=0;i<str.length();i++){
             c=str.charAt(i);
             if(!Character.isDigit(c)){
                 throw new ArrayDataException();
             }
        }
    }

}
