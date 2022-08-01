
public class Student {
	String name, hackbun;			// member , instance 	주소로 접근
	int kor, eng, mat, tot;
	double avg;
	char grade;
	
	void calcTot() {				// member, instance 	주소로 접근
		this.tot = this.kor + this.eng + this.mat;
	}
	
	void calcAvg() {
		this.avg = this.tot / 3.0;
	}
	
	void calcGrade() {
		this.grade = (this.avg >= 90)? 'A' : ((this.avg >= 80)? 'B' : ((this.avg >= 70)? 'C' : ((this.avg >= 60)? 'D' : 'F')));
	}
	
	void display() {
		System.out.printf("%s(%s) \t %d\t %d\t %d\t %d\t %.1f\t %c\n",
				this.name, this.hackbun, this.kor, this.eng, this.mat, this.tot, this.avg, this.grade);
	}
}
