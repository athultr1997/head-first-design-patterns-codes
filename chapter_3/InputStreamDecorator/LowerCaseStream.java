import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.Character;
import java.io.IOException;

public class LowerCaseStream extends FilterInputStream {
    public LowerCaseStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c: Character.toLowerCase((char)c));
    }
}