object Darts {
    fun score(x: Number, y: Number) = when (x.toDouble() * x.toDouble() + y.toDouble() * y.toDouble()) {
      in 0.0..1.0 -> 10
      in 1.0..25.0 -> 5
      in 25.0..100.0 -> 1
      else -> 0
    }
}
