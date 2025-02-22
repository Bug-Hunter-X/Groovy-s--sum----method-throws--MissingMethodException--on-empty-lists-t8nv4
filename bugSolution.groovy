def list = [1, 2, 3, 4, 5]

println list.sum() // Output: 15

list = []

println list.sum() ?: 0 // Output: 0

//Alternative solution using elvis operator
println list.sum() ?: 0 // Output: 0

//More robust solution using a function
def sumList(list) {
    if(list.isEmpty()){
        return 0
    }
    return list.sum()
}
println sumList([] ) //Output: 0
println sumList([1,2,3]) // Output:6