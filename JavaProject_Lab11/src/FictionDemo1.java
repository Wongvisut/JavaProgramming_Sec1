import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Book title : ");
		String bookTitle = scan.nextLine();
		System.out.print("Book public Year : ");
		int bookPubYear = Integer.parseInt(scan.nextLine());
		FictionBook book = new FictionBook(bookTitle,bookPubYear);
		System.out.print("Author name : ");
		String authorName = scan.nextLine();
		book.setAuthorName(authorName);
		while(!book.checkFormatName()) {
			System.out.print("again, Author name : ");
			authorName = scan.nextLine();
			book.setAuthorName(authorName);
		}
		System.out.print("Author email : ");
		String authorEmail = scan.nextLine();
		book.setEmail(authorEmail);
		while(!book.checkEmail()) {
			System.out.print("again, Author email : ");
			authorEmail = scan.nextLine();
			book.setEmail(authorEmail);
		}
		System.out.println(book);
	}
}
