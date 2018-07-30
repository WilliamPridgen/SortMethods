public class Divi_Con {
	public static void sort(int[] list) {
		sort(list, 0, list.length - 1);
	}

	private static void sort(int[] list, int low, int high) {
		if (low < high) {
			int indexOfMin = low;
			int min = list[low];
			for (int i = low	 + 1; i <= high; i++) {
				if (list[i] < min) {
					min = list[i];
					indexOfMin = i;
				}
			}
			list[indexOfMin] = list[low];
			list[low] = min;
			sort(list, low + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] list = new int[args.length];

		for (int j = 0; j < args.length; j++){
			list[j]= Integer.parseInt(args[j]);
			System.out.printf(list[j] + " ","/n");
		}
		System.out.println();
		sort(list);		

		System.out.print("The smallest integer is: " + list[0] );
	}

}
