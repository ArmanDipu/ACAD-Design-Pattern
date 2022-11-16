public class Subscriber {
    private String objectName;
    private String interest;

    public Subscriber(String objectName, String interest){
        this.objectName = objectName;
        this.interest = interest;
    }

    private int quackTime = 0;
    public void onEvent(){
        quackTime++;
        if(quackTime>1){
            System.out.println(objectName +" " + interest + "ed again!" );
        }
        else{
            System.out.println(objectName + " just "+ interest + "ed !");
        }
    }
}
