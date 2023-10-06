package ex02;

interface Printable {
	void print();
}

class Papers {
	private String con;
	
	public Papers(String con) {this.con = con;}
	public Printable getPrinter() {
		return new Printer();
	}
	
	private class Printer implements Printable{
		@Override
		public void print() {
			System.out.println(con);
		}
	}
}

public class UseMemberInnerClass {

	public static void main(String[] args) {
		Papers p = new Papers("삼성 프린터로 메세지 출력 합니다.");
		Papers l = new Papers("LG 프린터로 메세지 출력 합니다.");
		
		Printable prn = p.getPrinter();
		prn.print();
		Printable prn2 = l.getPrinter();
		prn2.print();
	}

}
