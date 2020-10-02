
/**
 * Class made for SYSC 3110 course lab 1 to store a buddy's information
 *
 * @author Alexandre Hassan
 * @version october 02, 2020
 */
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;


    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        //BuddyInfo info = new BuddyInfo();
        System.out.println("HELLO " + "!");
    }
}
/*
1.
	.idea
		.gitignore
		misc.xml
		modules.xml
		workspace.xml
	src
	LAB1.iml
2.
	java.base
	java.compiler
	java.datatransfer
3.
	Process finished with exit code 0
 */
