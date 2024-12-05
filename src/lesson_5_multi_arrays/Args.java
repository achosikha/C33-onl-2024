package lesson_5_multi_arrays;

public class Args{
	public static void main(String[] args){
		printArray(args);
	}

	public static void printArray(String[] args){
		for (int index = 0; index < args.length; index++){
			System.out.println("args[" + index + "]: " + args[index]);
		}
	}
}
