public class Emp {
    private String name;
    private int yearOfJoining;
    private String address;

    public Emp(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInformation() {
        System.out.printf(name+"\t"+yearOfJoining+"\t\t" +address+"\n");
    }

    public static void main(String[] args) {
        Emp employee1 = new Emp("Robert", 1994, "64C- WallsStreet");
        Emp employee2 = new Emp("Sam", 2000, "68D- WallsStreet");
        Emp employee3 = new Emp("John", 1999, "26B- WallsStreet");

        System.out.println("Name	YearOfJoining	Address");
        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
    }
}