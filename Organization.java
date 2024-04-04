class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor
    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }

    // Getters and Setters
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String setOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    // Clone method
    @Override
    public Organization Clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since Organization implement Cloneable
            throw new InternalError(e);
        }
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
}

public class Main {
    public static void main (String[] args) {
        // Creating an organization object
        Organization org1 = new Organization("001", "OrgName1", "Address1");

        //Cloning the organization object
        Organization org2 = org1.clone();

        //Printing details of both objects
        System.out.println("Details of org1:");
        org1.printDetails();
        System.out.println("\nDetails of org2 (cloned from org1):");
        org2.printDetails();

        // Modifying org2's details
        org2.setOrganizationName("OrgName2");

        // Printing details of both objects again to verify cloning
        System.out.println("\nDetails of org1 after modification:");
        org1.printDetails();
        System.out.println("\nDetails of org2 after modification:");
        org2.printDetails();
    }
}