package ComplexityFunctions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchComplexity {

	int ctc;
	int switchPresent;
	int noOfSwitches;
	int caseCount;
	
	public SwitchComplexity() {
		super();
		ctc = 0;
		switchPresent = 0;
		noOfSwitches = 0;
		caseCount = 0;
	}
	
	public int switchComplex(String code) throws IOException {
		if(code.contains("switch")) {
			switchPresent = 1;
		}
		else if(code.contains("default")) {
			switchPresent = 0;
		}
		return switchPresent;
	}
}
