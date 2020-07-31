package spaceinfo;

public class MenuLoop {
	//This program shows very basic information about Space
		//When run Press a number 1-4 or q and then press ENTER to continue
		void SpaceBooth(int what) {
			  switch(what) {
				
			  	case '1':
					System.out.println("Nasa History:\n");
					System.out.println("https://www.history.nasa.gov/factsheet.htm");
					break;
				case '2':
					System.out.println("2020 Space Ships:\n");
					System.out.println("https://en.wikipedia.org/wiki/List_of_United_States_rockets");
					break;
				case '3':
					System.out.println("Our Solar System:\n");
					System.out.println("https://solarsystem.nasa.gov/solar-system/our-solar-system"
							+ "/overview/#:~:text=%2010%20Need-to-Know%20Things%20About%20the%20Solar"
							+ "%20System,million%20years%20to%20complete%20one%20orbit...%20More%20");
					break;
				case '4':
					System.out.println("The Universe and Beyond:\n");
					System.out.println("https://www.nasa.gov/mission_pages/planck/"
							+ "multimedia/pia16876b.html#.XyOc1jiSnIU");
					break;
				}
			    System.out.println();
			}
			
			void showMenu() {
				System.out.println("Information on:");
				System.out.println(" 1. Nasa History");
				System.out.println(" 2. 2020 Space Ships");
				System.out.println(" 3. Our Solar System");
				System.out.println(" 4. The Universe and Beyond");
				System.out.print("Choose a # and press ENTER (q to quit) : ");
			}
				boolean isValid(int ch) {
					if(ch < '1' | ch > '4' & ch != 'q') return false;
					else return true;
			}
		}