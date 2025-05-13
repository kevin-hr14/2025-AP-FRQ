public  int dogWalkShift(int startHour, int endHour){
  int c = 0;
  
  for(int i = startHour; i < endHour; i++){
    c += walkDogs(i)*5;
    
    if (walkDogs(i) == maxDogs || (i >= 9 && i <= 17)){
      c += 3;
    }
    
  }
  
  return c;
}
