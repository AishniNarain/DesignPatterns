class Main {
    
    public static void main(String args[]) throws InterruptedException{

        System.out.println("Object created using Prototype Design Pattern");
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("125.67.4.5");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);

        try{
            NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection)networkConnection.clone();

            System.out.println(networkConnection2);
            System.out.println(networkConnection3);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

}


