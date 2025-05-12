//Part A

public int walkDogs(int hour){
  int c = 0;
  if (maxDogs >= company.numAvailableDogs(hour)){
    company.updateDogs(hour,numDogs);
    return company.numAvailableDogs(hour);
  }
  company.updateDogs(hour,nmaxDogs);
  return company.numAvailableDogs(hour);
}
