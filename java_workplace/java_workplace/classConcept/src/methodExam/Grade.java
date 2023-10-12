package methodExam;

public class Grade {
	private int data1;

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String grade() { 
		String result;
		 switch (data1/10) {
		    case 10:result = "A";
   					break;
	        case 9:	result = "A";
	          		break;
	        case 8:	result = "B";
	        		break;
	        case 7:	result = "C";
	        		break;
	        case 6:	result = "D";
	        		break;
	        default:result = "F";
	        		break;
	        }
		 
		 return result;
	}

}
