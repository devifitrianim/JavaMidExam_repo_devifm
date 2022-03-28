package data;

/**
 *
 * @author Devi
 */
public class StdMessenger  implements Messenger{
    boolean isSuccess = false;
    
    @Override
    public boolean sendMessege(String receiver, String subject, String messege){
        System.out.println("Success");
        return isSuccess = true;
    }
        
}
