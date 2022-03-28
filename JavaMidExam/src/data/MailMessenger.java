package data;

/**
 *
 * @author user
 */
public class MailMessenger implements Messenger{
    boolean isSuccess = false;
    boolean isConnectedToServer = false;
    
    public void connect(){
        System.out.println("Connect");
        isConnectedToServer = true;
    }
    
    public void disconnect(){
        System.out.println("Disconnect");
        isConnectedToServer = false;
    }
    
    @Override
    public boolean sendMessege(String receiver, String subject, String messege){
        if(isConnectedToServer == true){
            System.out.println("Success");
            return isSuccess = true;
        }
        else{
            System.out.println("Failed. Cant't connect to server");
        }   return isSuccess = false;
    }
}
