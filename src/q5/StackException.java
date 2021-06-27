package q5;

public class StackException extends Exception {
    final private String message;
    public StackException(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
}
