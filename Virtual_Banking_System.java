import java.util.Scanner;

public class Virtual_Banking_System {

	int savings;
    void setter(int savings)
    {
        this.savings=savings;
    }
    void getter()
    {
        System.out.println("Your current savings are : "+savings);
    }
    void increment()
    {
        this.savings+=1000;
    }
    void decrement()
    {
        this.savings-=100;
    }
    void checkSavings()
    {
        if(this.savings>=1000)
        {
            System.out.println("Congratulations!");
        }
        else if (this.savings>=0 && this.savings<1000) {
            System.out.println("Insufficient saving!");
            
        } else {
            System.out.println("You are in debt");
        }
    }
    public static void main(String[] args)
    {
    	Virtual_Banking_System obj=new Virtual_Banking_System();
        Scanner ip = new Scanner(System.in);
        int input=ip.nextInt();
        obj.setter(input);
        obj.decrement();
        obj.increment();
        obj.getClass();
        obj.checkSavings();
        obj.getter();
    }

}
