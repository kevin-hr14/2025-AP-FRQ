Part A
The walkDogs method is used to:
Determine how many dogs the dog walker can walk based on a certain time (hour), tell the DogWalkCompany this number, and return this number.

    1. Check how many dogs are available for walking in the current period:
    Use the numAvailableDogs(hour) method to get the number of dogs available for walking in the current hour from the DogWalkCompany.
    
    2. Determine the maximum number of dogs that can be walked:
    The dog walker has an upper limit (maxDogs), and he can only walk this many dogs at most.
    
    3. Decide how many dogs to actually walk:
    Take the smaller value of "the number of dogs available for walking provided by the company" and maxDogs.
    
    4. Update the DogWalkCompany record:
    Use updateDogs(hour, dogsToWalk) to update the number of dogs to walk
    
    5. Return this number:
    Return this number.


Part B
The dogWalkShift method is used to:
Perform a dog walking shift from startHour to endHour, calculate the total income of the dog walker during this period and return this amount.

    1. Process each hour from startHour to endHour (inclusive).
    
    2. Call the walkDogs(hour) method:
    For each hour, call walkDogs to get the number of dogs walked in this hour.
    
    3. Calculate the salary:
    The base salary for each dog is $5, so the base salary is the number of dogs × 5.
    
    4. Determine whether to get a bonus:
    If any of the following two conditions is true, add a $3 bonus:
    a) This hour exactly walked maxDogs
    b) The current hour is between 9 and 17, inclusive.
    
    5. Add up the hourly income:
    Add the total income for the current hour (base salary + possible bonus) to a sum.
    
    6. Return total income:
    Finally, return the total income of all hours as the result.
