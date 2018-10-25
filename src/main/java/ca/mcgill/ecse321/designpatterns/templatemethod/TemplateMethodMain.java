package ca.mcgill.ecse321.designpatterns.templatemethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		CrossCompiler compiler = new AndroidCompiler();
		compiler.crossCompile();
		
		compiler = new BlackBerryCompiler();
		compiler.crossCompile();
		
		compiler = new IPhoneCompiler();
		compiler.crossCompile();
	}
}
