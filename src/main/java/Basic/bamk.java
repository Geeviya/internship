package Basic;
class bank
{
    public void bankinfo()
    {        String bankname="HDFC";
        String bankbranch="Trichy Road";
        System.out.println("Bankname is"+ bankname);
        System.out.println("Bankbranch is"+ bankbranch);
    }
}
class account extends bank
{
    public void accountinfo()
    {
        int accountid=123456789;
        int accountnum=12131415;
        System.out.println("Accountid is"+accountid);
        System.out.println("Accountnum is"+accountnum);
    }
}

class customer extends account
{
    public void customerinfo()
    {
        String customername="xyz";
        int customerage=19;
    }
}

public class bamk {
    public static void main(String[] args) {

        customer rose=new customer();
        rose.accountinfo();
        rose.bankinfo();
        rose.customerinfo();
    }

}
