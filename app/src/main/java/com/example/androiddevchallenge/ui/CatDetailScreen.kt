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

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Cat

/**
 * manage cat detail information
 */
@Composable
fun CatDetailScreen(cat: Cat) {
    Column(modifier = Modifier.padding(16.dp)) {

        Row() {
            val image = painterResource(cat.imageId)

            // cat image shows on the left
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .size(150.dp, 150.dp),
                contentScale = ContentScale.Fit
            )

            // cat name, age and gender show on the right
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            ) {
                // cat breed
                Text(
                    text = "Breed: ${cat.breed}",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(16.dp)
                )

                // cat age
                Text(
                    text = "Age: ${cat.age}",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(16.dp)
                )

                // cat gender
                Text(
                    text = "Gender: ${cat.gender}",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        Spacer(Modifier.height(24.dp))

        // display long description,with round-cornered background
        // long description can scroll vertically
        Card(
            backgroundColor = colorResource(id = R.color.description_background_color),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            // description about this cat

            Text(
                text = "${cat.description}",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState()),
                style = MaterialTheme.typography.body1.copy(
                    fontSize = 18.sp,
                    letterSpacing = 1.5.sp
                )
            )
        }
    }
}
