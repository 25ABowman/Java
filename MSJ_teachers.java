
import java.util.Scanner;



public class MSJ_teachers {


      public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Enter a department (Math, History, or Science)");
          String dept = scanner.nextLine();
          
          switch (dept) {
            case "Math":
              System.out.println("Enter a teacher (Mr. Romeo, Ms. Burnahm, or Ms. Gallagher))");
              String teacher = scanner.nextLine();

              switch (teacher) {
                case "Mr. Romeo":
                  System.out.println("Which class does Mr. Romeo teach? (Trigonometry, Algebra 2, or Calculus)");
                  String romeoClass = scanner.nextLine();  
                  switch (romeoClass) {
                    case "Trigonometry":
                      System.out.println("Mr. Romeo teaches Trigonometry");
                      break;
                    case "Algebra 2":
                      System.out.println("Mr. Romeo teaches Algebra 2");
                      break;
                    case "Calculus":
                      System.out.println("Mr. Romeo teaches Calculus");
                      break;
                    default:
                      System.out.println("I don't know that class");
                  }
                  break;
                case "Ms. Burnahm":
                  System.out.println("What class does Ms. Burnahm teach? (Geometry, Calculus, Algebra 1");
                  String burnahmClass = scanner.nextLine();
                  switch (burnahmClass) {
                    case "Geometry":
                      System.out.println("Ms. Burnahm teaches Geometry");
                      break;
                    case "Calculus":
                      System.out.println("Ms. Burnahm teaches Calculus");
                      break;
                    case "Algebra 1":
                      System.out.println("Ms. Burnahm teaches Algebra 1");
                      break;
                    default:
                      System.out.println("I don't know that class");
                  }
                  break;
                case "Ms. Gallagher":
                  System.out.println("What does Mrs. Galagher teach? (AP ab Calculus, AP BC Calculus, or AP Statistics");
                  String gallagherClass = scanner.nextLine();
                  switch (gallagherClass) {
                    case "AP AB  Calculus":
                      System.out.println("Mrs. Gallagher teaches AP ab Calculus");
                      break;
                    case "AP BC Calculus":
                      System.out.println("Mrs. Gallagher teaches AP BC Calculus");
                      break;
                    case "AP Statistics":
                      System.out.println("Mrs. Gallagher teaches AP Statistics");
                      break;
                    default:
                      System.out.println("She doesn't teach that class");
                  }
                  break;
                default:
                  System.out.println("I don't know that teacher");
              }
              break;
            case "History":
              System.out.println("Enter a teacher (Mr. Davis, Mr. Andrews, or Mr. Vicchio))");
              String teacher2 = scanner.nextLine();
              switch (teacher2) {
                case "Mr. Davis":
                  System.out.println("What does Mr. Davis teach? (Modern America, Modern World history, US History)");
                  String davisClass = scanner.nextLine();
                  switch (davisClass) {
                    case "Modern America":
                      System.out.println("Mr. Davis teaches Modern America");
                      break;
                    case "Modern World History":
                      System.out.println("Mr. Davis teaches Modern World History");
                      break;
                    case "US History":
                      System.out.println("Mr. Davis teaches US History");
                      break;
                    default:
                      System.out.println("He doesn't teach that class");
                  }
                  break;
                case "Mr. Andrews":
                  System.out.println("What does Mr. Andrew teach? (Honors Modern America, AP world history, or AP US History)");
                  String andrewsClass = scanner.nextLine();
                  switch (andrewsClass) {
                    case "Honors Modern America":
                      System.out.println("Mr. Andrews teaches Honors Modern America");
                      break;
                    // Add more cases here
                    default:
                      System.out.println("He doesn't teach that class");
                  }
                  break;
                // Add more cases here
                default:
                  System.out.println("I don't know that teacher");
              }
              break;
            // Add more cases here
            default:
              System.out.println("I don't know that department");
          }
        }
      }
    }
    