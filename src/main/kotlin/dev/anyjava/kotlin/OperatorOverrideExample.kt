package dev.anyjava.kotlin

data class SupplyAmount(val amount : Long)
data class SupplyAmountVar(var amount : Long)

operator fun SupplyAmount.plus(other: SupplyAmount) : SupplyAmount {
    return SupplyAmount(this.amount + other.amount)
}

operator fun SupplyAmountVar.plusAssign(other: SupplyAmountVar) {
    this.amount = this.amount + other.amount
}
