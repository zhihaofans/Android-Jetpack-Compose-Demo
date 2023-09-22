package me.zzhhoo.demo.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.orhanobut.logger.Logger
import me.zzhhoo.demo.ui.theme.DemoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            initView(Modifier.fillMaxWidth())

        }
    }
}

@Preview(showBackground = true)
@Composable
fun initView(modifier: Modifier = Modifier) {
    DemoTheme {
        MaterialTheme {
            // Material Components like Button, Card, Switch, etc.
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //getButton(text = "二维码", id = "button_qrcode")

                getListView()

            }
        }

    }
}

@Composable
fun getButton(
    text: String, id: String
) {
    Button(
        modifier = Modifier
            .layoutId(id), onClick = {
            /*TODO*/
            Logger.d(text, id)
        }, contentPadding = PaddingValues(
            start = 20.dp,
            top = 12.dp,
            end = 20.dp,
            bottom = 12.dp
        )
    ) {
        Text(text)
    }
}


@Composable
fun getListView() {
    LazyColumn {
        // Add a single item
        item {
            Button(modifier = Modifier
                .layoutId("button_qrcode"),
                onClick = { /*TODO*/ }) {
                Text("二维码")
            }
            Button(modifier = Modifier
                .layoutId("button_app"), onClick = { /*TODO*/ }) {
                Text("应用管理")
            }
            Button(modifier = Modifier
                .layoutId("button_feed"), onClick = { /*TODO*/ }) {
                Text("订阅")
            }
            Button(modifier = Modifier
                .layoutId("button_more"), onClick = { /*TODO*/ }) {
                Text("更多工具")
            }
        }
    }
}
