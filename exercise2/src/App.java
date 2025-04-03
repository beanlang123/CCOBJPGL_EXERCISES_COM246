import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
  
//         System.out.println("Enter your username:");

//         Scanner loginScanner = new Scanner(System.in);

//         String username_from_input = loginScanner.nextLine();

//         System.out.println("Enter your password:");

//         String password_from_input = loginScanner.nextLine();

//         user me = new user(username_from_input, password_from_input);

//         File myfile = new File("account.txt");

//         if (myfile.exists()) {
//             System.out.println("File exists");
//         }

//         Scanner fileScanner = new Scanner(myfile);

//         Boolean accountexists = false;
//         while (fileScanner.hasNextLine()) {
            
//             String filedata = fileScanner.nextLine();

//             String username_from_file = filedata.split(",")[0];
            
//             String password_from_file = filedata.split(",")[1];
            
//             if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
//                 accountexists = true;
//                 break;
//             }
//         }

//         if(accountexists){
//             System.out.println("Account are successful login");
//         }
//         else{
//             System.out.println("does not exists");
//         }

//         fileScanner.close();
//     }
// }

DataScientist DataScientist1 = new DataScientist("John", "", 0);

System.out.println("Employee name: " + DataScientist1.name);
System.out.println("Employee work: " + DataScientist1.getWork());
System.out.println("Employee salary: " + DataScientist1.getSalary());


Researcher researcher1 = new Researcher("Jane","", 0);

System.out.println("Employee name: " + researcher1.name);
System.out.println("Employee work: " + researcher1.getWork());
System.out.println("Employee salary: " + researcher1.getSalary());
    }
}
