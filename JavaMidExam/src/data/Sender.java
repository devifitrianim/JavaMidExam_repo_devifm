package data;
/**
 *
 * @author Devi
 */
public class Sender {

    public static void main(String[] args) {
        StdMessenger stdm = new StdMessenger();
        
        System.out.println("== StdMMessenger Started ==");
        System.out.println("Sending a Messege");
        stdm.sendMessege("Hi Hilya", "Are you busy now?", "would you like to see a movie in Cinema with me?");
        System.out.println("== StdMessenger Finished ==");
        System.out.println("");System.out.println("");
        
        MailMessenger mailm = new MailMessenger();
        
        System.out.println("== MailMessenger Strated ==");
        System.out.println("Send a messege"); //Disconnected to server
        mailm.sendMessege("Hi Dev,", "No, I'm not", "Sure, See you at cinema this afternoon");
        mailm.disconnect(); // Disconnect
        
        System.out.println("Connecting"); 
        mailm.connect(); //Connected
        
        // Resend
        System.out.println("Resend a messege");
        mailm.sendMessege("Hi Dev,", "No, I'm not", "Sure, See you at cinema this afternoon");
        System.out.println("== MailMessenger Finished");
    }
}
