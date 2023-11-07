public class NetworkConnection implements Cloneable{
    
    private String ip;
    private String importantdata;


    
    
    @Override
    public String toString() {
        
        return this.ip + " : " + this.importantdata;
    }


    public String getIp() {
        return ip;
    }

    
    public void setIp(String ip) {
        this.ip = ip;
    }

    
    public String getImportantdata() {
        return importantdata;
    }

    
    public void setImportantdata(String importantdata) {
        this.importantdata = importantdata;
    }

    public void loadImportantData() throws InterruptedException{
        this.importantdata = "Very important data";
        Thread.sleep(2000);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }


}
