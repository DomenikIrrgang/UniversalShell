package universalshell.output;

/**
 * Output a string to the output source.
 * 
 * @author Marc Bambey
 */
public abstract class Output {
    
    /**
     * Output a string to an output source.
     * 
     * @param line The string that will be used.
     */
    public abstract void writeLine(String line);
}
