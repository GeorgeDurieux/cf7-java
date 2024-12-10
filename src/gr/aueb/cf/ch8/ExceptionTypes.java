package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {

    }

    /**
     * System.in.read() throws IOException
     * Since a checked exception is thrown
     * it has to be explicitly thrown in
     * method signature or has to be caught {}.
     * Ideally we want to handle exceptions,
     * not only propagate.
     *
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /**
     * If we catch, no need for "throws"
     * in method signature. The exception
     * doesn't propagate. If there is a
     * caller, we need to propagate. If there
     * is a client, no need to propagate.
     *
     * @return
     */
    public static char readAnotherChar() {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /**
     * We take action - logging and also
     * rethrow the exception to propagate
     * to the caller.
     *
     * @return
     * @throws IOException
     */
    public static char readAgainOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readOneOtherChar(char ch) throws IOException, IllegalArgumentException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IllegalArgumentException ex1) {
            ex1.printStackTrace();
            System.err.println(ex1.getMessage());
            throw ex1;
        } catch (IOException ex2) {
            ex2.printStackTrace();
            System.err.println(ex2.getMessage());
            throw ex2;
        }
//        } catch (IOException | IllegalArgumentException e) {
//            e.printStackTrace();
//            System.err.println(e.getMessage());
//            throw e;
//        }
    }
}
