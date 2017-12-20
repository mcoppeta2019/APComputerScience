
public class StringPractice1 {

	public static void main(String[] args){
		System.out.println(convertDate("12/19/2017"));
		System.out.println(convertDate("1/3/2018"));
		System.out.println(convertDate("12/5/2018"));
		System.out.println(convertDate("1/13/2018"));
	}
	
	public static String convertDate(String format){
		String[] parts = new String[3];
		parts[0] = format.substring(0, format.indexOf("/"));
		if (parts[0].length() < 2){
			parts[0] = "0" + parts[0] + "-";
		} else {
			parts[0] = parts[0] + "-";
		}
		
		format = format.substring(format.indexOf("/")+1);
		parts[1] = format.substring(0, format.indexOf("/"));
		if (parts[1].length() < 2){
			parts[1] = "0" + parts[1] + "-";
		} else {
			parts[1] = parts[1] + "-";
		}
		
		parts[2] = format.substring(format.indexOf("/")+1);
		while (parts[2].length() < 4){
			parts[2] = "0"+parts[2];
		}
		
		return parts[0]+parts[1]+parts[2];
	}
	
	/*public static String convertDate(String format){
		while(format.indexOf("/") >= 0){
			format = format.substring(0, format.indexOf("/")) + "-" + 
						format.substring(format.indexOf("/")+1);
		}
		
		String[] parts = new String[3];
		for (int i = 0; i < 2; i++){
			parts[i] = format.substring(0, format.indexOf("-")+1);
			format = format.substring(format.indexOf("-")+1);
		}
		parts[2] = format;
		format = "";
		
		for(int i = 0; i<3; i++){
			if ((i==0 || i==1) && parts[i].length() <3){
				parts[i] = "0"+parts[i];
			}
			while (i==3 && parts[i].length()<4){
				parts[i] = "0"+parts[i];
			}
		}
		
		for (String a : parts){
			format+=a;
		}
		
		return format;
	} */
}
