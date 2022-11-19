Catalan numbers:
https://www.youtube.com/watch?v=i5V21WCHTVo

How many possible ways to move from (0,0) to (5,5), given we cannot have y > x.
total = (2n c n) - (2n c n-1) => (10 c 5) - (10 c 4) => 168

How many ways can you arrange the numbers {1,2,3,4,5,6}, the numbers when reading from
left to right and no time to read more even numbers than odd numbers.
Representation of the input=> {o,e,o,e,o,e}
total=> (6 c 3) - (6 c 2) = 5
total number of ways to arrange odd and even numbers is => 5 * 3! * 3! => 180

----------------------------------------------------------------------------------

Permutations:
    - Arranging things in different order.
    - Order matters

    Ex:
    1. Arrange different letters of word ABC
        ABC, ACB, BAC, BCA, CAB, CBA

        Given 4 letters A, B, C & D. In how many ways can we arrange 2 of the 4 letters.(n p r => n!/(n-r)!)

    2. In how many ways can we arrange 5 books in a shelf?
       Does the order matter? Yes.
       Total possible solutions are: n!

    3. How many ways the letters in ALABAMA can be arranged?
        7!/4! => 210

Combinations:
    - Combining things.
    - Order doesn't matter

    Ex:
    1. Make a combination of ABC
       ABC or CBA. As the order doesn't matter, it is considered as only one.

        Given 4 letters A, B, C & D. In how many ways can be combine 2 of the 4 letters. n c r => n!/(n-r)!r!
    2. How many teams of 4 can be produced from a  pool of 12 engineers.
       Does the order matter? No
       Total possible solutions: 495

Reference: https://www.youtube.com/watch?v=XJnIdRXUi7A
-----------------------------------------------------------------------------------