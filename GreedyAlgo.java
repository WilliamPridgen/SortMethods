class GreedyAlgo {
	public static void main (String args[]) {

		int[] list = new int[args.length];

		for (int i = 0; i < args.length; i++){
			list[i]= Integer.parseInt(args[i]);
		}
		System.out.println("Original amount: "+ list[0] +" cents");
		greedSort(list);

	}

	public static void greedSort(int[] list){


		int coin1= 0;
		int coin2= 0;
		int coin3= 0;
		int coin4= 0;

		while (list[0] > 0 ){
			if (list[0]>=25) {
				System.out.println("Total number of Quarters: " + list[0]/25);
				coin1 =  list[0]/25;
				list[0]-=list[0]/25*25;

			}
			else if (list[0]>=10) {
				System.out.println("Total number of Dimes: " + list[0]/10);
				coin2 =  list[0]/10;
				list[0]-=list[0]/10*10;

			}
			else if (list[0]>=5) {
				System.out.println("Total number of Nickels: " + list[0]/5);
				coin3 =  list[0]/5;
				list[0]-=list[0]/5*5;

			}
			else if (list[0]>=1) {
				System.out.println("Total number of Pennies: " + list[0]/1);
				coin4 =  list[0]/1;
				list[0]-=list[0]/1*1;

			}

		}
		int total = coin1+coin2+coin3+coin4;

		System.out.println("Total number of Coins: "+total);
	}
}