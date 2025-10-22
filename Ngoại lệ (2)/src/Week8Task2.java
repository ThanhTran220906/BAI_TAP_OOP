import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    void nullPointerEx() throws NullPointerException {
        throw new NullPointerException("Lỗi Null Pointer");
    }

    String nullPointerExTest() {
        try {
            nullPointerEx(); // Gọi hàm có thể ném lỗi
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return e.getMessage();
        }
    }

    void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
    }

    String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx(); // Gọi hàm có thể ném lỗi
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
    }

    void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException("Lỗi Arithmetic");
    }

    String arithmeticExTest() {
        try {
            arithmeticEx(); // Gọi hàm có thể ném lỗi
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
    }

    void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    String fileNotFoundExTest() {
        try {
            fileNotFoundEx(); // Gọi hàm có thể ném lỗi
            return "Không có lỗi";
        } catch (NullPointerException | FileNotFoundException e) {
            return e.getMessage();
        }
    }

    void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    String ioExTest() {
        try {
            ioEx(); // Gọi hàm có thể ném lỗi
            return "Không có lỗi";
        } catch (NullPointerException | IOException e) {
            return e.getMessage();
        }
    }
}
