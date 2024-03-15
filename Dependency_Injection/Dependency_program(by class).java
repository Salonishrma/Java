//service interface
interface MessageService{
    String getMessage();
}
//implementation of Message Service
class EmailService implements MessageService{
    @Override
    public String getMessage(){
        return "Email Message".
    }
}
//class that depends of MessageService through constructor injection
class MessageProcessor{
    private final MessageService messageService;
    //constructor injection
    public MessageProcessor(messageService messageService){
        this.messageService=messageService;
    }
    public void processMessage(){
        String message=messageService.getMessage();
        System.out.println("processing message: "+message);
    }
}
