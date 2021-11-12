
public class Parser {
	String commandName;
	String[] args;
	
	//This method will divide the input into commandName and args
	//where "input" is the string command entered by the user
	public boolean parse(String input){
		String[] arrOfStr = input.split(" ");
		commandName = arrOfStr[0];
		
        args = new String[arrOfStr.length-1];
        for (int i = 1; i < arrOfStr.length; i++)
        	args[i] = arrOfStr[i];
		return true;
	}
	public String getCommandName(){
		return commandName;

	}
	public String[] getArgs(){
		return args;

	}
}
