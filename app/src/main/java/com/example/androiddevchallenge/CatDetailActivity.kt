/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.androiddevchallenge.model.Cat
import com.example.androiddevchallenge.ui.CatDetailScreen
import com.example.androiddevchallenge.ui.theme.MyTheme

class CatDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // get background color of selected cat item
        // get detail cat data
        val colorValue = intent?.getIntExtra("bgColor", 0)
        val cat = intent?.getSerializableExtra("cat") as? Cat
        setContent {
            MyTheme {
                val bgColor =
                    if (colorValue == null || colorValue == 0) MaterialTheme.colors.background
                    else Color(colorValue)
                CatDetail(bgColor, cat) { onBackPressed() }
            }
        }
    }
}

/**
 * display cat detail
 */
@Composable
fun CatDetail(bgColor: Color, cat: Cat?, onBack: () -> Unit) {
    Column() {
        // title
        TopAppBar(
            title = {
                Text(
                    text = cat?.name ?: "None",
                    style = MaterialTheme.typography.h5
                )
            },
            navigationIcon = {
                IconButton(onClick = onBack) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "back"
                    )
                }
            }
        )

        // display cat detail information
        Surface(
            color = bgColor,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            cat?.let {
                CatDetailScreen(it)
            }
        }
    }
}
