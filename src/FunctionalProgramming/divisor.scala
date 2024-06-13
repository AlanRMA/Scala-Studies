def get_divisors(n: int, condition=lambda x: True):
  """
  Finds all positive divisors of a number 'n' that satisfy a given condition.

  Args:
      n: The integer to find divisors for.
      condition: An optional function that takes an integer divisor and returns True
                 if the divisor should be included in the result, False otherwise.

  Returns:
      A list of all positive divisors of 'n' that satisfy the condition.
  """

  def helper(div: int, arr: list[int]) -> list[int]:
    if div == 1:
      return arr + [1]
    else:
      if n % div == 0 and condition(div):
        return helper(div - 1, arr + [div])
      else:
        return helper(div - 1, arr)

  return helper(n, [])

def main():
  # Sample data
  a1 = 12  # 2 * 2 * 3
  a2 = 56  # 2 * 2 * 2 * 7
  a3 = 100  # 2 * 5 * 5

  # Filter to get only even divisors
  def is_even(x):
    return x % 2 == 0

  print(f"Even divisors of {a1}: {get_divisors(a1, is_even).mkString(', ')}")
  print(f"Even divisors of {a2}: {get_divisors(a2, is_even).mkString(', ')}")
  print(f"Even divisors of {a3}: {get_divisors(a3, is_even).mkString(', ')}")

if __name__ == "__main__":
  main()
