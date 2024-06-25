import java.util.Scanner;
public class gowtham{
    public static void main(String[]args){
int a,b,c,d,e,f,g,h,i,j,k,l,m = 0,n,o,p,r,s,bal,total=50000;
        System.out.println("please select language\n1.English\n2.Hindi\n");
Scanner q=new Scanner(System.in);
a=q.nextInt();
switch(a){
    case 1:
        System.out.println("1.Withdraw\n2.Deposit\n3.Balance enquiry\n4.Exit\n");
        b=q.nextInt();
        switch(b){
            case 1:
             System.out.println("ENTER ACCOUNT TYPE\n1.Saving\n2.Current\n3.UPI withdraw\n4.Exit");
                c=q.nextInt();
                switch(c){
                    case 1:
                        System.out.println("ENTER AMOUNT TO WITHDRAW");
                        d=q.nextInt();
                        System.out.println("ENTER YOUR PIN");
                        e=q.nextInt();
                        System.out.print("Your amount '₹ "+d);
                        System.out.println("/-' is withdrawed\ncollect it");
                        System.out.println("Do you want display balance\n1.yes\n2.no");
                        f=q.nextInt();
                        bal=total-d;
                        switch (f){
                            case 1:
                            if(d<=total){
                            System.out.println("your balance is"+bal);
                                    System.out.println("THANK YOU\nVISIT AGAIN");
                        }
                        else{
                            System.out.println("Insuffecient balance");
                        }
                        break;
                            case 2:
                                System.out.println("THANK YOU\nVISIT AGAIN");
                        }
                        break;
                    case 2:
                        System.out.println("ENTER AMOUNT TO WITHDRAW");
                        g=q.nextInt();
                        System.out.println("ENTER YOUR PIN");
                        h=q.nextInt();
                        System.out.print("Your amount"+g);
                        System.out.println("is withdrawed");
                        System.out.println("Do you want display balance\n1.yes\n2.no");
                        i=q.nextInt();
                        bal=total-g;
                        if(g<=total) {
                            switch (i) {
                                case 1:
                                    System.out.println("your balance is" + bal);
                                    System.out.println("THANK YOU\nVISIT AGAIN");
                                    break;
                                case 2:
                                    System.out.println("THANK YOU\nVISIT AGAIN");
                                    break;
                            }
                        }
                        else {
                            System.out.println("Insuffecient balance");
                        }
                    case 3:
                        System.out.println("Enter your UPI ID");
                        j=q.nextInt();
                        System.out.println("1.Phonepe\n2.Google pay\n3.paytm");
                        k=q.nextInt();
                        switch (k){
                            case 1:
                                System.out.println("PLease scan qr code displayed on screen and pay");
                            break;
                                case 2:
                                System.out.println("PLease scan qr code displayed on screen and pay");
                            break;
                                case 3:
                                System.out.println("PLease scan qr code displayed on screen and pay");
                        break;
                        }
                        System.out.println("Do you want display balance\n1.yes\n2.no");
                        l=q.nextInt();
                        bal=total-m;
                        switch (l){
                            case 1:
                                System.out.println("your balance is"+bal);
                                System.out.println("THANK YOU\nVISIT AGAIN");
                            break;
                                case 2:
                                System.out.println("THANK YOU\nVISIT AGAIN");
                        break;
                        }
 break;
                }
break;
                case 2:
                System.out.println("Enter your pin");
                r=q.nextInt();
                System.out.println("Select amount to deposit");
                n=q.nextInt();
                System.out.print("Your amount '₹ "+n);
                System.out.println("/-'is deposited to your account");
                o=total+n;
                System.out.println("Your total Balance is:"+o);

                break;
                case 3:
                System.out.println("Enter your pin");
                s=q.nextInt();
                System.out.println("your total balance is:"+total);
        }
break;
    case 2:
        System.out.println("SORRY THIS LANUAGE IS NOT AVAILABLE");
}}}