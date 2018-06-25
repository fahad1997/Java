package librarymanagement;

public class AudioBook extends Books{

       String durationOfTheAudioBook;
    Member member;

    public AudioBook(String BookID, String BookTitle, String BookAuthor, String durationOfTheAudioBook) {
        super(BookID, BookTitle, BookAuthor);
        this.durationOfTheAudioBook = durationOfTheAudioBook;
        member = new Member();
        member.setMemberIDNow("0");
    }

    public void setbookprice(Double Price) {
        setBookPrice(Price);
    }

    public void updateMemberID(String MemberID, String MemberName) {
        member.setMemberIDNow(MemberID);
        member.setMemberName(MemberName);
        setMemberID(MemberID);
    }
    
}
