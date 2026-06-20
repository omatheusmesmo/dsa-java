# Bit Manipulation Pattern

Bit manipulation uses bitwise operators (AND, OR, XOR, NOT, shifts) for efficient computation. It is powerful for uniqueness problems, masks, and low-level optimization.

## When to Use
- Uniqueness/duplicate detection (XOR)
- Bit masking for subsets and combinations
- Power of two checks
- Counting set bits
- Integer overflow detection
- Low-level optimization

## Key Operators
- `&` (AND): Both bits must be 1
- `|` (OR): Either bit is 1
- `^` (XOR): Bits differ
- `~` (NOT): Flip all bits
- `<<` / `>>`: Left/right shift

## Common Tricks
- `n & (n - 1)` removes the lowest set bit
- `n & (-n)` isolates the lowest set bit
- `n ^ n = 0` and `n ^ 0 = n` (XOR identity)
- `n & 1` checks if odd

## Problems

### Easy
- [Single Number](src/main/java/dev/omatheus/dsa/bitmanipulation/easy/SingleNumber.java)
- [Number of 1 Bits](src/main/java/dev/omatheus/dsa/bitmanipulation/easy/NumberOf1Bits.java)
- [Counting Bits](src/main/java/dev/omatheus/dsa/bitmanipulation/easy/CountingBits.java)
- [Reverse Bits](src/main/java/dev/omatheus/dsa/bitmanipulation/easy/ReverseBits.java)
- [Missing Number](src/main/java/dev/omatheus/dsa/bitmanipulation/easy/MissingNumber.java)

### Medium
- [Reverse Integer](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/ReverseInteger.java)
- [Single Number II](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/SingleNumberII.java)
- [Bitwise AND of Numbers Range](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/BitwiseAndOfNumbersRange.java)
- [Power of Two](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/PowerOfTwo.java)
- [Sum of Two Integers](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/SumOfTwoIntegers.java)
- [Flipping Bits](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/FlippingBitsHackerRank.java)
- [Lonely Integer](src/main/java/dev/omatheus/dsa/bitmanipulation/medium/LonelyIntegerHackerRank.java)
