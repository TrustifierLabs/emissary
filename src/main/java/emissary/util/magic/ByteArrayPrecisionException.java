package emissary.util.magic;

/**
 * Exception used within the magic package - external clients never encounter this exception
 */

public class ByteArrayPrecisionException extends NumberFormatException {
    public ByteArrayPrecisionException(String msg) {
        super(msg);
    }
}
