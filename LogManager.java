package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabaný Longlandý");
		}else if(logType== 2) {
			System.out.println("Dosya longlandý");
		}else {
			System.out.println("Email Gönderildi");
		}
	}
}
