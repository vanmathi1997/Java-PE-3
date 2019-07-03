public class GenerateExceptions {
    public Exception displayException1() {//method for NegativeArraySizeException
        Exception exception = null;
        try {
            int[] array = new int[-10];
        } catch (Exception e) {
            exception=e;
        }
        return exception;
    }

    public Exception displayException2() {//IndexOutOfBoundsException,
        Exception exception = null;
        try {
            int[] array = new int[2];
            array[4] = 10;
        } catch (Exception e) {
            exception= e;
        }
        return exception;
    }

    public Exception displayException3() {//NullPointerException.
        Exception exception = null;
        String value = null;
        try {
            if (value.equals("abc")) {
                System.out.print(value);
            }

        } catch (Exception e) {
            exception = e;
        }
        return exception;
    }
}



