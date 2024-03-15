public class ParenChecker {
    
    public ParenChecker() {}

    public boolean checkIfOpen(char p) {
        switch(p) {
            case '(':
                return true;
            case '[':
                return true;
            case '{':
                return true;
            case '<':
                return true;
            default:
                return false;
        }
    }

    public boolean checkIfClose(char p) {
        switch(p) {
            case ')':
                return true;
            case ']':
                return true;
            case '}':
                return true;
            case '>':
                return true;
            default:
                return false;
        }
    }
}
