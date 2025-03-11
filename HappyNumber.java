public boolean isHappy(int n) {
  set<Integer> visit=new HashSet<>();
  while(!visit.contain(n)){
      visit.add(n);
      n = sumOfDigitSquare(n);
      if(n == 1){
          return true;
      }
  } 
  return false;
}

private int sumOfDigitSquare(int n){
  while(n > 0){
      int digit = n % 10;
      digit *= digit;
      output += digit;
      n = n/10;
  }
  return output;
}


public boolean isHappy(int n) {
  int slow = n, fast = sumOfSquares(n);

  while (slow != fast) {
      fast = sumOfSquares(fast);
      
      fast = sumOfSquares(fast);
      
      slow = sumOfSquares(slow);
      
  }
  return fast == 1;
}

private int sumOfSquares(int n){
  int output=0;
  while(n > 0){
      int digit = n % 10;
      digit *= digit;
      output += digit;
      n = n/10;
  }
  return output;
}

