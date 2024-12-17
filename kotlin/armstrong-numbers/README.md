# Armstrong Numbers

Welcome to Armstrong Numbers on Exercism's Kotlin Track.
If you need help running the tests or submitting your code, check out `HELP.md`.

## Instructions

An [Armstrong number][armstrong-number] is a number that is the sum of its own digits each raised to the power of the number of digits.

For example:

- 9 is an Armstrong number, because `9 = 9^1 = 9`
- 10 is _not_ an Armstrong number, because `10 != 1^2 + 0^2 = 1`
- 153 is an Armstrong number, because: `153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153`
- 154 is _not_ an Armstrong number, because: `154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190`

Write some code to determine whether a number is an Armstrong number.

[armstrong-number]: https://en.wikipedia.org/wiki/Narcissistic_number

## Source

### Created by

- @lathspell

### Contributed to by

- @eparovyshnaya
- @uzilan

### Based on

Wikipedia - https://en.wikipedia.org/wiki/Narcissistic_number

## What I learned

- Although `toString` and `digitToInt` could have been used, I intentionally chose an algorithmic approach to calculate the digits.
    - `val digits = input.toString().map { it.digitToInt() }`
- In Kotlin, lists can be either immutable or mutable. `listOf` returns an immutable list, whereas `mutableListOf` returns a mutable list.
- Since `kotlin.math.pow` is an extension function for `Double` and `Float`, you need to call `toDouble` when calculating the power of integers.

