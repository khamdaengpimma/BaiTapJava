package Week2;

public class Account {
  int id;
   String name;
   int balance = 0;
  
  public Account(int id,String name){
    this.id = id;
    this.name = name;
    // this.balance = 0;

  }
public Account(int id,String name,int balance){
    this.id = id;
    this.name = name;
    this.balance = balance;
}
public int getid(){
  return id;
}
public void setName(String name){
  this.name = name;
}
public String getname(){
  return name;
}
public int getbalance(){
  return balance;
}
  public void deposit(double depositAmount) {
    this.balance += depositAmount;
    //System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
  }
  
  public void withdrawal(double withdrawalAmount) {
    // if(this.balance - withdrawalAmount < 0) {
    //   System.out.println("Only " + this.balance + " available. Withdrawal not processed");
    // } else {
    this.balance -= withdrawalAmount;
    //   System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
    // }
  }
  public void display(){
    System.out.print("ID = "+id+"\nName = "+name+"\nBalance = "+balance);
  }
  public static void main(String[] args){
    Account Acc1 = new Account(10101,"khamdaeng");
    Acc1.display();
  }
  
}
