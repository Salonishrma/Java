public class Error_Handling {
    //try - catch block of coding
    public static void main(String[] args){
        //code will be written here
        try{
            int[] myNum={1,2,3,4,5};
            System.out.println(myNum[10]); //error wrong index number give
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("Try- catch is finished and clean  and closing db is closed");
        }
    }
}
