package exceptionHandling;

public class Client {
    public static void main(String[] args) {
        Car car=new Car();
        try {
            car.setMs(new BoseMusicSystem());
            car.playMusic();
        }
        catch (MusicSystemNotPluggedException e) {
            //System.out.println(e.getMessage());
            System.out.println(e);

        }
    }
}
//if client has not set Ms, then he will get a message that "you have not plugged in an appropriate music system".

// what is the diff bw e and e.getMessage()?
//Ans: when you print e.getMessage(), it just prints the message.
//and when you print e(i.e., exception itself), it calls the toString() method and
//toString() method prepends the message with the class name.