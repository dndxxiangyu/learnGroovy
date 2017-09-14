package groovyR

println "groovy script"
String.metaClass.isPalindrome = { ->
    delegate == delegate.reverse()
}
word = 'tattarrattat'
println "$word is a palindrome ? ${word.isPalindrome()}"
word = 'Groovy'
println "$word is a palindrome ? ${word.isPalindrome()}"