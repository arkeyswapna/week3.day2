package week3.day2;

public abstract class MultipleLanguageAsnmt1 {
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
	public void python() {
		System.out.println("This is python");
	}
	public abstract void ruby();
}