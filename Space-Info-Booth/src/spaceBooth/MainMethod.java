package spaceBooth;

public class MainMethod {
	
	public static void main(String[] args) 
		throws java.io.IOException {
			char choice, ignore;
			MainPage hlpobj = new MainPage();
				
			for(;;) {
				do {
					hlpobj.showMenu();
						
					choice = (char) System.in.read();
						
					do {
						ignore = (char) System.in.read();
					} while(ignore != '\n');
				} while( !hlpobj.isValid(choice) );
				
				if(choice == 'q') break;
					
				System.out.println("\n");
				hlpobj.SpaceBooth(choice);
		}
	}
}