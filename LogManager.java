package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritaban� Longland�");
		}else if(logType== 2) {
			System.out.println("Dosya longland�");
		}else {
			System.out.println("Email G�nderildi");
		}
	}
}
