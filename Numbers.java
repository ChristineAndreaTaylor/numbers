package christine;


public class Numbers
{
    public static void main(String[] args)
    {
	if (args.length != 2) {
	    System.exit(1);
	}
	int n = 1;
	int a = Integer.parseInt(args[0]);
	int x = Integer.parseInt(args[1]);
	
	while (a*n <= x){
	    System.out.println ("("+x+") a="+a+",n="+n + ",result="+a*n);
	    n++;
	}
	
	System.out.println("----------- now a+1 ---------------");
	int m = 1;
	while ((a+1)*m <= 2*x){
	    System.out.println ("("+(x*2)+") a="+a+",n="+m + ",result="+(a+1)*m);
	    m++;
	}
	
	System.out.println("----------- now a+2 ---------------");
	int o = 1;
	while ((a+2)*o <= 3*x){
	    System.out.println ("("+(x*3)+") a="+a+",n="+o + ",result="+(a+2)*o);
	    o++;
	}
    }
}

