import java.util.Scanner;
class PizzaOrder {

public static void main(String args[]) {

Scanner sc= new Scanner(System.in);
System.out.println("Select type of your pizza(Veg/NonVeg)=");
	String PizzaName=sc.nextLine();
{
switch(PizzaName) {
	case "Veg":
	System.out.println("You have Selected Veg. Pizza");
	System.out.println("Select your pizza'\n'corn pizza'\n'cheeze pizza");
	String pizzaType= sc.nextLine();

	switch(pizzaType){
	case "corn pizza":
	System.out.println("Veg Corn pizza");
	System.out.println("Size of pizza \n small \n medium \n large");
	String Vsize = sc.nextLine();	

	switch(Vsize) {
	case "small":
	System.out.println("Veg corn pizza,small size,prize- 180Rs");
	System.out.println("Confirm order yes/no = ");
	
	String vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}}}
	case "medium":
	System.out.println("Veg corn pizza,medium size,prize- 250Rs");
	System.out.println("Confirm order yes/no = ");
	
	String vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}

	case "large":
	System.out.println("Veg corn pizza,large size,prize- 330Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}

	case "cheeze pizza":
	System.out.println("Veg Cheeze pizza");
	System.out.println("Size of pizza \n small \n medium \n large");

	String Vsize = sc.nextLine();
	
switch(Vsize) {
	case "small":
	System.out.println("Veg corn pizza,small size,prize- 180Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}
	case "medium":
	System.out.println("Veg corn pizza,medium size,prize- 250Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();
	
	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
	break;
}
	case "large":
	System.out.println("Veg corn pizza,large size,prize- 330Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();
	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
	break;
}}
case "NonVeg":
	System.out.println("You have Selected NonVeg. Pizza");
	System.out.println("Select your pizza'\n'kbaab pizza'\n' tanduri pizza");
	String NpizzaType= sc.nextLine();

switch(NpizzaType){
	case "kbaab pizza":
	System.out.println("NonVeg kbaab pizza");
	System.out.println("Size of pizza \n small \n medium \n large");
	Vsize = sc.nextLine();	

	switch(Vsize) {
	case "small":
	System.out.println("NonVeg kbaab pizza,small size,prize- 330Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}
	case "medium":
	System.out.println("NonVeg kbaab pizza,medium size,prize- 440Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}
	case "large":
	System.out.println("NonVeg kabaab pizza,large size,prize- 570Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}}}

	case "tanduri pizza":
	System.out.println("NonVeg tanduri pizza");
	System.out.println("Size of pizza \n small \n medium \n large");

		Vsize = sc.nextLine();
	
switch(Vsize) {
	case "small":
	System.out.println("NonVeg tanduri pizza,small size,prize- 300Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();

	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
break;
}
	case "medium":
	System.out.println("NonVeg tanduri pizza,medium size,prize- 390Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();
	
	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
	break;
}
	case "large":
	System.out.println("NonVeg tanduri pizza,large size,prize- 540Rs");
	System.out.println("Confirm order yes/no = ");
	
	vorder= sc.nextLine();
	switch(vorder) {
	case "yes":
System.out.println("Thank you,Your order is confirmed");
	break;
	case "no":
	System.out.println("NO order,please try again");
	break;
default:
		}	
							
	}
}

}}}	
	
	