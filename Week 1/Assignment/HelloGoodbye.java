public class HelloGoodbye {
    public static void main(String[] args) {
		String firstName = args[0];
		String secondName = args[1];
		
		String outPutHello = "Hello" + " " + firstName + " and" + " " + secondName + ".";
		String outPutGoodBye = "Goodbye" + " " + secondName + " and" + " " + firstName + "."; 
		
        System.out.println(outPutHello);
		System.out.println(outPutGoodBye);
    }
}