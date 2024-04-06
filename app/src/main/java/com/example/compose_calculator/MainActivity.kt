package com.example.compose_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose_calculator.ui.theme.Violet
import com.example.compose_calculator.ui.theme.Iris
import com.example.compose_calculator.ui.theme.YellowGold
import com.example.compose_calculator.ui.theme.compose_calculatorTheme

@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            compose_calculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing),
                    ) {
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            fontWeight = FontWeight.Light,
                            fontSize = 80.sp,
                            color = Color.White,
                            maxLines = 2
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "AC",
                                color = Iris,
                                modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ) {
                                viewModel.onAction(CalculatorActions.Clear)
                            }
                            CalculatorButton(
                                symbol = "Del",
                                color = Iris,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Delete)
                            }
                            CalculatorButton(
                                symbol = "/",
                                color = YellowGold,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Divide))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "7",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(7))
                            }
                            CalculatorButton(
                                symbol = "8",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(8))
                            }
                            CalculatorButton(
                                symbol = "9",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(9))
                            }
                            CalculatorButton(
                                symbol = "x",
                                color = YellowGold,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Multiply))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "4",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(4))
                            }
                            CalculatorButton(
                                symbol = "5",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(5))
                            }
                            CalculatorButton(
                                symbol = "6",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(6))
                            }
                            CalculatorButton(
                                symbol = "-",
                                color = YellowGold,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Subtract))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "1",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(1))
                            }
                            CalculatorButton(
                                symbol = "2",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(2))
                            }
                            CalculatorButton(
                                symbol = "3",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(3))
                            }
                            CalculatorButton(
                                symbol = "+",
                                color = YellowGold,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Add))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "0",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ) {
                                viewModel.onAction(CalculatorActions.Number(0))
                            }
                            CalculatorButton(
                                symbol = ".",
                                color = Violet,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Decimal)
                            }
                            CalculatorButton(
                                symbol = "=",
                                color = YellowGold,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalculatorActions.Calculate)
                            }
                        }
                    }
                }
            }
        }
    }
}