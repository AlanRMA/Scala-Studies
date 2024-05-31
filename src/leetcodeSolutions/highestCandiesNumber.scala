// problem link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] =
     candies.map(_ + extraCandies >= candies.max).toList
}