import java.util.Scanner;

public class MiniBank {

	public static class BankInfo {
		private final String name;
		private final String branch;

		public BankInfo(String name, String branch) {
			this.name = name;
			this.branch = branch;
		}

		public String name() {
			return name;
		}

		public String branch() {
			return branch;
		}

		@Override
		public String toString() {
			return "BankInfo[name=" + name + ", branch=" + branch + "]";
		}
	}

	public enum MenuOption {
		OPEN_ACCOUNT,
		DEPOSIT,
		WITHDRAW,
		TRANSFER,
		EXIT
	}

	public static void main(String[] args) {
		BankInfo header = new BankInfo("MiniBank", "Main Branch");
		System.out.println(header);

		try (Scanner scanner = new Scanner(System.in)) {
			MenuOption choice;
			do {
				System.out.println();
				System.out.println("1. Open Account");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Transfer");
				System.out.println("5. Exit");
				System.out.print("Choose an option: ");

				int selected = scanner.nextInt();
				choice = switch (selected) {
					case 1 -> MenuOption.OPEN_ACCOUNT;
					case 2 -> MenuOption.DEPOSIT;
					case 3 -> MenuOption.WITHDRAW;
					case 4 -> MenuOption.TRANSFER;
					case 5 -> MenuOption.EXIT;
					default -> null;
				};

				if (choice == null) {
					System.out.println("Invalid choice.");
					continue;
				}

				String message = switch (choice) {
					case OPEN_ACCOUNT -> "Open Account - to be implemented in a later lab";
					case DEPOSIT -> "Deposit - to be implemented in a later lab";
					case WITHDRAW -> "Withdraw - to be implemented in a later lab";
					case TRANSFER -> "Transfer - to be implemented in a later lab";
					case EXIT -> "Goodbye!";
				};

				System.out.println(message);
			} while (choice != MenuOption.EXIT);
		}
	}
}
