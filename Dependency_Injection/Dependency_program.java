
//service interface
interface MessageService{
    String getMessage();
}
//implementation of Message Service
class EmailService implements MessageService{
    @Override
    public String getMessage(){
        return "Email Message";
    }
}
//class that depends of MessageService through constructor injection
class MessageProcessor{
    private final MessageService messageService;
    //constructor injection
    public MessageProcessor(MessageService messageService){
        this.messageService=messageService;
    }
    public void processMessage(){
        String message=messageService.getMessage();
        System.out.println("processing message: "+message);
    }
}
public class Dependency_program{
   public static void main(String args[]){
    //create an instance of a messsage service dependancy
    MessageService  emailService =new EmailService();

    //injecting dependency into MessageProcessor
    MessageProcessor messageProcessor=new MessageProcessor(emailService);
    //performing message action or processing
    messageProcessor.processMessage();
}
}
