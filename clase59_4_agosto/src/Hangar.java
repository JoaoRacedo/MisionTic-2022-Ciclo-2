public class Hangar {
    private double Id;
    private String donde;
    
    public Hangar(double Id, String donde) {
        this.Id = Id;
        this.donde = donde;
    }

    public double getId() {
        return Id;
    }

    public void setId(double id) {
        Id = id;
    }

    public String getDonde() {
        return donde;
    }

    public void setDonde(String donde) {
        this.donde = donde;
    }

    
}
