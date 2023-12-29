
impl Solution {
    pub fn kids_with_candies(candies: Vec<i32>, extra_candies: i32) -> Vec<bool> {
      let mut max = 0;

        for &candy in &candies {
            if candy > max {
                max = candy;
            }
        }

        let mut result = Vec::new();

        for &candy in &candies {
            result.push(extra_candies + candy >= max);
        }

        result
    }
}