# Задача 1. LeetCode 151. Reverse Words in a String
> Given an input string s, reverse the order of the **words**.
> A **word** is defined as a sequence of non-space characters.
> The **words** in s will be separated by at least one space.
> *Return a string of the words in reverse order concatenated by a single space.*
> **Note** that **s** may contain leading or trailing spaces or multiple spaces between two words.
> The returned string should only have a single space separating the words. Do not include any extra spaces.

## Example 1:
````
Input: s = "the sky is blue"
Output: "blue is sky the"
````
## Example 2:
````
Input: s = "&nbsp;  hello world  &nbsp;"
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
````
## Example 3:
````
Input: s = "a good &nbsp; example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
````
 ***
# Задача 2
> Дана последовательность целых чисел, оканчивающаяся нулем.
> Найти сумму положительных чисел, после которых следует отрицательное число.
````
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5
````