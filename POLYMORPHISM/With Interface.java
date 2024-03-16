interface Sports{
    void play();
}
class Cricket implements Sports{
   @Override
    public void play(){
        System.out.println("Playing Cricket....");
    }

}
class Football implements Sports{
    @Override
    public void play(){
        System.out.println("Playing Footbal....");
        //instance creation 
    }

}

public class Hello {
    public static void main(String args[]) {
        Cricket ob=new Cricket();
        ob.play();
        Football ob1=new Football();
        ob1.play();
    }
}
