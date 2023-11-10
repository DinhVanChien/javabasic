package exercise;

public class ReverseNumber {
//Tìm số đảo ngược của số nguyên dương đã cho VD: 789 -> Kết quả: 987, 1000 -> 1; 2001 -> 1002
//Note: Chia cho 10
	public static long getReverseNumber(long number) {
		long result = 0;
		StringBuilder stringBuilder = new StringBuilder();
		if(number > 0) {
			long temp = 0;
			while (number > 0 && number >= 10) {
				temp = number % 10;
				number = (number - temp) / 10;
				if(temp > 0 || !stringBuilder.toString().isEmpty()) {
					stringBuilder.append(temp + "");
				}
			}
			stringBuilder.append(number + "");
		}
		result = Long.parseLong(stringBuilder.toString());
		return result;
	}
	public static void main(String[] args) {
		long number = 241096;
		long result = getReverseNumber(number);
		System.out.println(result);
	}
}
