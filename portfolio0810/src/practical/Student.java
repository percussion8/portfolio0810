package practical;

public class Student {
	String name = "";
	int math, eng, soc, sci, eth;
	int total = 0;
	double avg = 0;
	int[] scores;

	Student() {
		math = 0;
		eng = 0;
		soc = 0;
		sci = 0;
		eth = 0;
	}

	int getTotal() {
		total = math + eng + soc + sci + eth;
		return total;
	}

	double getAvg() {
		avg = total/5;
		return avg;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSoc() {
		return soc;
	}
	public void setSoc(int soc) {
		this.soc = soc;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getEth() {
		return eth;
	}
	public void setEth(int eth) {
		this.eth = eth;
	}
}
