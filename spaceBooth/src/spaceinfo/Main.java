package spaceinfo;

public class Main {
	public static void main(String[] args) 
			throws java.io.IOException {
				char choice, ignore;
				MenuLoop hlpobj = new MenuLoop();
					
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