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
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Cat
import com.example.androiddevchallenge.model.CatData

/**
 * manage cat list
 */
@Composable
fun CatListScreen(navigationTo: (Cat, Color) -> Unit) {
    val catList = CatData().getCatList()
    CatList(
        cats = catList,
        onItemClick = { cat, backgroundColor -> navigationTo(cat, backgroundColor) }
    )
}

/**
 * display cat list
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun CatList(cats: List<Cat>, onItemClick: (Cat, Color) -> Unit) {
    // fixed background color of item
    val bgColors = listOf(
        colorResource(id = R.color.background_color_1),
        colorResource(id = R.color.background_color_2),
        colorResource(id = R.color.background_color_3)
    )

    // 2-column grid
    LazyVerticalGrid(cells = GridCells.Fixed(2)) {
        itemsIndexed(cats) { index, cat ->
            CatBriefItem(cat, bgColors[index % 3], onItemClick)
            CatDivider()
        }
    }
}

@Composable
private fun CatBriefItem(cat: Cat, backgroundColor: Color, onItemClick: (Cat, Color) -> Unit) {
    val image = painterResource(cat.imageId)
    Surface(color = backgroundColor) {
        Column(
            modifier = Modifier.clickable(onClick = { onItemClick(cat, backgroundColor) }),
        ) {
            Spacer(Modifier.height(16.dp))

            // circle cat image
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(150.dp, 150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            // cat name
            Text(
                text = "Name: ${cat.name}",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }
}

/**
 * Divider of list
 */
@Composable
private fun CatDivider() {
    /* Divider(
         modifier = Modifier.padding(start = 8.dp, top = 8.dp, bottom = 8.dp, end = 8.dp),
         color = MaterialTheme.colors.surface.copy(alpha = 0.08f)
     )*/
}
