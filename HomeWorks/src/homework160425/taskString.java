package homework160425;

public class taskString {

public static void main(String[] args) {
	System.out.println(last2("hiididhi"));
}	
	static public int last2(String str) {
		 int count = 0;
		 int lengthStr = str. length();
		 System.out.println(lengthStr);
		 if(lengthStr > 3){
		  String lastSymbols = str.substring(lengthStr-2);
		  System.out.println(lastSymbols);
		  for (int i = 0; i < lengthStr - 2; i++){
			  String s = new String (str.substring(i, i+2));
			  System.out.println(s);
		    if(s.equals(lastSymbols)) {
				count++;
			}
		  }
		 }
		 return count;
		}

}
