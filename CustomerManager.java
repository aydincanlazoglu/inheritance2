package inheritance2;

public class CustomerManager {
	public void add(EmailLogger emailLogger) {
		System.out.println("M��teri Eklendi");
		DatabaseLogger logger = new DatabaseLogger();
		EmailLogger logger1 = new EmailLogger();
		FileLogger logger2 = new FileLogger();
		logger.log();
		}
	}
