package Lectures.Lec8;

public class InvoiceDataException extends Exception {
    public InvoiceDataException(String errMsg) {
        super(errMsg);
    }

    public InvoiceDataException(String errMsg, Throwable err) {
        super(errMsg, err);
    }
}
