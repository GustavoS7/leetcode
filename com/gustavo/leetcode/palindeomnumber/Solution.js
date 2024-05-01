var isPalindrome = (x) => {
  let value = x.toString()
  for (let i = 0; i < value.length / 2; i ++) {
    if (value[i] !== value[value.length - i -1]) {
      return false
    }
  }
  return true
}