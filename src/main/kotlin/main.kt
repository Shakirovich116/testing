package ru.netology

val amount = 100_000U
val last_amount = 0U
val visa_mir = 1U
val vk_pay = 1U
val maetro_master = 1U


fun  main () {

    Visa_Mir(amount, last_amount, visa_mir)
    Vk_Pay(amount, last_amount, vk_pay)
    Maetro_Master(amount, last_amount, maetro_master)
}

fun Visa_Mir(
    amount: UInt,
    last_amount: UInt,
    visa_mir: Any) {val calculation: UInt = amount * 75u / 100u / 100u
    val commission = if (calculation < 35u) {
        println("Ваша комиссия при переводе $amount рублей по карте Виза или мир составит: 35 рублей")
    }
    else println("Ваша коммиссия при переводе $amount рублей по карте Visa или Mir составит: $calculation рублей")
}

fun  Vk_Pay(
    amount: UInt,
    last_amount: UInt,
    Vk_pay: Any) { println("Ваша комиссия при переводе $amount рублей по системе VK pay составит: 0 рублей")
}

fun Maetro_Master(
    amount: UInt,
    last_amount: UInt,
    maetro_master: Any) {val calculation2: UInt = amount * 6u / 10u / 100u + 20u
    if (amount <= 75_000U)
        println("При переводе $amount по карте Maestro и Master коммисия не взымается")
    else println("Ваша коммися при переводе $amount рублей по карте Maestro и Master составила: $calculation2 рублей")
}