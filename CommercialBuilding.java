public class CommercialBuilding extends Building {
    private String businessType;
    private int officeSpaces;

    public CommercialBuilding(String name, int floors, String businessType, int officeSpaces) {
        super(name, floors, "Commercial");
        this.businessType = businessType;
        this.officeSpaces = officeSpaces;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Business Type: " + businessType);
        System.out.println("Office Spaces: " + officeSpaces);
    }

    public static void main(String[] args) {
        CommercialBuilding office = new CommercialBuilding("Tech Hub", 8, "Technology", 25);
        office.displayInfo();
    }
}