package universalshell.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Writes a String to a java.io.OutputStream.
 *
 * @author Marc Bambey
 */
public class OutputStreamOutput extends Output {

    private final OutputStream stream;
    private final Writer outputStreamWriter;

    /**
     * Creates a new instance of OutputStreamOutput.
     *
     * @param stream OutputStream that will be used for creating output.
     */
    public OutputStreamOutput(OutputStream stream) {
        this.stream = stream;
        outputStreamWriter = new OutputStreamWriter(stream);
    }

    @Override
    public void writeLine(String line) {
        try {
            outputStreamWriter.write(line + "\n");
            outputStreamWriter.flush();
        } catch (IOException e) {
            System.out.println("Could not write to Output.");
        }
    }

}
