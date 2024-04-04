package com.example.compose_calculator

sealed class CalculatorOperations(val symbol: String) {
    data object Add: CalculatorOperations("+")
    data object Subtract: CalculatorOperations("-")
    data object Multiply: CalculatorOperations("*")
    data object Divide: CalculatorOperations("/")


}