public class CoreService {

    public void CoreService(){
        System.out.println("From core services");

        //Just a method call
        Test test = new Test();
        test.justTesting();
    }

    public void PrintSome(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
