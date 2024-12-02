package com.d3h1.takemycall

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.d3h1.takemycall.ui.theme.TakeMyCallTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TakeMyCallTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "전화 받아",
                        style = MaterialTheme.typography.headlineLarge.copy(
                            color = MaterialTheme.colorScheme.onBackground,
                            fontWeight = FontWeight.W700
                        )
                    )
                }
            )
        },
        content = { paddingValues ->
            MainContent(paddingValues)
        }
    )
}

@Composable
fun MainContent(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SettingSection(
                icon = ImageVector.vectorResource(id = R.drawable.rounded_sound_detection_loud_sound_24),
                title = "오디오 설정",
                subtitle = "진동 모드",
                modifier = Modifier.weight(1f)
            )
            SettingSection(
                icon = ImageVector.vectorResource(id = R.drawable.rounded_do_not_disturb_on_total_silence_24),
                title = "방해 금지 모드",
                subtitle = "꺼짐",
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(0.5.dp)
                .background(MaterialTheme.colorScheme.outline)
        )
        TimerRow()
    }
}

@Composable
fun SettingSection(icon: ImageVector, title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(vertical = 13.5.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.Start
    ) {
        SettingRow(
            icon = icon,
            text = title,
            textColor = MaterialTheme.colorScheme.onSurface,
            iconTint = MaterialTheme.colorScheme.onSurface
        )
        SettingRow(
            icon = ImageVector.vectorResource(id = R.drawable.rounded_radio_button_unchecked_24),
            text = subtitle,
            textColor = MaterialTheme.colorScheme.outline,
            iconTint = MaterialTheme.colorScheme.outline
        )
    }
}

@Composable
fun SettingRow(icon: ImageVector, text: String, textColor: Color, iconTint: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            icon,
            contentDescription = text,
            tint = iconTint,
            modifier = Modifier.size(14.dp)
        )
        Text(
            text = text,
            style = MaterialTheme.typography.headlineSmall.copy(color = textColor)
        )
    }
}

@Composable
fun TimerRow() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.End
    ) {
        Text(
            text = "전화가 왔을 때, 사용자가 알아차리기 어려운 상태로 설정 되어 있다면, {}후 자동으로 전화를 받게돼요.",
            style = MaterialTheme.typography.headlineSmall.copy(color = MaterialTheme.colorScheme.onSurface)
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onSurface,
                contentColor = MaterialTheme.colorScheme.background
            )
        ) {
            Text(
                text = "시간 설정",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.W500)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TakeMyCallTheme {
        MainScreen()
    }
}