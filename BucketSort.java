import java.util.*;
public class BucketSort {
	public static void main(String[] args) { 



		String[] myList = new String[args.length];
		System.out.println("Unsorted List: ");
		
		for (int i = 0; i < args.length; i++){
			myList[i]= args[i];
			System.out.printf(myList[i] + " ","/n");	
		}

		System.out.println();
		sort(myList);
		System.out.println();
		System.out.println("After Bucket Sort:");
		System.out.println(Arrays.toString(myList));  
	}
	
	public static void sort(String[] wordList) {


		int index = 0;
		int max = 0;
		char a = 'a';
		
		if (wordList.length == 0) return;
		
		for (int i = 1; i < wordList.length; i++) {
			if (max < wordList[i].length()) max = wordList[i].length();
		}

		int counter = 26;   
		HashMap<Character, Vector<String>> buckets = new HashMap<Character, Vector<String>>(counter);
		
		for (int i = 0; i <= counter; i++, a++){
			buckets.put(a, new Vector<String>());
		}   

		System.out.println("Bucket size: " + counter);
		System.out.println();

		for (int i = 0; i < wordList.length; i++) {

			String current = wordList[i];
			char letter = current.toLowerCase().charAt(0);
			buckets.get(letter).add(wordList[i]);
		}

		for (char letter = 'a'; letter <= 'z'; letter++) {
			Vector<String> bucket = buckets.get(letter);

			System.out.println("Bucket "+ letter+": "+bucket);
			for (int i = 1; i < bucket.size(); i++){
				String temp = bucket.get(i);

				bucket.remove(i);
				int j;
				for(j = i-1; j >= 0 && 	bucket.get(j).compareToIgnoreCase(temp) > 0; j--){

					bucket.add(j+1, bucket.get(j));
					bucket.remove(j);

				}
				bucket.add(j+1, temp);

			}

			for (int k = 0; k < bucket.size(); k++) {
				wordList[index++] = bucket.get(k);
			}
		}
	}
}