package car.example.bean;

public class MyBean {

    //data member
    private String message;

    //setter message
    public void setMessage(String message) {
        this.message = message;
    }

    //a function which display the message
    public void showMessage() {
        System.out.println("meassge"+ message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }

}
