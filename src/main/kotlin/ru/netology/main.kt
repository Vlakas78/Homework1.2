package ru.netology


fun main(){

    val moneyTransfer = 10000
    val commision =  0.75 / 100
    val minCommission = 3500

    val amount = if (moneyTransfer * commision < minCommission)
        minCommission else moneyTransfer * commision

    println("Ваша комиссия составить: $amount  копеек")
}