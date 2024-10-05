
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}

public class InputDecorator {
    public static void main(String[] args) throws IOException {
        String input = "Hello WORLD!";
        InputStream in = new LowerCaseInputStream(new java.io.ByteArrayInputStream(input.getBytes()));
        int c;
        while ((c = in.read()) >= 0) {
            System.out.print((char) c);
        }
    }
}

