package optumIn;



 class OptumInterviewClass {

public String optumMethod(String input) {

 if (input.isEmpty()) {

   return input;

   }

 return optumMethod(input.substring(1)) + input.charAt(0);

 }

}





public class OptumClassCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="Welcome to optum";

		   //call optumMethod  method here and print Output
		OptumInterviewClass t= new OptumInterviewClass();
		
		
		System.out.println(t.optumMethod(input));

	}

}
