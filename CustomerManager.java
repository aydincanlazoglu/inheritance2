package inheritance2;

public class CustomerManager {
	public void add(EmailLogger emailLogger) {
		System.out.println("Müþteri Eklendi");
		DatabaseLogger logger = new DatabaseLogger();
		EmailLogger Logger1 = new EmailLogger();
		FileLogger logger2 = new FileLogger();
		ChatLogger logger3 = new ChatLogger();
		logger.log();
		Logger1.log();
		logger2.log();
		logger3.log();
		}
	}
