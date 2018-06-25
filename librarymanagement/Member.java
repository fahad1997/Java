package librarymanagement;

import java.util.Scanner;

public class Member {

    public String name;
    public String id;
    Scanner input=new Scanner(System.in);
    
    public void Memberinfo(){
        System.out.println("Member Name:");
        name=input.nextLine();
        System.out.println("Member ID:");
        id=input.nextLine();
    }
    

    public String getMemberID() {
        return id;
    }

    public void setMemberIDNow(String MemberID) {
        id = MemberID;
    }

    public String getMemberName() {
        return name;
    }

    public void setMemberName(String MemberName) {
        name = MemberName;
    }
}
