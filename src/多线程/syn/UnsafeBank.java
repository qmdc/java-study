package 多线程.syn;

//取钱不安全
public class UnsafeBank {
    public static void main(String[] args) {
        Account account=new Account("结婚基金",100);
        Drawing drawing1=new Drawing(account,50,"You");
        Drawing drawing2=new Drawing(account,100,"god");

        new Thread(drawing1).start();
        new Thread(drawing2).start();
    }
}

//账户
class Account{
    protected double money;//余额
    protected String name;//卡名

    public Account(String name,double money){
        this.name = name;
        this.money = money;
    }
}

//存取操作
class Drawing extends Thread{
    Account account;
    double drawMoney;//取
    double nowMoney;//手里的钱

    public Drawing(Account account,double drawMoney,String name){
        super(name);
        this.account=account;
        this.drawMoney=drawMoney;
    }

    @Override
    public void run(){
        synchronized (account){
            if (account.money-drawMoney<0) {
                System.out.println("钱不够"+this.getName());
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.money-=drawMoney;
            nowMoney+=drawMoney;
            System.out.println(this.getName()+"手里有"+nowMoney+"万人民币"+"\n"+"余额是"+account.money);
        }

    }
}
