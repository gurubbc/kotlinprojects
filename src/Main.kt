fun main() {
    val number: Int = 22
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    val intSizeInBytes: Int = Int.SIZE_BYTES

    println("Hello World!")
    println("Max value is $maxIntegerValue")
    println("Min value is $minIntegerValue")
    println("Byte Size $intSizeInBytes")

    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    println("Max Byte Value $maxByteValue")
    println("Min Byte value $minByteValue")

    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    println("Max Short Value $maxShortValue")
    println("Min Short value $minShortValue")
    println("Short Byte size ${Short.SIZE_BYTES}")

    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    println("Max Long value $maxLongValue")
    println("Min Long value $minLongValue")
    println("Long byte size is ${Long.SIZE_BYTES}")

    val maxFloatValue: Float = Float.MAX_VALUE
    val minFloatValue: Float = Float.MIN_VALUE
    val floatByteSize: Int = Float.SIZE_BYTES
    println("Max float value is $maxFloatValue")
    println("min Float value is $minFloatValue")
    println("Float Byte Size is $floatByteSize")

    val maxDoubleValue: Double = Double.MAX_VALUE
    val minDoubleValue: Double = Double.MIN_VALUE
    val doubleByteSize: Int = Double.SIZE_BYTES
    println("Max Double Value is $maxDoubleValue")
    println("Min Double value is $minDoubleValue")
    println("Double Byte size is $doubleByteSize")

    val maxCharacterValue: Char = Char.MAX_VALUE
    val minCharacterValue: Char = Char.MIN_VALUE
    val characterByteSize: Int = Char.SIZE_BYTES
    println("Max character value is $maxCharacterValue")
    println("Min character value is $minCharacterValue")
    println("Character byte size is $characterByteSize")

    val myNo : Short = 23
    val myNo1 : Long = 23
    val myNo2 = 34838437483843874
    val myNo3 = 34838L
    val myFloat1 = 32.25 // by default it is double
    val myFloat2 : Float = 332.22F // I have to give F else error
    val myFloat3 = 348348.2 // it is Double automatically
    val myFloat = 2222.5F
    println(myFloat)
    val myBoolean: Boolean = true
    if (myBoolean)
        println("true")
    else
        println("false")

    val myCharValue: Char = 'D'
    println("$myCharValue")
    println(myCharValue)

    val myBoolean2 : Boolean = true
    println(myBoolean2)

    val myCharValue1: Char
//    println(myCharValue1)

    val kotlinVersion: KotlinVersion = KotlinVersion.CURRENT;
    println("Kotlin version is ${kotlinVersion}")
}