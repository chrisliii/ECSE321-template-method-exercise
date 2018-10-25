package ca.mcgill.ecse321.designpatterns.templatemethod;

public class IPhoneCompiler extends CrossCompiler {

	@Override
	protected void scanSources() {
		System.out.println("Scanning sources for IPhone");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Compiling sources for IPhone");
	}
}