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
