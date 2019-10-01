package ComplexityFunctions;

public class CaseComplexity {

	int ctc;

	public CaseComplexity() {
		super();
		ctc = 0;
	}
	
	public int caseComplex(String code, int switchPresent) {
		if(code.contains("case") && switchPresent == 1) {
			ctc = 1;
		}
		return ctc;
	}
}
