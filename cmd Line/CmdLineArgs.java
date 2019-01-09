
class CmdLineArgs{
    
    public static void main(String args[]){

         for(int i =0 ; i < args.length; i++){
	        System.out.print("Argument " + i );
            System.out.println(" is = " + args[i]);
         }
    }
}