package ex07_interface;

public class MainClass {
	public static void main(String[] args) {
		Printable prn = new LPrinter();
		String msg = "hello world";
		prn.print(msg);
		
		prn = new SPrinter();
		prn.print(msg);
		
		CSPrint p = new SPrinter();
		p.cprint(msg);
	}
}
