import java.util.Scanner;
class Machine{

	int pin=4321,b,c,d,e,enterno,depo,Cash=0,Widraw;
	int ki=Cash;
	Scanner S=new Scanner(System.in);

	
	void verificatek(){

		System.out.println("Enter the Pin (Numericals)");
		int enter =S.nextInt();
if (enter==pin) {
		System.out.println(">>>>>> Success <<<<<<");
			System.out.println("\n");


	 menu();
}
else {
	System.out.println(">>>>>> Wrong Pin <<<<<<");
	System.out.println("\n"+"**********************************");

	verificatek();
}
	}
 void menu(){
 	 	System.out.println("****************** Welcome to the main Menu ******************\n           Choose an option for Further Operation\n");

 	System.out.println("1. Deposit Money");

 	 	System.out.println("2. Widraw money");

 	System.out.println("3. Status of your account");

 	System.out.println("4. Exit");

 			int enterno =S.nextInt();
 			switch (enterno){
 			case 1:
 				Depositmoney();
 				break;
 				case 2:
 				WidrawMoney();
 				break;
 				case 3:
 				Status();
 				break;
 				case 4:
 				Exit();
 				break;
 			}



 }
 void Depositmoney(){
 	System.out.println("\nEnter Amount");
 	depo=S.nextInt();
 	Cash=Cash+depo;
if (depo>0) {
	 	 	System.out.println("\n****************** Your Amount has been successfully Deposited ******************");
	 	 	 	 		System.out.println("\n");

menu();
}
else{
	 	 	System.out.println("\nEnter a valid Amount");

}

 	

 }
 void WidrawMoney(){
 	 	System.out.println("\nEnter amount you want to widraw");
 	 	Widraw=S.nextInt();
 	 	Cash= Cash-Widraw;
 	 	if (Widraw > 0 && Cash >= Widraw) {
 	 		 	 	System.out.println("\nYour have successfully widrawn your cash\n");

 	 		 	 	menu();
 	 	}
 	 	else{
 	 		 	 	Cash=ki;
 	 		 	 	System.out.println("\nEnter a valid Amount\n");
 	 		 	 	menu();

 	 	}

 }
 void Status(){
 	 	System.out.println("Account Status = Saving(Active)");
 	 	System.out.println("User: Aniket Kumar Ram");
 	 	System.out.println("Balance: "+Cash);
 	 		System.out.println("**********************************"+"\n");

 	 	menu();



 }
 void Exit(){
 
 }
}


public class Atm{
	public static void main(String[] a){
Machine m =new Machine();
m.verificatek();
	}
}