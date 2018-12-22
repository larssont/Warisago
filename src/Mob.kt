import java.io.Serializable

data class Mob (
    val name: String,
    val hp: Int,
    val damage:Int,
    val blockAbility: Double,
    val exp: Int,
    val drop: Map<Item.Storable,Triple<Int,Double,Double>>
) : Serializable {
    var hpLeft = hp

}

