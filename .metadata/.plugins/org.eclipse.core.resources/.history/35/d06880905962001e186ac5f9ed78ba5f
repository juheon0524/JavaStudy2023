package ex03;

interface Printable {
	void print();
}

class Papers {
	private String con;
	
	public Papers(String con) {this.con = con;}
	public Printable getPrinter() {
		 class Printer implements Printable{
			@Override
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	}	
}

public class UseLocalInnerClass {

	public static void main(String[] args) {
		Papers p = new Papers("삼성 프린터로 메세지 출력 합니다.");
		
		Printable prn = p.getPrinter();
		prn.print();
	}

}
