package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabani Longlandı");
		}else if(logType== 2) {
			System.out.println("Dosya longlandı");
		}else {
			System.out.println("Email Gönderildi");
		}
	}
}
