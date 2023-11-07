package Proxy;

interface DatabaseExecuter{
    public void executeDatabase(String query) throws Exception;
}

    class DatabaseExecuterImpl implements DatabaseExecuter{

        public void executeDatabase(String query) throws Exception{
            System.out.println("Going to execute query : "+ query);
        }
    }

    class DatabaseExecuterProxy implements DatabaseExecuter{

        boolean ifAdmin;
        DatabaseExecuterImpl dbexecutor;

        public DatabaseExecuterProxy(String name, String password){
            if(name == "Admin" && password == "Admin@123"){
                ifAdmin = true;
                dbexecutor = new DatabaseExecuterImpl();
            }
        }

        public void executeDatabase(String query) throws Exception{
            if(ifAdmin){
                dbexecutor.executeDatabase(query);
            }
            else{
                if(query.equals("DELETE")){
                    throw new Exception("Delete query not allowed for non-admin user");
                }
                else{
                    dbexecutor.executeDatabase(query);
                }
            }
        }
    }

    public class ProxyPatternExample{
        public static void main(String args[]) throws Exception{
            // DatabaseExecuter nonadminexecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
            // nonadminexecuter.executeDatabase("DELETE");

            DatabaseExecuter adminexecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
            adminexecuter.executeDatabase("DELETE");
        }
    }



