package ComplexityFunctions;

public class CatchComplexity {

	int Ctc;
	int catchCount;
	
	public CatchComplexity() {
		super();
		Ctc = 0;
		catchCount = 0;
	}
	
	public int catchComplex(String code) {
		if(code.contains("catch")) {
			Ctc = Ctc + 1;
			catchCount = catchCount + 1;
		}
		return Ctc;
	}
}


