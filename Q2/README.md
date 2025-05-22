This topic is about a SignedText class, which is used to process signature strings. It contains a constructor and two methods: getSignature and addSignature.

1. Constructor This function accepts two string parameters: firstName and lastName. Its function is to store these two values ​​in the class (lastName must have a length ≥ 1, and firstName may be an empty string "").

2. getSignature method This is a method used to generate a signature string.
The return value rules are as follows: • If firstName is an empty string:
a) Return lastName itself as the signature. • If firstName is not an empty string:
b) Return the first letter of firstName + "-" + lastName.

3. addSignature method This method accepts a string text as a parameter and returns a new string processed according to the signature. The processing logic is as follows:

• If the string does not contain a signature: directly add the signature to the end of the original string and return it.
• If the signature appears at the end of the string: return the original string without modification.

• If the signature appears at the beginning of the string: remove the signature from the beginning, then add it to the end and return it.
