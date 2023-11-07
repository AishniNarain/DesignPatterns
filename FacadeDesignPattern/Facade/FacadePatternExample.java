package Facade ;
import java.sql.Driver;

class Firefox{

    public static Driver getFirefoxDriver(){
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML Report for Firefox Driver");
    }

    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUnit Report for Firefox Driver");
    }
}

class Chrome{

    public static Driver getChromeDriver(){
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML Report for Chrome Driver");
    }

    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUnit Report for Chrome Driver");
    }
}

class WebExplorerHelperFacade{
    public static void generateReports(String explorer, String report, String test){
        Driver driver = null;

        switch(explorer){
            case "firefox":
                driver = Firefox.getFirefoxDriver();
                switch(report){
                    case "html":
                        Firefox.generateHTMLReport(test,driver);
                        break;
                    case "JUnit":
                        Firefox.generateJUnitReport(test, driver);
                        break;
                }
            break;

            case "chrome":
                driver = Chrome.getChromeDriver();
                switch(report){
                    case "html":
                        Chrome.generateHTMLReport(test,driver);
                        break;
                    case "JUnit":
                        Chrome.generateJUnitReport(test, driver);
                        break;
                }
            break;
        }
    }
}

public class FacadePatternExample{
    public static void main(String args[]){
        String test = "CheckElementPresnt";

        WebExplorerHelperFacade.generateReports("firefox", "html", test);
        WebExplorerHelperFacade.generateReports("firefox", "JUnit", test);
        WebExplorerHelperFacade.generateReports("chrome", "html", test);
        WebExplorerHelperFacade.generateReports("chrome", "JUnit", test);
    }
}

 