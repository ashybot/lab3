

public class ArrayExamples {

  // Changes the input array to be in reversed order
  // Problem: Overwrites elements which will be needed later
  static void reverseInPlace(int[] arr) {
    // {3, 6}
    for(int i = 0; i < arr.length; i += 1) {
      // i = 0: {6, 6}
      // i = 1: {6, 6}
      arr[i] = arr[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  // Problem: Uses wrong array name when assigning values!
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      // Flip arr and newArray!
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

