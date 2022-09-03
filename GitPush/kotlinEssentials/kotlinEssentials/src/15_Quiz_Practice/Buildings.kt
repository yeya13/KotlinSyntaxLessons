package `15_Quiz_Practice`

open class BaseBuildingMaterial(){
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial(){
    override val numberNeeded = 4
}
class Brick : BaseBuildingMaterial(){
    override val numberNeeded = 8

}
class Building<T : BaseBuildingMaterial>(val material: T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = material.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${material::class.simpleName} required")
    }
}
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}


fun main(args: Array<String>) {
    Building(Wood()).build()
    isSmallBuilding(Building(Brick()))

}