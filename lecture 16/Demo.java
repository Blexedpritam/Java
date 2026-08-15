//Encapuslation

public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        // ba.balance = 100000.00;
        // System.out.println(ba.balance);

        ba.deposit(500);
        ba.withraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount{
   private double balance;

   public void deposit(int amount){
    balance += amount;
   }

   public void withraw(int amount){
    balance -= amount;
   }


   //Getters / Seters
   public double getBalance(){
    return balance;
   }
}

class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name, int rollNumber, int age, String college){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college;
    }

    //geyyers / setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCollege(){
        return college;
    }

    public void setCollege(String college){

        //Validations --> college should be real.
        this.college = college;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public int getAge(){
        return age;
    }
}