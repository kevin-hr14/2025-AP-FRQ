Part A
    1) Prepare a list competitorList:
    Used to store all Competitor objects participating in this round.
    
    2) Loop through the passed names array:
    Each element in this array is the name of a competitor.
    
    3) Create a Competitor object for each name:
    Each name becomes a new Competitor. Its rank starts at 1 and increases in the order it appears in the array. That is, the first name is rank 1, the second is rank 2, and so     on.
    
    4) Add these Competitors to competitorList:
    Maintain the same order as the names array.

Part B
    1) Prepare an empty ArrayList<Match> to store the matches.
    
    2) Determine the odd or even number based on the number of players:
    If it is an odd number: skip the first-ranked player and do not participate in this round of pairing.
    If it is an even number: all players participate in the pairing.
    
    3) The pairing method is: the best (first) is paired with the worst (last), the second best is paired with the second to last, the third best is paired with the third to     last... and so on to the middle.
    
    4) For each pair, create a Match object and add it to the result list.
