package week3.day2;

public class AutomationAsnmt1 extends MultipleLanguageAsnmt1 implements LanguageAsnmt1,TestToolAsnmt1{
	/*Assignment 1 on Abstraction
	===========
	Interface :Language
	     Methods   :Java()
	     Interface :TestTool
	     Methods   :Selenium()
	     AbstractClass :MultipleLangauge
	     Methods   :python() and un implemented method as ruby()
	  Execution class: Automation 
	Implement all the methods of interface and abstract class in Automation class*/
	public void selenium() {
		System.out.println("This is Selenium");
		
	}

	public void java() {
		System.out.println("This is Java");
	}

	@Override
	public void ruby() {
		System.out.println("This is Ruby");
		
	}
	public static void main(String[] args) {
		AutomationAsnmt1 a=new AutomationAsnmt1();
		a.java();
		a.python();
		a.ruby();
		a.selenium();
			
	}

}
