//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val treatFunction = trickOrTreat(false){ "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    repeat(5) {
        treatFunction()
    }
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats 2!")
}
 val treat: ()-> Unit = {
println("i have treats, want you come with me?")
 }