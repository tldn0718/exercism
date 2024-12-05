# Darts

Welcome to Darts on Exercism's Kotlin Track.
If you need help running the tests or submitting your code, check out `HELP.md`.

## Instructions

Write a function that returns the earned points in a single toss of a Darts game.

[Darts][darts] is a game where players throw darts at a [target][darts-target].

In our particular instance of the game, the target rewards 4 different amounts of points, depending on where the dart lands:

![Our dart scoreboard with values from a complete miss to a bullseye](https://assets.exercism.org/images/exercises/darts/darts-scoreboard.svg)

- If the dart lands outside the target, player earns no points (0 points).
- If the dart lands in the outer circle of the target, player earns 1 point.
- If the dart lands in the middle circle of the target, player earns 5 points.
- If the dart lands in the inner circle of the target, player earns 10 points.

The outer circle has a radius of 10 units (this is equivalent to the total radius for the entire target), the middle circle a radius of 5 units, and the inner circle a radius of 1.
Of course, they are all centered at the same point — that is, the circles are [concentric][] defined by the coordinates (0, 0).

Write a function that given a point in the target (defined by its [Cartesian coordinates][cartesian-coordinates] `x` and `y`, where `x` and `y` are [real][real-numbers]), returns the correct amount earned by a dart landing at that point.

## Credit

The scoreboard image was created by [habere-et-dispertire][habere-et-dispertire] using [Inkscape][inkscape].

[darts]: https://en.wikipedia.org/wiki/Darts
[darts-target]: https://en.wikipedia.org/wiki/Darts#/media/File:Darts_in_a_dartboard.jpg
[concentric]: https://mathworld.wolfram.com/ConcentricCircles.html
[cartesian-coordinates]: https://www.mathsisfun.com/data/cartesian-coordinates.html
[real-numbers]: https://www.mathsisfun.com/numbers/real-numbers.html
[habere-et-dispertire]: https://exercism.org/profiles/habere-et-dispertire
[inkscape]: https://en.wikipedia.org/wiki/Inkscape

## Source

### Created by

- @lathspell

### Contributed to by

- @eparovyshnaya
- @uzilan

### Based on

Inspired by an exercise created by a professor Della Paolera in Argentina

## What I learned

Note that the type of parameters must be `Number`, not `Int` or `Double`.
`Number` is an abstract class implemented by all number wrapper classes in Kotlin.
Additionally, operators such as `+`, `*` do not work directly with `Number`. (Check!)
Using operators between two `Number` instances without type case(e.g. `x.toDouble()`) results in the following error.

```
e: Darts.kt: (2, 47): Unresolved reference. None of the following candidates is applicable because of receiver type mismatch:
public inline operator fun BigDecimal.times(other: BigDecimal): BigDecimal defined in kotlin
public inline operator fun BigInteger.times(other: BigInteger): BigInteger defined in kotlin
e: Darts.kt: (2, 55): Unresolved reference. None of the following candidates is applicable because of receiver type mismatch:
public inline operator fun BigDecimal.times(other: BigDecimal): BigDecimal defined in kotlin
public inline operator fun BigInteger.times(other: BigInteger): BigInteger defined in kotlin
```

I need to study about abstact classes and operator overloading in Kotlin.

