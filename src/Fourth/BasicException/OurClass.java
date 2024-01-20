package Fourth.BasicException;

public class OurClass {
    private final boolean just = true;

    // throws : 던지다 (=예외를 던지다 / 발생시키다)
    public void thisMethodDangerous  () throws OurBadException {
        // custom logic
        if (just) {
            throw new OurBadException();
        }
    }
}
